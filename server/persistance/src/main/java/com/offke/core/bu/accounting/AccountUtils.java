package com.offke.core.bu.accounting;

import com.offke.core.bu.exception.RDictionary;
import com.offke.core.bu.struct.entity.*;
import com.offke.core.common.util.Calculate;
import com.offke.core.common.util.Validate;
import com.offke.core.dao.OperateDB;
import org.hibernate.LockMode;
import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

/**
 * <p>与账务相关的工具类</p>
 *
 * @version 1.0
 * @since 2012/04/24
 */
public class AccountUtils {
    private static final Logger _logger = LoggerFactory.getLogger(AccountUtils.class);

    /**
     * <p>客户信息到帐务处理过程赋值</p>
     *
     * @param customer   客户信息
     * @param accprocess 帐务处理过程
     */
    public static void customerToAccprocess(TCustomer customer, Accprocess accprocess) {
        accprocess.setCustid(customer.getCustid());
        accprocess.setCustname(customer.getCustname());//客户名称
        accprocess.setStuempno(customer.getStuempno());//学工号
        accprocess.setDeptcode(customer.getDeptcode()); //部门代码
    }

    /**
     * <p>卡信息到帐务处理过程赋值</p>
     *
     * @param card       卡信息
     * @param accprocess 帐务处理过程
     */
    public static void cardToAccprocess(TCard card, Accprocess accprocess) {
        accprocess.setCardtype(card.getCardtype() != null ? card.getCardtype().intValue() : 0);
        accprocess.setCardphytype(card.getCardphytype() != null ? card.getCardphytype().intValue() : 0);
        accprocess.setFeetype(card.getFeetype() != null ? card.getFeetype().intValue() : 0);
        accprocess.setCardphyid(card.getCardphyid());
        accprocess.setCardno(card.getCardno() != null ? card.getCardno().intValue() : 0);
        accprocess.setShowcardno(card.getShowcardno());
        accprocess.setCardaccno(card.getAccno());
    }

    /**
     * <p>帐户信息到帐务处理过程赋值</p>
     *
     * @param account    帐户信息
     * @param accprocess 帐务处理过程
     */
    public static void accountToAccprocess(TAccount account, Accprocess accprocess) {
        accprocess.setCustid(account.getCustid() != null ? account.getCustid().intValue() : 0);
        accprocess.setCardno(account.getCardno() != null ? account.getCardno().intValue() : 0);
        accprocess.setCardaccno(account.getAccno()); //卡账户
    }

    /**
     * <p>获取交易流水</p>
     *
     * @param accprocess 帐务处理过程
     */
    public static TTransdtl getTransdtl(Accprocess accprocess) {
        TTransdtlId transdtlid = new TTransdtlId();
        TTransdtl transdtl = new TTransdtl(transdtlid);
        transdtlid.setAccdate(accprocess.getAccdate());
        transdtlid.setTermid(accprocess.getTermid());
        transdtlid.setTermseqno(accprocess.getTermseqno());
        transdtl.setAcctime(accprocess.getAcctime());
        transdtl.setTransdate(accprocess.getTransdate());
        transdtl.setTranstime(accprocess.getTranstime());
        transdtl.setTranscode(accprocess.getTranscode());
        transdtl.setCustid(accprocess.getCustid());
        transdtl.setCustname(accprocess.getCustname());
        transdtl.setStuempno(accprocess.getStuempno());
        transdtl.setShowcardno(Validate.isEmpty(accprocess.getShowcardno()) ? null : Long.valueOf(accprocess.getShowcardno()));
        transdtl.setCardno(accprocess.getCardno());
        transdtl.setPurseno(accprocess.getPurseno());
        transdtl.setCardcnt(accprocess.getAftdpscnt());//卡交易次数
        transdtl.setCardbefbal(accprocess.getCardbefbal() != null ? accprocess.getCardbefbal() : BigDecimal.ZERO);//交易前卡余额
        transdtl.setCardaftbal(accprocess.getCardaftbal() != null ? accprocess.getCardaftbal() : BigDecimal.ZERO);//交易后卡余额
        transdtl.setAmount(accprocess.getTotaltransamt() != null ? accprocess.getTotaltransamt() : BigDecimal.ZERO);//发生额
        transdtl.setOpercode(accprocess.getOpercode());//操作员
        transdtl.setPaytype(accprocess.getFundtype());//支付方式
        transdtl.setManagefee(accprocess.getTotalfeeamt() != null ? accprocess.getTotalfeeamt() : BigDecimal.ZERO);//管理费
        transdtl.setTransflag(accprocess.getTransflag());//1充值标志2消费次数
        transdtl.setAddamt(accprocess.getAddamt() != null ? accprocess.getAddamt() : BigDecimal.ZERO);//正为加负为减
        transdtl.setVoucherno(accprocess.getVoucherno());//凭证号码
        transdtl.setOfflineflag(accprocess.getOfflineflag());//脱机标志
        transdtl.setRevflag(String.valueOf(accprocess.getRevflag()));//冲正标志0-未冲正1-已冲正
        transdtl.setVoucherno(accprocess.getVoucherno());

        /***********begin自定义填写************/
        transdtl.setSysid(0);//系统编号
        transdtl.setDevphyid(null);//设备物理ID
        transdtl.setDevseqno(0);//设备流水号
        transdtl.setExtdata(null);//附加数据类型
        transdtl.setExtdata(null);//附加数据
        transdtl.setColdate(null);//采集日期
        transdtl.setColtime(null);//采集时间
        transdtl.setStatus(String.valueOf(RDictionary.DTLSTATUS_SUCCESS)); //记录状态1:未入账2-入账失败3-成功
        transdtl.setErrcode(0); //错误码
        /***********end自定义填写************/

        return transdtl;
    }

