package com.offke.core.common.util;

import Ice.IPConnectionInfo;
import com.offke.core.bu.struct.pojo.Conninfo;
import org.apache.commons.lang.StringUtils;

import java.io.StringReader;
import java.util.Scanner;

/**
 * ice工具类
 */
public class Iceutils {
    public static Conninfo getAddress(String conninfo) {
        Conninfo address = new Conninfo();
        StringReader info = new StringReader(conninfo);
        Scanner scanner = new Scanner(info);
        String local = scanner.nextLine();
        String remote = scanner.nextLine();
        String[] locals = local.split("=");
        if (locals != null && locals.length == 2) {
            String[] ip7port = StringUtils.split(locals[1].trim(), ':');
            if (ip7port != null && ip7port.length == 2) {
                address.setLocalIp(ip7port[0].trim());
                address.setLocalPort(Integer.valueOf(ip7port[1].trim()));
            }
        }
        String[] remotes = remote.split("=");
        if (remotes != null && remotes.length == 2) {
            String[] ip7port = StringUtils.split(remotes[1].trim(), ':');
            if (ip7port != null && ip7port.length == 2) {
                address.setRemoteIp(ip7port[0].trim());
                address.setRemotePort(Integer.valueOf(ip7port[1].trim()));
            }
        }
        return address;
    }

    public static Conninfo getAddress(IPConnectionInfo ipinfo) {
        Conninfo address = new Conninfo();
        address.localIp = ipinfo.localAddress;
        address.localPort = ipinfo.localPort;
        address.remoteIp = ipinfo.remoteAddress;
        address.remotePort = ipinfo.remotePort;
        return address;
    }
}
