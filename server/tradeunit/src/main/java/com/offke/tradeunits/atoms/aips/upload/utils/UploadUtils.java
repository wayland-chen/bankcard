package com.offke.tradeunits.atoms.aips.upload.utils;

import com.offke.tradeunits.atoms.aips.upload.storage.ConsumerInfos;

import java.math.BigDecimal;
import java.util.Map;

public class UploadUtils {

    public static boolean getConsumerInfos(Map<?, ?> retMap, ConsumerInfos consumerinfos) {
        consumerinfos.setCardno(retMap.get("cardno") != null ? Integer.valueOf(retMap.get("cardno").toString()) : Integer.valueOf(0));//卡号
        consumerinfos.setCardbefbal(retMap.get("bcardbal") != null ? new BigDecimal(retMap.get("bcardbal").toString()) : BigDecimal.ZERO); //交易前卡余额
        consumerinfos.setAmount(retMap.get("amount") != null ? new BigDecimal(retMap.get("amount").toString()) : BigDecimal.ZERO);//交易金额
        consumerinfos.setCardaftbal(retMap.get("acardbal") != null ? new BigDecimal(retMap.get("acardbal").toString()) : BigDecimal.ZERO); //交易后卡余额
        consumerinfos.setTradedate(retMap.get("tradedate") != null ? retMap.get("tradedate").toString() : " ");//交易日期和时间
        consumerinfos.setPursesn(retMap.get("pursesn") != null ? Integer.valueOf(retMap.get("pursesn").toString()) : Integer.valueOf(0)); //钱包流水号
        consumerinfos.setPossn(retMap.get("possn") != null ? Integer.valueOf(retMap.get("possn").toString()) : Integer.valueOf(0)); //pos流水号
        consumerinfos.setSrcpossn(retMap.get("srcpossn") != null ? Integer.valueOf(retMap.get("srcpossn").toString()) : Integer.valueOf(0)); //原pos流水号
        consumerinfos.setOpercode(retMap.get("opercode") != null ? retMap.get("opercode").toString() : " "); //本笔交易的操作员卡号
        consumerinfos.setTermno(retMap.get("termno") != null ? Integer.valueOf(retMap.get("termno").toString()) : Integer.valueOf(0));//终端序列号
        consumerinfos.setFee(retMap.get("fee") != null ? new BigDecimal(retMap.get("fee").toString()) : BigDecimal.ZERO);//交易金额
        consumerinfos.setShopid(retMap.get("shopid") != null ? Integer.valueOf(retMap.get("shopid").toString()) : Integer.valueOf(0));//商户号
        consumerinfos.setPurseindex(retMap.get("purseindex") != null ? Integer.valueOf(retMap.get("purseindex").toString()) : Integer.valueOf(0)); //钱包索引号
        consumerinfos.setTransmark(retMap.get("transtype") != null ? Integer.valueOf(retMap.get("transtype").toString()) : Integer.valueOf(0)); //交易类型
        consumerinfos.setConsumptionmode(retMap.get("consumptionmode") != null ? Integer.valueOf(retMap.get("consumptionmode").toString()) : Integer.valueOf(0)); //消费模式
        consumerinfos.setMac(retMap.get("mac") != null ? retMap.get("mac").toString() : " ");//校验
        return true;
    }
}
