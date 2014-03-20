package com.offke.tradeunits.atoms.batch;

import com.offke.core.annotation.stereotype.Component;
import com.offke.core.annotation.stereotype.Item;
import com.offke.core.annotation.stereotype.Item.Nullable;
import com.offke.core.annotation.stereotype.Item.Type;
import com.offke.core.annotation.stereotype.Modified;
import com.offke.core.annotation.stereotype.Parameter;
import com.offke.core.bu.struct.entity.TPosdtl;
import com.offke.core.bu.struct.entity.TPosdtlId;
import com.offke.core.common.util.Calculate;
import com.offke.core.common.util.SessionUtil;
import com.offke.core.standard.abstracts.Atom;
import com.offke.core.status.procedure.TradeInfo;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Map;

@Component(
        tradeCode = "60001106",
        tradeName = "定时任务-数字国兴设备中途拔卡异常流水处理",
        author = "xiujuan.kong",
        comment = "数字国兴设备中途拔卡异常流水处理",
        createDate = "2012/10/18",
        params = {
                @Parameter(
                        classify = "数字国兴设备中途拔卡异常流水处理",
                        demo = "60001106",
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

public class F60001106 extends Atom {
    private static final Logger _logger = LoggerFactory.getLogger(F60001106.class);
    private String logName = "splus-auditException";

    @Override
    public boolean atomicTransaction(TradeInfo tradeInfo) {

        try {
            //业务逻辑开始
            this.beginTransaction();


            //获取数字国兴设备中途拔卡异常流水信息
            String sql = "";
            sql += " SELECT * FROM t_posdtl";
            sql += " WHERE devphyid IN ";
            sql += "( ";
            sql += " SELECT devphyid FROM t_device WHERE devphytype = 1011 and status = '1' ";
            sql += " ) ";
            sql += " AND status = '2' AND transmark = 2 ";
            sql += " ORDER BY transdate,devphyid,devseqno,cardno ";
            Statement statement = this.getConnection().createStatement();
            ResultSet resultSet = null;
            try {
                resultSet = statement.executeQuery(sql);

                while (resultSet.next()) {
                    //获取POS流水明细
                    TPosdtlId tPosdtlId = new TPosdtlId();
                    tPosdtlId.setCardno(resultSet.getInt("cardno"));
                    tPosdtlId.setDevphyid(resultSet.getString("devphyid"));
                    tPosdtlId.setDevseqno(resultSet.getInt("devseqno"));
                    tPosdtlId.setTransdate(resultSet.getString("transdate"));
                    TPosdtl tPosdtl = this.get(TPosdtl.class, tPosdtlId, LockMode.UPGRADE);

                    //获取下一笔流水交易前卡余额
                    BigDecimal nextCardbefbal = getNextTransCardbal(tPosdtl.getId().getCardno(), tPosdtl.getCardcnt());
                    if (nextCardbefbal == null) {
                        _logger.info("下一笔交易流水未上送");
                        continue;
                    }

                    //计算中途拔卡交易的出卡值
                    BigDecimal cardaftbal = Calculate.subtract(tPosdtl.getCardbefbal(), tPosdtl.getAmount());
                    //如果当前流水出卡值不等于下一笔流水的入卡值，则说明该流水无效
                    if (Calculate.amtcmp(cardaftbal, nextCardbefbal) != 0) {
                        continue;
                    }

                    //修改pos流水信息
                    tPosdtl.setTransmark(153);
                    tPosdtl.setCardaftbal(cardaftbal);

                    //操作数据库
                    try {
                        this.update(tPosdtl);

                        //提交事务
                        this.commitTransaction();

                    } catch (Exception e) {
                        //回滚事务
                        this.rollbackTransaction();
                    } finally {
                        //开始事务
                        this.beginTransaction();
                    }

                }  //end while
            } finally {
                SessionUtil.closeResultSet(resultSet);
                SessionUtil.closeStatement(statement);
            }

            //返回数据
            tradeInfo.putReason("zl_00000", "数字国兴设备中途拔卡异常流水处理成功");

            //业务逻辑结束
            this.commitTransaction();
        } catch (Exception e) {
            this.rollbackTransaction();
        }


        return true;
    }

    private BigDecimal getNextTransCardbal(int cardno, int cardcnt) {
        BigDecimal bal = BigDecimal.ZERO;

        //获取卡余额
        String sqlStr = "";
        sqlStr += "  select cardbefbal from ";
        sqlStr += " ( ";
        sqlStr += " select cardbefbal from v_recenttransdtl ";
        sqlStr += " where cardno = ? and cardcnt = ? order by transdate,devphyid,devseqno ";
        sqlStr += " ) ";
        sqlStr += "  where rownum<=1 ";
        List<?> retList = this.sqlQuery(sqlStr, cardno, cardcnt);
        if (retList == null || retList.isEmpty()) {
            return null;
        }

        Map<?, ?> retMap = (Map<?, ?>) retList.get(0);
        bal = retMap.get("cardbefbal".toUpperCase()) != null ? new BigDecimal(retMap.get("cardbefbal".toUpperCase()).toString()) : null;

        return bal;
    }

}
