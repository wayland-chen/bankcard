package com.offke.tradeunits.atoms.batch;

import com.offke.core.annotation.stereotype.Component;
import com.offke.core.annotation.stereotype.Item;
import com.offke.core.annotation.stereotype.Item.Nullable;
import com.offke.core.annotation.stereotype.Item.Type;
import com.offke.core.annotation.stereotype.Modified;
import com.offke.core.annotation.stereotype.Parameter;
import com.offke.core.bu.buffer.Globalservice;
import com.offke.core.standard.abstracts.Atom;
import com.offke.core.status.procedure.TradeInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(
        tradeCode = "60001104",
        tradeName = "日终结算-清理数据 ",
        author = "xiujuan.kong",
        comment = "日终结算 -清理数据(dayendbala)",
        createDate = "2012/05/09",
        params = {
                @Parameter(
                        classify = "日终结算-清理数据",
                        demo = "60001104",
                        inputs = {
                        },
                        outputs = {
                                @Item(nullable = Nullable.NO, id = "reasoncode", name = "提示返回码", type = Type.STRING, explain = "成功:00000,错误：500445"),
                                @Item(nullable = Nullable.NO, id = "reasonremark", name = "说明", type = Type.STRING, explain = "提示返回码的说明")
                        }
                )
        },
        modified = {@Modified}
)

public class F60001104 extends Atom {
    private static final Logger _logger = LoggerFactory.getLogger(F60001104.class);
    //设置交易中的全局参数
    String hi_settledate = null;

    //设置日志文件
    private String logName = "splus-audit";

    @Override
    public boolean atomicTransaction(TradeInfo tradeInfo) {

        try {
            //业务逻辑开始
            this.beginTransaction();

            //日终清理数据的日期
            hi_settledate = Globalservice.getSyspara().getSettleDate();  //结算日期


            //业务逻辑处理结束
            this.commitTransaction();

            //返回数据
            tradeInfo.putReason("zl_00000", "日终清理数据成功");
        } catch (Exception e) {
            this.rollbackTransaction();
            throw new RuntimeException(tradeInfo.getAtomInfo().getTradeName());
        }

        return true;
    }

    private boolean cleanMsgList() {
        //清理消息队列表成功数据
        String sqlStr = "";
        sqlStr += " delete from t_msglist where errcode = ? ";
        this.delete(sqlStr, 0);


        //清理消息队列中过期的数据
        sqlStr = "";
        sqlStr += " delete from t_msglist where transdate<=(select to_char(to_date(?,'yyyymmdd')-3,'yyyymmdd') from dual)";
        this.delete(sqlStr, hi_settledate);

        return true;
    }

    private boolean cleanRptAccBal() {
        String sqlStr = "";
        sqlStr += " delete from t_rptaccbal where accdate < ( select to_char(to_date(max(accdate),'yyyymmdd')-4,'yyyymmdd') from t_rptaccbal ) ";
        this.delete(sqlStr, null);
        return true;
    }

}
