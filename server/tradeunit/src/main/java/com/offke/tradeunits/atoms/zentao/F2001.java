package com.offke.tradeunits.atoms.zentao;

import com.offke.core.AppConst;
import com.offke.core.annotation.stereotype.Component;
import com.offke.core.annotation.stereotype.Item;
import com.offke.core.annotation.stereotype.Modified;
import com.offke.core.annotation.stereotype.Parameter;
import com.offke.core.common.util.DateUtil;
import com.offke.core.standard.abstracts.Atom;
import com.offke.core.status.procedure.TradeInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Component(
        tradeCode = "2001",
        tradeName = "zentao个人日志处理",
        author = "phy",
        comment = "zentao个人日志处理，直接操作mysql数据库",
        createDate = "2013/4/1",
        params = {
                @Parameter(classify = "禅道日志-新增",
                        demo = "2001",
                        inputs = {
                                @Item(nullable = Item.Nullable.NO, id = "zt_account", name = "账户ID", type = Item.Type.STRING, explain = "禅道系统登录账户ID"),
                                @Item(nullable = Item.Nullable.NO, id = "zt_DATE", name = "日志日期", type = Item.Type.STRING, explain = "工作日志发生日"),
                                @Item(nullable = Item.Nullable.NO, id = "zt_WORK", name = "日志内容", type = Item.Type.STRING, explain = "工作日志内容"),
                                @Item(nullable = Item.Nullable.NO, id = "zt_consumed", name = "花费工时", type = Item.Type.STRING, explain = "实际花费的工时"),
                                @Item(nullable = Item.Nullable.NO, id = "sysClientTime", name = "客户端系统时间", type = Item.Type.STRING, explain = "客户端的操作系统时间")
                        },
                        outputs = {
                                @Item(nullable = Item.Nullable.NO, id = "reasoncode", name = "提示返回码", type = Item.Type.STRING, explain = "成功:0,其他为错误，具体内容看reasonremark"),
                                @Item(nullable = Item.Nullable.NO, id = "reasonremark", name = "说明", type = Item.Type.STRING, explain = "提示返回码的说明")
                        }
                )
        },
        modified = {@Modified}
)
public class F2001 extends Atom {
    private static final Logger _logger = LoggerFactory.getLogger(F2001.class);
    private static final String _Insert = "INSERT INTO `zt_effort` (`company`, `objectType`, `objectID`, `product`, `project`, `account`, `WORK`,`DATE`, `LEFT`, `consumed`, `BEGIN`, `END`) " +
            "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    @Override
    public boolean atomicTransaction(TradeInfo tradeInfo) {
        _logger.info("Transaction begin (TradeCode={}) ,clientIP=[{}] ", tradeInfo.tradeCode(), tradeInfo.getConninfo().getRemoteIp());
        try {
            this.beginTransaction();
            //业务逻辑开始
            tradeInfo.wrap2First(AppConst.entity);

            String zt_company = "1";
            String zt_objectType = "custom";
            String zt_objectID = "0";
            String zt_product = ",0,";
            String zt_project = "0";
            String zt_account = tradeInfo.getString("zt_account");
            String zt_WORK = tradeInfo.getString("zt_WORK");
            String zt_DATE = (tradeInfo.getString("zt_DATE").trim()).isEmpty() ?
                    DateUtil.getCurrentDate(DateUtil.CHN_DATE_FORMAT) : tradeInfo.getString("zt_DATE");
            String zt_LEFT = "0";
            String zt_consumed = tradeInfo.getString("zt_consumed");
            String zt_BEGIN = "0";
            String zt_END = "0";
            tradeInfo.putReason("9999", "业务处理失败");
            _logger.info("zt_account=[{}],zt_WORK=[{}],zt_consumed=[{}],zt_DATE=[{}]", zt_account, zt_WORK, zt_consumed, zt_DATE);


            //输入参数
            //<inputs name=default>
            this.save(_Insert, zt_company, zt_objectType, zt_objectID, zt_product, zt_project, zt_account, zt_WORK, zt_DATE,
                    zt_LEFT, zt_consumed, zt_BEGIN, zt_END);

            //业务逻辑结束
            this.commitTransaction();
            tradeInfo.putReason("0", "业务处理成功");
        } catch (Exception e) {
            this.rollbackTransaction();
            _logger.error("Transaction failure (TradeCode={}),error=[{}] ", tradeInfo.tradeCode(), e);
            throw new RuntimeException(tradeInfo.getAtomInfo().getTradeName());
        }
        _logger.debug("Transaction end (TradeCode={}) ", tradeInfo.tradeCode());

        return true;
    }

    public static void main(String[] args) {

        System.out.println("a".isEmpty() ? DateUtil.getCurrentDate(DateUtil.CHN_DATE_FORMAT) : "aaa");
    }
}