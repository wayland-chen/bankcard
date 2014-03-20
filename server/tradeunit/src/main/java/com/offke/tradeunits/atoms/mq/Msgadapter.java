package com.offke.tradeunits.atoms.mq;

import com.offke.core.common.util.Procadapter;
import com.offke.core.standard.abstracts.Atom;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Map;

public class Msgadapter {
    /**
     * 异常发送消息, 后台处理
     *
     * @param tradecode  交易码
     * @param msglevel   消息级别
     * @param deviceid   设备编号
     * @param sleep      间隔时间
     * @param maxsendcnt 最大发起次数
     * @param reqdata    请求数据
     * @return 批次号
     * @throws NoSuchMethodException
     * @throws SecurityException
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     * @throws IllegalArgumentException
     */
    public static String asyn(
            String tradecode,
            Integer msglevel,
            Integer deviceid,
            Integer sleep,
            Integer maxsendcnt,
            Date expirationtime,
            Map<String, Object> reqdata) throws RuntimeException, Exception {
        Object obj = Messages.instance();

        Method method =
                obj.getClass().getMethod(
                        "asyn",
                        String.class,
                        Integer.class,
                        Integer.class,
                        Integer.class,
                        Integer.class,
                        java.util.Date.class,
                        Map.class);
        Object invoke =
                method.invoke(
                        obj,
                        tradecode,
                        msglevel,
                        deviceid,
                        sleep,
                        maxsendcnt,
                        expirationtime,
                        reqdata);
        return (String) invoke;
    }

    /**
     * 同步发送消息
     *
     * @param atom      原子交易实例
     * @param tradecode 交易码
     * @param deviceid  设备编号
     * @param reqdata   请求数据
     * @return 是否成功
     * @throws Exception
     */
    public static Procadapter sync(Atom atom, String tradecode, Integer deviceid, Procadapter reqdata)
            throws RuntimeException, Exception {
        Object obj = Messages.instance();

        try {
            Method method =
                    obj.getClass().getMethod(
                            "sync",
                            Atom.class,
                            String.class,
                            Integer.class,
                            Procadapter.class);
            Object invoke = method.invoke(obj, atom, tradecode, deviceid, reqdata);
            return (Procadapter) invoke;
        } catch (Exception e) {
            if ((e instanceof InvocationTargetException) && e.getCause() != null) {
                throw (Exception) e.getCause();
            }
        }
        return null;
    }

}
