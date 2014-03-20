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

import java.text.ParseException;
import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 13-4-24
 * Time: 下午4:54
 */

@Component(
        tradeCode = "2002",
        tradeName = "zentao个人日志报表",
        author = "phy",
        comment = "zentao个人日志报表",
        createDate = "2013-04-24",
        params = {
                @Parameter(classify = "禅道日志-报表",
                        demo = "2001",
                        inputs = {
                                @Item(nullable = Item.Nullable.NO, id = "zt_DateBegin", name = "开始日期", type = Item.Type.STRING, explain = "工作日志开始日期"),
                                @Item(nullable = Item.Nullable.NO, id = "zt_DateEnd", name = "结束日期", type = Item.Type.STRING, explain = "工作日志结束日期"),
                                @Item(nullable = Item.Nullable.NO, id = "sysClientTime", name = "客户端系统时间", type = Item.Type.STRING, explain = "客户端的操作系统时间")
                        },
                        outputs = {
                                @Item(nullable = Item.Nullable.NO, id = "columnHeader", name = "列头", explain = "列头名称"),
                                @Item(nullable = Item.Nullable.NO, id = "result", name = "查询返回结果集", explain = "客户信息查询返回结果集"),
                                @Item(nullable = Item.Nullable.NO, id = "reasoncode", name = "提示返回码", type = Item.Type.STRING, explain = "成功:0,其他为错误，具体内容看reasonremark"),
                                @Item(nullable = Item.Nullable.NO, id = "reasonremark", name = "说明", type = Item.Type.STRING, explain = "提示返回码的说明")
                        }
                )
        },
        modified = {@Modified}
)
public class F2002 extends Atom {
    private static final Logger _logger = LoggerFactory.getLogger(F2002.class);
    private static final String _Select = "SELECT deptname," +
            "IFNULL(realname,'total') AS 'name', " +
            " %1$s " +
            "SUM(IF(date='total',consumed,0)) AS total " +
            "FROM ( " +
            "  SELECT deptname,realname,IFNULL(date,'total') AS date,SUM(consumed) AS consumed " +
            "  FROM (select  b.deptname,b.realname ,a.date  ,a.consumed  from zt_effort a " +
            "    left join  (select u1.account,u1.realname,d1.name as deptname from zt_user u1 left join zt_dept d1 on u1.dept=d1.id) b on a.account=b.account " +
            "    where a.date between '%2$s' and '%3$s' " +
            "    ) t1  GROUP BY deptname,realname,date " +
            "  WITH ROLLUP " +
            "  HAVING realname IS NOT NULL " +
            ") AS A " +
            "GROUP BY realname " +
            "WITH ROLLUP " +
            "";

    @Override
    public boolean atomicTransaction(TradeInfo tradeInfo) {
        boolean resultValue = false;
        _logger.debug("Transaction begin (TradeCode={}),clientIP=[{}] ", tradeInfo.tradeCode(), tradeInfo.getConninfo().getRemoteIp());

        try {
            this.beginTransaction();
            //业务逻辑开始
            tradeInfo.wrap2First(AppConst.entity);

            //输入参数
            String dateBegin = tradeInfo.getString("zt_DateBegin");
            String dateEnd = tradeInfo.getString("zt_DateEnd");

            tradeInfo.putReason("9999", "业务处理失败");
            _logger.info("zt_DateBegin=[{}],zt_DateEnd=[{}]", dateBegin, dateEnd);

            String sqlStr = getSql(dateBegin, dateEnd);
            List<?> queryResult = this.jdbcQuery(sqlStr);
            int retCount = queryResult.size();

            tradeInfo.put("result", queryResult);
            //业务逻辑结束
            this.commitTransaction();
            if (retCount == 0) {
                tradeInfo.putReason("-1", "查询结果为空");
            } else {
                tradeInfo.putReason("0", "查询成功");
            }
        } catch (Exception e) {
            this.rollbackTransaction();
            e.printStackTrace();
            _logger.error("Transaction failure (TradeCode={}),error=[{}] ", tradeInfo.tradeCode(), e.getCause());
        }
        _logger.debug("Transaction end (TradeCode={}) ", tradeInfo.tradeCode());


        return resultValue;
    }

    private static String getSql(String dateBegin, String dateEnd) throws ParseException {
        //String tmp = "";
        Date currentDate = DateUtil.parseString(dateBegin, DateUtil.CHN_DATE_FORMAT);
        Date maxDate = DateUtil.parseString(dateEnd, DateUtil.CHN_DATE_FORMAT);

        String temp = "SUM(IF(date='%1$s',consumed,0)) AS '%1$s', ";
        StringBuffer stringBuffer = new StringBuffer();
        while (!currentDate.after(maxDate)) {
            _logger.debug("currdate is {}", currentDate);
            stringBuffer.append(String.format(temp, DateUtil.toString(currentDate, DateUtil.CHN_DATE_FORMAT)));

            currentDate = DateUtil.dateAdd(currentDate, 1);
        }
        _logger.debug("date sql is {}", stringBuffer);

        return String.format(_Select, stringBuffer.toString(), dateBegin, dateEnd);
    }

    public static void main(String args[]) {
        try {
            System.out.println(getSql("2012-03-12", "2012-03-15"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
