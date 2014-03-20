package com.offke.tradeunits.atoms.aips.download;

import com.offke.core.AppConst;
import com.offke.core.annotation.stereotype.Component;
import com.offke.core.bu.struct.entity.TSubsystem;
import com.offke.core.common.util.JsonUtil;
import com.offke.core.common.util.SplusProperties;
import com.offke.core.standard.interfaces.IAtom;
import com.offke.core.status.procedure.TradeInfo;
import com.offke.tradeunits.atoms.mq.Down2aips;
import icecomponent.SPlusException;
import icecomponent.SystemServicePrx;
import icecomponent.SystemServicePrxHelper;
import icecomponent.TradeBuffer;

import java.util.Map;
import java.util.Properties;

/**
 * 连接到综合前置
 *
 * @version 1.0
 * @since 2012/05/21
 */
@Component(
        tradeCode = "subsys7",
        tradeName = "连接到综合前置",
        author = "jiangli",
        comment = "连接到综合前置",
        createDate = "2012/05/21",
        singleton = true,
        internal = true
)
public class Aipsice implements IAtom {
    private static Ice.Communicator ic;

    static {
        Ice.InitializationData initData = new Ice.InitializationData();
        initData.properties = getIceProperties(SplusProperties.getConfig());
        ic = Ice.Util.initialize(initData);
    }

    @Override
    public boolean atomicTransaction(TradeInfo tradeInfo) {
        TSubsystem subsystem = tradeInfo.get(Down2aips.Subsystem);
        Map<String, Object> message = tradeInfo.wrap2down(Down2aips.Message);
        String str = "WisdragonIceSync:default -h " + subsystem.getIp() + "   -p " + subsystem.getPort();
        final Ice.ObjectPrx base = ic.stringToProxy(str);

        try {
            SystemServicePrx systemSerivce = SystemServicePrxHelper.checkedCast(base);
            if (systemSerivce == null) {
                throw new RuntimeException("无效代理");
            }

            TradeBuffer tradebuffer = new TradeBuffer();
            tradebuffer.tradecode = tradeInfo.getString(AppConst.tradecode);
            tradebuffer.msg = JsonUtil.map2sjson(message);
            TradeBuffer rtradebuffer = systemSerivce.atom(tradebuffer);
            tradeInfo.rMsg(rtradebuffer.msg);
        } catch (SPlusException e) {
            throw new RuntimeException(e.reason + ":" + e.remark, e);
        }


        return true;
    }


    /**
     * 获取配置文件
     *
     * @param config
     * @return ice配置文件
     */
    public static Ice.Properties getIceProperties(Properties config) {
        Ice.Properties beforeProperties = Ice.Util.createProperties();
        beforeProperties.setProperty("Ice.MessageSizeMax", config.getProperty("Ice.MessageSizeMax"));
        beforeProperties.setProperty("Ice.ThreadPool.Server.Size", config.getProperty("Ice.ThreadPool.Server.Size"));
        beforeProperties.setProperty("Ice.ThreadPool.Server.SizeMax", config.getProperty("Ice.ThreadPool.Server.SizeMax"));

        return beforeProperties;
    }
}
