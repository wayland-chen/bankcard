package com.offke.core.communication.ice;

import Ice.Current;
import Ice.IPConnectionInfo;
import com.offke.core.bu.struct.pojo.IceCurrent;
import com.offke.core.bus.mix.IServiceasyn;
import com.offke.core.bus.mix.Servicecbwarp;
import com.offke.core.status.procedure.TradeInfo;
import icecomponent.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>ice调用的系统服务</p>
 *
 * @version 1.0
 * @since 2012/3/31
 */
public class SystemServiceImp extends _SystemServiceDisp {
    private static final Logger _logger = LoggerFactory.getLogger(SystemServiceImp.class);
    private static final long serialVersionUID = 1L;

    @Override
    public TradeBuffer atom(TradeBuffer tb, Current __current) throws SPlusException {
        TradeInfo tradeInfo = new TradeInfo();
        return ServiceAdapter.atom(tradeInfo, tb, __current);
    }

    @Override
    public void atomCallback(TradeBuffer tb, CallBackServicePrx proxy, Current __current) throws SPlusException {
        try {
            TradeInfo tradeInfo = new TradeInfo();
            IServiceasyn serviceasyn = new Servicecbwarp();
            try {
                tradeInfo.setLog(false);
                serviceasyn.regProxy(new IceCurrent(proxy, __current));
                tradeInfo.setCbservice(serviceasyn);
                ServiceAdapter.atom(tradeInfo, tb, __current);
            } catch (SPlusException e) {
                throw e;
            } finally {
                serviceasyn.complete(tradeInfo);
            }
        } catch (Throwable e) {
            _logger.error("AAAAAAAAAAAA", e);
        }
    }

    @Override
    public byte[] read(FileInfo fi, Current __current) throws SPlusException {
        return ServiceAdapter.read(fi, __current);
    }

    @Override
    public void write(byte[] bin, FileInfo fi, Current __current) throws SPlusException {
        ServiceAdapter.write(bin, fi, __current);
    }

    @Override
    public String getId(Current __current) {
        return ServiceAdapter.getId(__current);
    }

    @Override
    public IpInfo getIp(Current __current) {
        if (__current.con.getInfo() != null &&
                __current.con.getInfo() instanceof IPConnectionInfo) {
            IpInfo info = new IpInfo();
            info.localAddress = ((IPConnectionInfo) __current.con.getInfo()).localAddress;
            info.localPort = ((IPConnectionInfo) __current.con.getInfo()).localPort;
            info.remoteAddress = ((IPConnectionInfo) __current.con.getInfo()).remoteAddress;
            info.remotePort = ((IPConnectionInfo) __current.con.getInfo()).remotePort;
            return info;
        }
        return null;
    }

}
