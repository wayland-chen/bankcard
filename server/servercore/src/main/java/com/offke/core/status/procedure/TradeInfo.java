package com.offke.core.status.procedure;

import com.offke.core.AppConst;
import com.offke.core.bu.struct.pojo.*;
import com.offke.core.bus.mix.IServiceasyn;
import com.offke.core.common.mgr.Atommgr;
import com.offke.core.common.util.*;
import com.offke.core.standard.interfaces.IPack;
import com.offke.core.standard.interfaces.IUnPack;

import java.io.File;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * <p>交易过程信息</p>
 *
 * @version 1.0
 */
public class TradeInfo {
    protected String tradeCode; //交易码
    protected String rMsg; //接收报文的原始包
    protected String sMsg; //发送报文的原始包

    /*
    * 报文头
    */
    protected String appver; //总版本
    protected String appname; //应用程序名称
    protected String atomver; //原子交易版本
    protected String src; //发起源结点
    protected String des; //目的结点
    protected String tradeid; //交易编号
    protected String traderef; //交易引用编号
    protected String sessonid; //会话编号
    protected String workdate; //工作日期
    protected String worktime; //工作时间

    protected boolean log = true;
    protected boolean hasPack = true;

    /*
    * 操作员码
    */
    protected String operCode;

    /*
    * 操作员码终端号
    */
    protected int termid;

    /*
    * 操作员码
    */
    protected long termseqno;

    /*
    * 网点号
    */
    protected int branchno;

    /*
    * 从前台或者第三方接收的信息放在该buf中
    */
    protected Procadapter gets = new Procadapter();

    /*
    * 发送到前台或者第三方的数据放在该buf中
    */
    protected Procadapter puts = new Procadapter();

    /*
     * 内部使用
     */
    private Procadapter iputs = null;

    /*
     * 原子交易配置信息
     */
    private AtomInfo atomInfo;

    /*
    * 通信 连接信息
    */
    private Conninfo conninfo;

    private IServiceasyn cbservice;
    private IPack pack;
    private IUnPack unpack;

    /**
     * <p> 存放发到第三方或者前台的数据 </p>
     *
     * @param key   关键字
     * @param value 数据
     */
    public void put(String key, Object value) {
        this.puts.put(key, value);
    }

    /**
     * <p> 发送文件到前台 </p>
     *
     * @param key   关键字
     * @param value File文件
     */
    public void putFile(String key, Object value) {
        if (iputs == null) {
            this.iputs = new Procadapter();
        }
        this.iputs.put(key, value);
    }

    /**
     * 发送原因码以及原因说明到前台
     *
     * @param reasoncode   原因码
     * @param reasonremark 原因说明
     */
    public void putReason(String reasoncode, String reasonremark) {
        this.put("reasoncode", reasoncode);
        this.put("reasonremark", reasonremark);
    }

    /**
     * 发送查询结果到前台
     *
     * @param qresult 查询结果
     */
    public void putQueryResult(QueryResult qresult) {
        this.putQueryResult(null, qresult);
    }

    /**
     * 发送查询结果到前台
     *
     * @param pager   分页信息
     * @param qresult 查询结果
     */
    public void putQueryResult(SimplePage pager, QueryResult qresult) {
        if (pager != null) {
            pager.setTotalItems(qresult.getTotalItems());
        }
        this.put(AppConst.pager, pager);
        this.put(AppConst.columnHeader, qresult.getColumns());
        this.put(AppConst.result, qresult.getResult());
    }

    /**
     * <p> 取得puts的值 </p>
     *
     * @param key 关键字
     * @return 返回puts的对象值
     */
    public Object put(String key) {
        return this.puts.get(key);
    }

    /**
     * 异步调用，提交批次
     */
    public void asynCommitBatch() {
        if (cbservice != null) {
            cbservice.mix(this);
        }
    }

    /**
     * 异步调用，完成
     */
    public void asynComplete() {
        if (cbservice != null) {
            try {
                if (!this.puts.isEmpty()) {
                    cbservice.mix(this);
                }
            } finally {
                hasPack = false;
            }
        }
    }

    /**
     * <p> 把数据暂存到gets中 </p>
     *
     * @param key   关键字
     * @param value 值
     */
    public void get(String key, Object value) {
        this.gets.put(key, value);
    }

    /**
     * <p> 根据key获取到报文信息 </p>
     *
     * @param key 关键字
     * @return 返回的key的对象
     */
    @SuppressWarnings("unchecked")
    public <T> T get(String key) {
        Object obj = gets.get(key);
        if (obj == null) {
            return null;
        }

        return (T) obj;
    }

