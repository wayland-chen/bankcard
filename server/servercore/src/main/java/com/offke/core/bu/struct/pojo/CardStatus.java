package com.offke.core.bu.struct.pojo;

public enum CardStatus {
    CS_NORMAL, // 卡状态正常
    CS_LOST, // 卡状态挂失
    CS_FROZEN, // 卡状态冻结
    CS_BAD, // 卡状态坏卡
    CS_LOCKED, // 卡状态锁定

    CS_CLOSED, // 卡状态注销
    CS_UNLOST, // 卡状态未挂失
    CS_UNFROZEN, // 卡状态未冻结
    CS_UNBAD, // 卡状态非坏卡
    CS_UNLOCKED, // 卡状态未锁定

    CS_EXPIREDATE, // 卡有效期
    CS_LOSSDATE, // 卡挂失时间
    CS_FROZEDATE, // 卡冻结时间
    CS_BADDATE, // 卡登记坏卡时间
    CS_LOCKDATE, // 卡锁定时间
    CS_OPENDATE, // 开卡时间
    CS_CLOSEDATE, // 注销时间
}
