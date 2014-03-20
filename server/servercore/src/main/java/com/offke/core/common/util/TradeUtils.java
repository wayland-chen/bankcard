package com.offke.core.common.util;

import com.offke.core.AppConst;
import com.offke.core.dao.CommonQuery;
import com.offke.core.status.procedure.DateSource;
import com.offke.core.status.procedure.TradeInfo;
import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <p>校园通与交易相关的共用的静态方法</p>
 *
 * @version 1.0
 * @since 2012/4/21
 */
public final class TradeUtils {
    private static final Logger _logger = LoggerFactory.getLogger(TradeUtils.class);


    /**
     * <p>判断同一个客户不能发行   同一种类型的卡</p>
     *
     * @param session     数据库session
     * @param custid      客户编号
     * @param cardphytype 卡物理类型
     * @return true:可以发行，false:不可以发行
     * @throws RuntimeException
     */
    public static boolean checkExistsMoreCard(Session session, int custid, int cardphytype) throws RuntimeException {
        List<?> ret =
                CommonQuery
                        .sqlQuery(
                                session,
                                "select 1 from T_Card where custid = ? and status='1' and lossflag='0' and badflag='0' and cardphytype=?",
                                custid,
                                cardphytype);
        if (ret == null || ret.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 检查用户密码是否正确.<br/>
     * 用户名密码匹配正确返回true,否则返回false.
     *
     * @param session
     * @param opercode 用户ID
     * @param password 用户密码（加密后）
     * @return boolean
     * @since v1.00
     */
    public static boolean checkOperPwd(Session session, String opercode, String password) {

        List<?> ret =
                CommonQuery
                        .sqlQuery(
                                session,
                                "select count(*) as cnt from T_OPERATOR where opercode = ? and status='1' and operpwd=?",
                                opercode,
                                password);
        if (ret != null && !ret.isEmpty()) {
            Map<?, ?> retMap = (Map<?, ?>) ret.get(0);
            //        	long ho_card_type_id = ( Long ) ret.get( 0 );
            long ho_card_type_id =
                    retMap.get("cnt".toUpperCase()) != null
                            ? Long
                            .valueOf(
                                    retMap
                                            .get(
                                                    "cnt"
                                                            .toUpperCase())
                                            .toString())
                            .longValue()
                            : 0;
            if (ho_card_type_id > 0) {
                return true;
            }
        }
        return false;
    }

    /**
     * 通过学工号，查找状态正常的客户信息对应的客户号。
     *
     * @param session  数据库session
     * @param stuempno 学工号
     * @return 客户号
     * @author wuping.sun
     */
    public static int GetCustidByStuempno(Session session, String stuempno) {

        int custid = 0;
        List<?> ret =
                CommonQuery.hsqlQuery(
                        session,
                        "select custid from TCustomer where status=1 and stuempno=? ",
                        stuempno);
        if (ret != null && !ret.isEmpty()) {
            Integer id = (Integer) ret.get(0);
            custid = id.intValue();
        }
        return custid;
    }

    /**
     * <p>依据两个key生成hashkey</p>
     *
     * @param key1 值1
     * @param key2 值2
     * @return 键值
     */
    public static String makeHashkey(long key1, long key2) {
        return String.valueOf(key1) + String.valueOf((key2));
    }

    /**
     * 解析前台专入的entity实体,解析节点为：entity. <br>
     * <p/>
     * <p/>
     *
     * @param <T>
     * @param tradeInfo
     * @param class1
     * @param jsonNodeName 为传入默认为:params-->entity节点,传入params不变
     * @return  实体存放的节点格式为:<code>
     * {
     * "CMD": {
     * "appver": "v1.0",
     * "tradeid": "f5f179874b7b446fb084fe7e3008b78d",
     * "src": "splusclient",
     * "des": "splusserver",
     * "tradecode": "10002100",
     * "workdate": "2012-04-13"
     * },
     * "DATA": {
     * "func": "10002100",
     * "opttype": "Q",
     * "params": {
     * "conds": {},
     * "entity": {
     * "branchno": 100,
     * "areacode": "2",
     * "branchname": "校园卡管理中心",
     * "branchtype": "1",
     * "status": "1",
     * "opendate": "20090615"
     * }
     * }
     * }
     * }
     * </code>
     * @since v1.00
     */
    public static <T> T getEntity(TradeInfo tradeInfo, Class<T> class1, String... jsonNodeName) {

        Map tmp = null;
        if (jsonNodeName != null && jsonNodeName.length > 1) {
            tmp = tradeInfo.get(jsonNodeName[0]);
            for (int i = 1; i < jsonNodeName.length; i++) {
                tmp = (Map) tmp.get(jsonNodeName[i]);
            }
        } else if (jsonNodeName.length == 1) {
            tmp = tradeInfo.get(jsonNodeName[0]);
        } else {
            Map params = tradeInfo.get("params");
            if (params != null) {
                tmp = (Map) params.get("entity");
            }
        }

        if (tmp == null) {
            tmp = new HashMap();
        }

        return ObjectMapper.map(tmp, class1);
    }


    /**
     * <p>判断卡是否到到期日期</p>
     *
     * @param expiredate 到期日期
     * @return true：到期，false:未到期
     */
    public static boolean checkExpiredateOfCard(String expiredate) {
        Date dExpiredate = DataTransition.strToDate(expiredate, AppConst.DatePattern1);
        //       _logger.info( DateSource.getTradedate( ) );
        if (dExpiredate.after(DateSource.getTradedate())) {
            return false;
        } else {
            return true;
        }
    }


    /**
     * 判断客户是否有其他正常的卡
     *
     * @param session 数据库Session
     * @param custid  客户号
     * @param cardno  卡号
     * @return true:存在，false:不存在
     */
    public static boolean isExistOtherNormalCardByCustid(Session session, Integer custid, Integer cardno) {
        List<?> ret =
                CommonQuery
                        .sqlQuery(
                                session,
                                "SELECT 1 FROM T_CARD WHERE status = '1'   and  custid =? and cardno=? and lossflag='0' and badflag='0'",
                                custid,
                                cardno);
        return !(ret == null || ret.isEmpty());
    }


    /**
     * <p>通过设备ID获得商户号</p>
     *
     * @param session   hibernate Session
     * @param deviceid  设备号
     * @param transdate 交易日期
     * @param transtime 交易时间
     */
    public static int getShopidByDeviceid(Session session, Integer deviceid, String transdate, String transtime) {
        int shopid = 0;
        String sqlStr = "";
        sqlStr += " select shopid";
        sqlStr += " from t_shoppos a,(select min(endtime) endtime from t_shoppos";
        sqlStr += " where deviceid=? and startdate <= ?";
        sqlStr += " and enddate >= ? and endtime >= ?) b";
        sqlStr += " where a.endtime=b.endtime and  a.deviceid=?";
        sqlStr += " and  a.startdate <= ? and a.enddate >= ?";

        List<?> resultList =
                CommonQuery.sqlQuery(
                        session,
                        sqlStr,
                        deviceid,
                        transdate,
                        transdate,
                        transtime,
                        deviceid,
                        transdate,
                        transdate);
        if (resultList == null || resultList.isEmpty() || resultList.size() != 1) {
            shopid = 0;
        } else {
            Map<?, ?> resultMap = (Map<?, ?>) resultList.get(0);
            shopid = Integer.valueOf(resultMap.get("SHOPID").toString()).intValue();
        }
        return shopid;
    }

    /**
     * <p>通过记账日期获得交易流水明细表名</p>
     *
     * @param session hibernate Session
     * @param accdate 记账日期
     */
    public static String getTransdtlTableName(Session session, String accdate) {
        String transdtlName = null;
        String sqlStr = "";
        sqlStr += " select Nvl(min(TABLE_NAME),'T_TRANSDTL') as tablename  from user_tables ";
        sqlStr += " where table_name like 'T_TRANSDTL%' and table_name <> 'T_TRANSDTL' ";
        sqlStr += " and substr(table_name,11,8) >= ?";

        List<?> resultList = CommonQuery.sqlQuery(session, sqlStr, accdate);
        if (resultList == null || resultList.isEmpty()) {
            transdtlName = "T_TRANSDTL";
        } else {
            Map<?, ?> resultMap = (Map<?, ?>) resultList.get(0);
            transdtlName = resultMap.get("TABLENAME").toString();
        }

        return transdtlName;
    }


    /**
     * 根据strdate，返回隔了day天之后的日期。
     *
     * @param strdate 日期yyyyMMdd字符串
     * @param day     天数
     * @return 日期yyyyMMdd字符串
     */
    public static String calcEndDate(String strdate, int day) {
        SimpleDateFormat ORA_DATE_FORMAT = new SimpleDateFormat("yyyyMMdd");
        Date date = null;
        try {
            date = (Date) ORA_DATE_FORMAT.parse(strdate);
        } catch (ParseException e) {
            e.printStackTrace();
            _logger.info(e.getMessage());

        }

        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, day);

        return ORA_DATE_FORMAT.format(cal.getTime());
    }


}