    /**
     * 获取任意类型
     *
     * @param key            关键字
     * @param conversionType 目标类型
     * @return 值
     */
    public <T> T get(String key, Class<?> conversionType) {
        Object value = this.get(key);
        return (T) DataTransition.changeType(value, conversionType);
    }

    /**
     * <p> 根据key获取到报文信息 </p>
     *
     * @param key 关键字
     * @return 返回的key的对象
     */
    public Object getObject(String key) {
        return this.gets.get(key);
    }

    /**
     * <p> 根据key获取到报文信息 </p>
     *
     * @param key 关键字
     * @return 返回的key的对象
     */
    public File getFile(String key) {
        Object obj = gets.get(key);
        if (obj == null) {
            return null;
        } else {
            return TypeConver.getFile(obj);
        }
    }

    /**
     * <p> 根据key获取到报文信息 </p>
     *
     * @param key 关键字
     * @return 返回的key的对象
     */
    public String getString(String key) {
        Object obj = gets.get(key);
        if (obj == null) {
            return null;
        }

        return String.valueOf(obj);
    }

    /**
     * <p> 根据key获取到报文信息 </p>
     *
     * @param key 关键字
     * @return 返回的key的对象
     */
    public Float getFloat(String key) {
        Object value = this.getObject(key);
        if (Validate.isEmpty(value)) {
            return null;
        } else {
            return TypeConver.getFloat(value);
        }
    }

    /**
     * <p> 根据key获取到报文信息 </p>
     *
     * @param key 关键字
     * @return 返回的key的对象
     */
    public Double getDouble(String key) {

        Object value = this.getObject(key);
        if (Validate.isEmpty(value)) {
            return null;
        } else {
            return TypeConver.getDouble(value);
        }

    }

    /**
     * <p> 根据key获取到报文信息 </p>
     *
     * @param key 关键字
     * @return 返回的key的对象
     */
    public BigDecimal getBigDecimal(String key) {
        Object value = this.getObject(key);
        if (Validate.isEmpty(value)) {
            return null;
        } else {
            return TypeConver.getBigDecimal(value);
        }
    }

    /**
     * <p> 根据key获取到报文信息 </p>
     *
     * @param key 关键字
     * @return 返回的key的对象
     */
    public Integer getInt(String key) {
        Object value = this.getObject(key);
        if (Validate.isEmpty(value)) {
            return null;
        } else {
            return TypeConver.getInt(value);
        }
    }

    /**
     * <p> 根据key获取到报文信息 </p>
     *
     * @param key 关键字
     * @return 返回的key的对象
     */
    public Long getLong(String key) {
        Object value = this.getObject(key);
        if (Validate.isEmpty(value)) {
            return null;
        } else {
            return TypeConver.getLong(value);
        }
    }

    /**
     * <p>多种方式来判断值是否为空</p>
     *
     * @param key 键值
     * @return 是否为空
     */
    public boolean isGetsOfValueEmpty(String key) {
        Object value = this.get(key);
        return Validate.isEmpty(value);
    }

    /**
     * <p> 根据key获取到报文信息,遍历性的 </p>
     *
     * @param key 关键字
     * @return 返回的key的对象
     */
    public <T> T getErgodicity(String key) {
        Value value = new Value();
        ErgodicKey2Value.get(gets, key, value);
        return (T) value.getValue();
    }

    /**
     * <p> 根据key获取到报文信息,遍历性的 </p>
     *
     * @param key 关键字
     * @return 返回的key的对象
     */
    public <T> T getErgodicity(String key, Class type) {
        Value value = new Value();
        ErgodicKey2Value.get(gets, key, value);
        return (T) DataTransition.changeType(value.getValue(), type);
    }

    /**
     * 依据key的值，把该对象的所有值放到最puts缓存第一级别下
     *
     * @param key 键值
     */
    public void wrap2First(String key) {
        Object ergodicity = getErgodicity(key);
        if (ergodicity != null && ergodicity instanceof Map) {
            Map<String, Object> values = (Map<String, Object>) ergodicity;
            for (Map.Entry<String, Object> entry : values.entrySet()) {
                this.get(entry.getKey(), entry.getValue());
            }
        }
    }

    /**
     * <p> 根据key获取到报文信息 </p>
     *
     * @param key 关键字
     * @return 返回的key的对象
     */
    public Map getMap(String key) {
        return TypeConver.getMap(this.gets.get(key));
    }

    /**
     * <p> 根据key获取到报文信息 </p>
     *
     * @param key 关键字
     * @return 返回的key的对象
     */
    public List<?> getList(String key) {
        return TypeConver.getList(this.gets.get(key));
    }

    /**
     * <p> 该buf存放发送到第三或者前台的交易信息 </p>
     *
     * @return 所有的buf信息
     */
    public Procadapter puts() {
        return this.puts;
    }

