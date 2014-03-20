package com.offke.core.bus.mix;

import Ice.Current;
import com.offke.core.bu.struct.pojo.IceCurrent;
import com.offke.core.common.mgr.BeanProxy;
import com.offke.core.messages.pack.JsonDefaultPack;
import com.offke.core.status.procedure.TradeInfo;
import icecomponent.CallBackServicePrx;
import icecomponent.SPlusException;
import icecomponent.TradeBuffer;

public class Servicecbwarp implements IServiceasyn {
    private CallBackServicePrx proxy;

    @Override
    public void before(TradeInfo tradeInfo) {
        JsonDefaultPack pack = BeanProxy.lookupBean("jsondefaultpack");
        pack.handle(tradeInfo);
    }

    @Override
    public boolean mix(TradeInfo tradeInfo) {
        tradeInfo.sMsg(null);
        this.before(tradeInfo);
        TradeBuffer retTb = new TradeBuffer();
        retTb.msg = tradeInfo.sMsg();
        try {
            proxy.action(retTb, tradeInfo.hasPack());
        } catch (SPlusException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(tradeInfo.getTradeCode());
        } finally {
            this.after(tradeInfo);
        }
        return true;
    }

    @Override
    public void regProxy(Object proxy) {
        this.proxy = ((IceCurrent) proxy).getProxy();
        //Current current = ((IceCurrent) proxy).getCurrent();
    }


    @Override
    public void after(TradeInfo tradeInfo) {
        tradeInfo.puts().clear();
    }

    @Override
    public void complete(TradeInfo tradeInfo) {
        TradeBuffer retTb = new TradeBuffer();
        retTb.msg = tradeInfo.sMsg();
        try {
            proxy.action(retTb, tradeInfo.hasPack());
        } catch (SPlusException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(tradeInfo.getTradeCode());
        } finally {
            this.after(tradeInfo);
        }
        /*
        if ( this.current != null  )
        {
            this.current.adapter.getCommunicator( ).shutdown( );
        }*/
    }

}
