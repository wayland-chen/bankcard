package com.offke.core.bu.struct.pojo;

import com.offke.core.annotation.stereotype.Component;
import com.offke.core.annotation.stereotype.Parameter;
import com.offke.core.standard.interfaces.IAtomplugin;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * <p>原子交易信息</p>
 *
 * @version 1.0
 * @since 2012/4/2
 */
public class AtomInfo {
    private String tradeCode;
    private String tradeName;
    private Class<?> beanClass;
    private String comment;
    private String unpack;
    private String pack;
    private Component.Status status;
    private String author;
    private String createDate;
    private String version;
    private String viewconfig;

    private boolean singleton = false;
    private boolean internal = false;

    private Object object;

    public boolean limitflag; //是否限制操作员:false不限制 true-限制

    /*
     * 交易运行时与账务相关
     */
    public boolean feeflag; //false:不收费,true:收费
    public boolean transflag;//false:不做账务处理,true:账务处理 

    private Map<String, Parameter> atomParameters = new LinkedHashMap<String, Parameter>();

    private Date date;
    private Date mdate;

    /**
     * 设置激活对象
     *
     * @param object
     */
    public void setObject(Object object) {
        if (this.object != null && this.object instanceof IAtomplugin) {
            ((IAtomplugin) this.object).stop();
            ((IAtomplugin) object).init();
        } else if (object != null && object instanceof IAtomplugin) {
            ((IAtomplugin) object).init();
        }
        this.object = object;
    }

    /**
     * 获取插件对象
     *
     * @return 对象
     * @throws Exception
     */
    public <T> T getObject() throws Exception {
        if (singleton) {
            return (T) object;
        } else {
            return (T) this.beanClass.newInstance();
        }
    }

    public boolean isSingleton() {
        return singleton;
    }

    public void setSingleton(boolean singleton) {
        this.singleton = singleton;
    }

    public boolean isInternal() {
        return internal;
    }

    public void setInternal(boolean internal) {
        this.internal = internal;
    }

    public String getTradeCode() {
        return tradeCode;
    }

    public void setTradeCode(String tradeCode) {
        this.tradeCode = tradeCode;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    public String getTradeName() {
        return tradeName == null ? "" : tradeName;
    }

    public void setBeanClass(Class<?> beanClass) {
        this.beanClass = beanClass;
    }

    public Class<?> getBeanClass() {
        return beanClass;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getUnpack() {
        return unpack;
    }

    public void setUnpack(String unpack) {
        this.unpack = unpack;
    }

    public String getPack() {
        return pack;
    }

    public void setPack(String pack) {
        this.pack = pack;
    }

    public void setStatus(Component.Status status) {
        this.status = status;
    }

    public Component.Status getStatus() {
        return status;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void putInputParameters(String classify, Parameter parameter) {
        atomParameters.put(classify, parameter);
    }

    public Parameter getAtomParameter(String classify) {
        return this.atomParameters.get(classify);
    }

    public Map<String, Parameter> getAtomParameters() {
        return atomParameters;
    }

    public boolean isLimitflag() {
        return limitflag;
    }

    public void setLimitflag(boolean limitflag) {
        this.limitflag = limitflag;
    }

    public boolean isFeeflag() {
        return feeflag;
    }

    public void setFeeflag(boolean feeflag) {
        this.feeflag = feeflag;
    }

    public boolean isTransflag() {
        return transflag;
    }

    public void setTransflag(boolean transflag) {
        this.transflag = transflag;
    }

    public void setMdate(Date mdate) {
        this.mdate = mdate;
    }

    public Date getMdate() {
        return mdate;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    public void setViewconfig(String viewconfig) {
        this.viewconfig = viewconfig;
    }

    public String getViewconfig() {
        return viewconfig;
    }

}
