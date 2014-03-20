/*
 * AbstractAtom.java  v1.00  2012-4-9
 * Peoject	com.wisdragon.splus-atom
 * Copyright (c) 2012 Wisdragon
 *
 * Filename	:	AbstractAtom.java  v1.00 2012-4-9
 * Project	: 	com.wisdragon.splus-atom
 * Copyight	:	Copyright (c) 2012 Wisdragon
 */
package com.offke.core.standard.abstracts;


import com.offke.core.common.util.CrudType;
import com.offke.core.common.util.TradeUtils;
import com.offke.core.common.util.Validate;
import com.offke.core.status.procedure.TradeInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 原子交易抽象骨架实现类.
 *
 * @author <a href="mailto:genliang.jiang@wisdragon.com">蒋根亮</a>
 * @version v1.00
 * @since 1.00 2012-4-9
 */
public abstract class AbstractAtom extends Atom {
    private static final Logger _logger = LoggerFactory.getLogger(AbstractAtom.class);

    @Override
    public boolean atomicTransaction(TradeInfo tradeInfo) {
        _logger.info("Begin TradeCode[{}]", tradeInfo.tradeCode());

        try {
            String opttype = (String) tradeInfo.get("opttype");

            if (Validate.isEmpty(opttype)) {
                throw new RuntimeException("操作类型不能为空");
            }

            _logger.debug("【opttype=" + opttype + "】");

            CrudType eopttype = null;
            boolean isfind = true;
            try {
                eopttype = Enum.valueOf(CrudType.class, opttype);
            } catch (IllegalArgumentException e) {
                isfind = false;
            }

            if (isfind) {
                switch (eopttype) {
                    // 新增
                    case A:
                        add(tradeInfo);
                        break;
                    // 更新
                    case U:
                        modify(tradeInfo);
                        break;
                    // 查询
                    case Q:
                        query(tradeInfo);
                        break;
                    // 删除
                    case D:
                        delete(tradeInfo);
                        break;
                    // 批量删除
                    case DA:
                        deleteBatch(tradeInfo);
                        break;
                    // 查看详情
                    case DETAIL:
                        detail(tradeInfo);
                        break;
                    // 审核
                    case V:
                        audit(tradeInfo);
                        break;
                    // 批量修改
                    case UA:
                        updateBatch(tradeInfo);
                        break;
                    // 导入
                    case I:
                        iport(tradeInfo);
                        break;
                    // 绑定
                    case B:
                        bind(tradeInfo);
                        break;
                    //审核拒绝
                    case R:
                        auditreject(tradeInfo);
                        break;
                    //撤销
                    case REVOKE:
                        revoke(tradeInfo);
                        break;
                    // 默认记录日志
                }
            } else {
                return conjunction(tradeInfo);
            }

        } catch (Exception e) {
            _logger.info("Failure TradeCode[{}]", tradeInfo.tradeCode(), e);
            throw new RuntimeException(tradeInfo.getAtomInfo().getTradeName());
        }

        _logger.info("Success TradeCode[{}]", tradeInfo.tradeCode());

        return true;
    }

    /**
     * 其它操作类弄处理 ,子类重写
     *
     * @param tradeInfo
     * @return 是否成功
     */
    protected boolean conjunction(TradeInfo tradeInfo) {
        throw new RuntimeException("请实现链接的原子方法");
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
     * @return
     * @remark 实体存放的节点格式为:<code>
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
    public <T> T getEntity(TradeInfo tradeInfo, Class<T> class1, String... jsonNodeName) {
        return (T) TradeUtils.getEntity(tradeInfo, class1, jsonNodeName);
    }

    protected void add(TradeInfo tradeInfo) throws RuntimeException {
        // TODO 需实现.
    }

    protected void modify(TradeInfo tradeInfo) throws RuntimeException {
        // TODO 需实现.
    }

    /**
     * 默认查询方法，不带实现体，需子类override.
     * <p/>
     * 客户端调用需传入条件体如下： <code>
     * {
     * "func": "10002100",
     * "opttype": "Q",
     * "params": {
     * "conds": {},
     * "entity": {
     * "colum1": 100,
     * "colum2": "value2"
     * }
     * }
     * }
     * </code>
     *
     * @param tradeInfo
     * @throws RuntimeException
     * @since v1.00
     */
    protected void query(TradeInfo tradeInfo) throws RuntimeException {
        // TODO 需实现.
    }

    protected void delete(TradeInfo tradeInfo) throws RuntimeException {
        // TODO 需实现.
    }

    protected void deleteBatch(TradeInfo tradeInfo) throws RuntimeException {
        // TODO 需实现.
    }

    /**
     * 查看詳情.<br/>
     * <p/>
     * 需傳入主鍵
     *
     * @param tradeInfo
     * @since v1.00
     */
    protected void detail(TradeInfo tradeInfo) {
        // TODO 需实现.
    }

    protected void audit(TradeInfo tradeInfo) throws RuntimeException {
        // TODO 需实现.
    }

    protected void updateBatch(TradeInfo tradeInfo) throws RuntimeException {
        // TODO 需实现.
    }

    protected void iport(TradeInfo tradeInfo) throws RuntimeException {
        // TODO 需实现.
    }

    protected void bind(TradeInfo tradeInfo) throws RuntimeException {
        // TODO 需实现.
    }

    protected void auditreject(TradeInfo tradeInfo) throws RuntimeException {
        // TODO 需实现
    }

    protected void revoke(TradeInfo tradeInfo) throws RuntimeException {
        // TODO 需实现
    }

}