    /**
     * <p> 该buf存放从第三或者前台传来的交易信息 </p>
     *
     * @return 所有的buf信息
     */
    public Procadapter gets() {
        return this.gets;
    }

    /**
     * <p> 设置交易码 </p>
     *
     * @param tradeCode 交易码
     */
    public void tradeCode(String tradeCode) {
        this.tradeCode = tradeCode;
        atomInfo = Atommgr.instance().get(tradeCode);

        if (atomInfo == null) {
            throw new RuntimeException(tradeCode);
        }
    }

    /**
     * 从gets缓存中生成一个哈希表或者获取一个存在的哈希表
     *
     * @param key 键
     * @return map
     */
    public Procadapter wrap2down(String key) {
        Object object = this.gets.get(key);
        if (object != null && !(object instanceof Procadapter)) {
            this.gets.remove(key);
            object = new Procadapter();
            this.gets.put(key, object);
        } else if (object == null) {
            object = new Procadapter();
            this.gets.put(key, object);
        }

        return (Procadapter) object;
    }

    /**
     * 从puts缓存中生成一个哈希表或者获取一个存在的哈希表
     *
     * @param key 键
     * @return map
     */
    public Procadapter wrap2up(String key) {
        Object object = this.puts.get(key);
        if (object != null && !(object instanceof Procadapter)) {
            this.puts.remove(key);
            object = new Procadapter();
            this.puts.put(key, object);
        } else if (object == null) {
            object = new Procadapter();
            this.puts.put(key, object);
        }

        return (Procadapter) object;
    }

    /**
     * <p>获取交易码</p>
     *
     * @return 交易码
     */
    public String tradeCode() {
        return tradeCode;
    }

    /**
     * 资源清除，由框架调用
     */
    public void clear() {
        this.gets.clear();
        this.gets = null;
        this.puts.clear();
        this.puts = null;
        if (this.iputs != null) {
            this.iputs.clear();
            this.iputs = null;
        }
        atomInfo = null;
    }

    public void rMsg(String rMsg) {
        this.rMsg = rMsg;
    }

    public String rMsg() {
        return this.rMsg;
    }

    public void sMsg(String sMsg) {
        this.sMsg = sMsg;
    }

    public String sMsg() {
        return this.sMsg;
    }

    public Map<String, Object> getIputs() {
        return iputs;
    }

    public AtomInfo getAtomInfo() {
        return atomInfo;
    }

    public String getTradeCode() {
        return tradeCode;
    }

    public void setTradeCode(String tradeCode) {
        this.tradeCode = tradeCode;
    }

    public String getAppver() {
        return appver;
    }

    public void setAppver(String appver) {
        this.appver = appver;
    }

    public String getAppname() {
        return appname;
    }

    public void setAppname(String appname) {
        this.appname = appname;
    }

    public String getAtomver() {
        return atomver;
    }

    public void setAtomver(String atomver) {
        this.atomver = atomver;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getTradeid() {
        return tradeid;
    }

    public void setTradeid(String tradeid) {
        this.tradeid = tradeid;
    }

    public String getTraderef() {
        return traderef;
    }

    public void setTraderef(String traderef) {
        this.traderef = traderef;
    }

    public String getSessonid() {
        return sessonid;
    }

    public void setSessonid(String sessonid) {
        this.sessonid = sessonid;
    }

    public String getWorkdate() {
        return workdate;
    }

    public void setWorkdate(String workdate) {
        this.workdate = workdate;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setWorktime(String worktime) {
        this.worktime = worktime;
    }

    public String getWorktime() {
        return worktime;
    }

    public void setTermId(int termid) {
        this.termid = termid;
    }

    public int getTermId() {
        return termid;
    }

    public void setTermSeqno(long termseqno) {
        this.termseqno = termseqno;
    }

    public long getTermSeqno() {
        return termseqno;
    }

    public void setBranchno(int branchno) {
        this.branchno = branchno;
    }

    public int getBranchno() {
        return branchno;
    }

    public Conninfo getConninfo() {
        return conninfo;
    }

    public void setConninfo(Conninfo conninfo) {
        this.conninfo = conninfo;
    }

    public void setCbservice(IServiceasyn cbservice) {
        this.cbservice = cbservice;
    }

    public void setLog(boolean log) {
        this.log = log;
    }

    public boolean isLog() {
        return log;
    }

    /**
     * 是否存在后续包
     *
     * @return 存在
     */
    public boolean hasPack() {
        return this.hasPack;
    }

    public void setPack(IPack pack) {
        this.pack = pack;
    }

    public IPack getPack() {
        return pack;
    }

    public void setUnpack(IUnPack unpack) {
        this.unpack = unpack;
    }

    public IUnPack getUnpack() {
        return unpack;
    }
}