    /**
     * <p>提供精确的小数位四舍五入处理</p>
     *
     * @param v     需要四舍五入的数字
     * @param scale 小数点后保留几位
     * @return 四舍五入后的结果
     */

    public static double d4u5(double v, int scale) {
        if (scale < 0) {
            throw new RuntimeException("小数点后保留几位不能小于0");
        }

        BigDecimal b = new BigDecimal(Double.toString(v));
        BigDecimal one = new BigDecimal("1");
        return b.divide(one, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    /**
     * <p>将浮点数转换为整型</p>
     *
     * @param value 待处理数据
     * @return 结果
     */

    public static int d4u5(double value) {
        return (int) d4u5(value, 0);
    }

    /**
     * <p>金额比较,只精确到小数点后2位。</p>
     *
     * @param amt1 金额1
     * @param amt2 金额2
     * @return =0-atm1=atm2,>0-atm1>atm2,<0-atm1<atm2
     */

    public static int amtcmp(double amt1, double amt2) {
        long lAmt1 = (long) d4u5((amt1 * 100), 0);
        long lAmt2 = (long) d4u5((amt2 * 100), 0);
        long lAmt = lAmt1 - lAmt2;
        if (0 == lAmt) {
            return 0;
        } else if (lAmt < 0) {
            return -1;
        } else {
            return 1;
        }
    }

    /**
     * 待处理
     *
     * @param accno
     * @param amount
     * @return
     */
    public static boolean moveAccBal2Frozebal(Session session, String accno, BigDecimal amount) {
        // TODO Auto-generated method stub
        return true;
    }


    /**
     * <p>卡交易明细登记簿处理</p>
     *
     * @param session    hibernate Session
     * @param accprocess
     * @return
     */
    public static void saveCardTransInfo(Session session, Accprocess accprocess) {
        boolean updflag = true; //更新标志,true为更新数据库,false为插入数据库
        TCardtrans tCardtrans = OperateDB.get(session, TCardtrans.class, accprocess.getCardno(), LockMode.UPGRADE);
        if (tCardtrans == null) {
            updflag = false;
        }

        if (updflag) {
            //组装数据
            tCardtrans.setTransdate(accprocess.getTransdate());
            tCardtrans.setTranstime(accprocess.getTranstime());
            tCardtrans.setTranscode(accprocess.getTranscode());
            tCardtrans.setTermid(accprocess.getTermid());
            tCardtrans.setTermseqno(accprocess.getTermseqno());
            tCardtrans.setDpscnt(accprocess.getDpscnt());
            tCardtrans.setPaycnt(accprocess.getPaycnt());
            tCardtrans.setAmount(Calculate.subtract(accprocess.getCardaftbal(), accprocess.getCardbefbal()));
            tCardtrans.setCardbefbal(accprocess.getCardbefbal());
            tCardtrans.setCardaftbal(accprocess.getCardaftbal());
            tCardtrans.setUpdcnt(0);
            tCardtrans.setUpdtime(accprocess.getSysdatetime());
            session.update(tCardtrans);
        } else {
            tCardtrans = new TCardtrans();
            //组装数据
            tCardtrans.setCardno(accprocess.getCardno());
            tCardtrans.setTransdate(accprocess.getTransdate());
            tCardtrans.setTranstime(accprocess.getTranstime());
            tCardtrans.setTranscode(accprocess.getTranscode());
            tCardtrans.setTermid(accprocess.getTermid());
            tCardtrans.setTermseqno(accprocess.getTermseqno());
            tCardtrans.setDpscnt(accprocess.getDpscnt());
            tCardtrans.setPaycnt(accprocess.getPaycnt());
            tCardtrans.setAmount(Calculate.subtract(accprocess.getCardaftbal(), accprocess.getCardbefbal()));
            tCardtrans.setCardbefbal(accprocess.getCardbefbal());
            tCardtrans.setCardaftbal(accprocess.getCardaftbal());
            tCardtrans.setUpdcnt(0);
            tCardtrans.setUpdtime(accprocess.getSysdatetime());
            session.persist(tCardtrans);
        }
    }

    /**
     * <p>修改原交易流水明细的冲正标志</p>
     *
     * @param session           hibernate Session
     * @param transdtlTableName 交易明细流水表名
     * @param accdate           记账日期
     * @param termid            终端号
     * @param termseqno         终端流水号
     */
    public static boolean updateTransdtlHisRevFlag(Session session, String transdtlTableName, String accdate, Integer termid, Integer termseqno) {
        String sqlStr = " update " + transdtlTableName + " set revflag = '1' where accdate= ? and termid=? and  termseqno=? ";
        if (OperateDB.update(session, sqlStr, accdate, termid, termseqno) < 0) {
            _logger.error("修改历史交易流水明细失败");
            return false;
        }

        return true;
    }

    /**
     * <p>检查上送金额是整型还是浮点型</p>
     *
     * @param amt 金额
     * @return 0-整型 1-浮点型
     */
    public static int bigDecimalIsIntOrDouble(BigDecimal amt) {
        int flag = 0; //0-int 1-double

        String amtStr = amt.toString();
        if (amtStr.indexOf('.') != -1) {
            flag = 1;
        }
        return flag;
    }

}
