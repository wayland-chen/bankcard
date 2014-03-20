package com.offke.core.bu.buffer;

import com.offke.core.bu.struct.entity.TCfgfee;
import com.offke.core.bu.struct.entity.TCfgsplit;
import com.offke.core.bu.struct.entity.TCfgtrans;
import com.offke.core.bu.struct.entity.TTranscode;
import com.offke.core.bu.struct.pojo.AtomInfo;
import com.offke.core.bu.struct.pojo.Syspara;
import com.offke.core.common.mgr.Atommgr;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * <p>全局变量（静态变量）</p>
 *
 * @version 1.0
 * @since 2012/4/26
 */
public class Globalservice {
    protected static int cfgverno; //配置版本号
    protected static final Map<String, List<TCfgfee>> feeMaps = new ConcurrentHashMap<String, List<TCfgfee>>(); //交易收费费率
    protected static final Map<String, List<TCfgtrans>> transMaps = new ConcurrentHashMap<String, List<TCfgtrans>>(); //交易配置费率
    protected static final Map<String, TCfgsplit> splitMaps = new ConcurrentHashMap<String, TCfgsplit>(); //分录配置表
    protected static final Map<String, AtomInfo> atomConfigs = Atommgr.instance().getAtomConfigs(); //交易配置信息
    protected static final Map<String, List<TTranscode>> transcodeMaps = new ConcurrentHashMap<String, List<TTranscode>>(); //内部交易配置信息
    protected static final Syspara syspara = new Syspara();

    public int getCfgverno() {
        return cfgverno;
    }


    /**
     * <p>通过cardtype, transcode得到费率</p>
     *
     * @param key 键值
     * @return 结果
     */
    public static List<TCfgfee> getFeeList(String key) {
        return feeMaps.get(key);
    }

    /**
     * <p>通过feetype, transcode得到费率
     *
     * @param key 键值
     * @return 结果
     */
    public static List<TCfgtrans> getTransList(String key) {
        return transMaps.get(key);
    }


    /**
     * <p>通过transtype, fundtype得到分配配置</p>
     *
     * @param key
     * @return
     */
    public static TCfgsplit getSplit(String key) {
        return splitMaps.get(key);
    }

    /**
     * <p>通过transcode得到内部交易信息</p>
     *
     * @param key 键值
     * @return 结果
     */
    public static List<TTranscode> getTranscodeList(String key) {
        return transcodeMaps.get(key);
    }


    /**
     * <p>依据交易码获取交易配置信息</p>
     *
     * @param tradeCode 交易码
     * @return 交易配置信息
     */
    public static AtomInfo getAtomConfig(String tradeCode) {
        return atomConfigs.get(tradeCode);
    }

    /**
     * <p>获取与账务相关的系统参数<p>
     *
     * @return 系统参数
     */
    public static Syspara getSyspara() {
        return syspara;
    }
}
