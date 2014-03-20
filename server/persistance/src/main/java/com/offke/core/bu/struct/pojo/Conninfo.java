package com.offke.core.bu.struct.pojo;

/**
 * 通信连接信息
 *
 * @version 1.0
 * @since 2012/06/17
 */
public class Conninfo {
    public String localIp;
    public Integer localPort;
    public String localMac;

    public String remoteIp;
    public Integer remotePort;
    public String remoteMac;

    public String getLocalIp() {
        return localIp;
    }

    public void setLocalIp(String localIp) {
        this.localIp = localIp;
    }

    public Integer getLocalPort() {
        return localPort;
    }

    public void setLocalPort(Integer localPort) {
        this.localPort = localPort;
    }

    public String getRemoteIp() {
        return remoteIp;
    }

    public void setRemoteIp(String remoteIp) {
        this.remoteIp = remoteIp;
    }

    public Integer getRemotePort() {
        return remotePort;
    }

    public void setRemotePort(Integer remotePort) {
        this.remotePort = remotePort;
    }

    public String getLocalMac() {
        return localMac;
    }

    public void setLocalMac(String localMac) {
        this.localMac = localMac;
    }

    public String getRemoteMac() {
        return remoteMac;
    }

    public void setRemoteMac(String remoteMac) {
        this.remoteMac = remoteMac;
    }

}
