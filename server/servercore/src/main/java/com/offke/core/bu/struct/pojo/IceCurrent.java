package com.offke.core.bu.struct.pojo;

import Ice.Current;
import icecomponent.CallBackServicePrx;

public class IceCurrent {
    private CallBackServicePrx proxy;
    private Current current;

    public IceCurrent(CallBackServicePrx proxy, Current current) {
        super();
        this.proxy = proxy;
        this.current = current;
    }

    public CallBackServicePrx getProxy() {
        return proxy;
    }

    public void setProxy(CallBackServicePrx proxy) {
        this.proxy = proxy;
    }

    public Current getCurrent() {
        return current;
    }

    public void setCurrent(Current current) {
        this.current = current;
    }

}
