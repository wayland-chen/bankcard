package com.offke.core;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 13-4-16
 * Time: 下午12:56
 */
public interface AppConst {

    /**
     * 报文头
     */
    String appver = "appver"; //总版本
    String appname = "appname"; //应用程序名称
    String atomver = "atomver"; //原子交易版本
    String src = "src"; //发起源结点
    String des = "des"; //目的结点
    String tradecode = "tradecode"; //交易码
    String tradeid = "tradeid"; //交易编号
    String traderef = "traderef"; //交易引用编号
    String sessonid = "sessonid"; //会话编号
    String opercode = "opercode"; //操作员
    String workdate = "workdate"; //工作日期
    String worktime = "worktime"; //工作时间

    /**
     * 报文其它key
     */
    String pager = "pager"; //分页信息
    String params = "params"; //参数信息
    String entity = "entity"; //pojo
    String opttype = "opttype"; //opttype
    String columnHeader = "columnHeader"; //列头
    String result = "result"; //结果

    String reasoncode = "reasoncode";
    String reasonremark = "reasonremark";

    String CMD = "CMD";
    String DATA = "DATA";
    String HEAD = "HEAD";
    String BODY = "BODY";

    /**
     * 验证标志
     */
    int INT = 1; //int
    int FLOAT = 2; //浮点
    int DATE = 3; // 日期
    int Emain = 4; // Emain
    int HPONE = 5; // 电话
    int DAK = 6; //匹配中国邮政编码
    int IDCARD = 7; //身份证
    int Subject = 8; //科目
    int ORG = 9; //机构
    int Amount = 11; //金额
    int Percentage = 12; //百分比
    int GreatThan = 13; //万分比

    int FillCount1 = 100;

    /**
     * src节点定义
     */
    String AppCenter = "AppCenter"; //管理中心节点


    String LF = System.getProperty("line.separator");
    String Fz = "#";
    String Fy = "*";
    int F80 = 80;

    /**
     * 系统退出状态
     */
    int SysExitException = -1;

    /**
     * 常用日期格式
     */
    String DatePattern1 = "yyyyMMdd";
    String DatePattern2 = "yyyy-MM-dd";
    String DatePattern3 = "yyyy/MM/dd";
    String DatePattern4 = "yyMMddHHmmss";
    String DatePattern5 = "yyyyMMddHHmmss";
    String DatePattern6 = "HHmmss";
    String DatePattern7 = "yyMMddHHmmsss";

    /*
     * 输入分页大小
     */
    int pageSize = 30;

    String charsetName = "UTF-8";

    String Schedulingtime = "app.sleeptime";

    String Thread_scheduling = "scheduling";
    String Thread_wisdragon_ice = "wisdragon_ice";

    String Down2aipscount = "app.down2aips.count";

    /*
     * 消息队列日志tag
     */
    String mq = "mq";

    /**
     * 哈希表键
     */
    String opt = "opt";
    String data = "data";
}
