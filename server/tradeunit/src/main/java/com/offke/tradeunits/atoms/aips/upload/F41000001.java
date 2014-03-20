package com.offke.tradeunits.atoms.aips.upload;

import com.offke.core.AppConst;
import com.offke.core.annotation.stereotype.Component;
import com.offke.core.annotation.stereotype.Item;
import com.offke.core.annotation.stereotype.Item.Nullable;
import com.offke.core.annotation.stereotype.Item.Type;
import com.offke.core.annotation.stereotype.Modified;
import com.offke.core.annotation.stereotype.Parameter;
import com.offke.core.bu.struct.entity.TPosdtl;
import com.offke.core.bu.struct.entity.TPosdtlId;
import com.offke.core.bu.struct.entity.TPurseposdtl;
import com.offke.core.bu.struct.entity.TPurseposdtlId;
import com.offke.core.common.util.Calculate;
import com.offke.core.common.util.TradeUtils;
import com.offke.core.common.util.Validate;
import com.offke.core.standard.abstracts.Atom;
import com.offke.core.standard.interfaces.IAtomplugin;
import com.offke.core.status.procedure.TradeInfo;
import com.offke.tradeunits.atoms.aips.upload.storage.ConsumerInfos;
import com.offke.tradeunits.atoms.aips.upload.utils.UploadUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Component(
        tradeCode = "41000001",
        tradeName = "前置机上传消费流水",
        author = "jiangli",
        comment = "前置机上传消费流水(F930031)",
        createDate = "2012/06/06",
        singleton = false,
        params = {
                @Parameter(classify = "", demo = "",
                        inputs = {

//<default>
                                @Item(nullable = Nullable.NO, id = "consumerinfos", name = "消费信息", type = Type.List, explain = "消费信息"),
                                @Item(nullable = Nullable.NO, id = "sysid", name = "子系统ID", type = Type.STRING, explain = "子系统ID"),
                                @Item(nullable = Nullable.NO, id = "devphyid", name = "设备物理id", type = Type.STRING, explain = "设备物理id"),
                                @Item(nullable = Nullable.NO, id = "flowingtype", name = "流水类型", type = Type.STRING, explain = "1-实时单笔 2-脱机批量")
//</default>
                        }, outputs = {
                        @Item(nullable = Nullable.NO, id = "reasoncode", name = "提示返回码", type = Type.STRING, explain = "成功:00000,错误：其它码"),
                        @Item(nullable = Nullable.NO, id = "reasonremark", name = "说明", type = Type.STRING, explain = "提示返回码的说明")
//<out>
//</out>
                })}, modified = {@Modified})
public class F41000001 extends Atom implements IAtomplugin {
    private static final Logger _logger = LoggerFactory.getLogger(F41000001.class);

    @Override
    public boolean atomicTransaction(TradeInfo tradeInfo) {
        try {
            this.beginTransaction();
            //业务逻辑开始

            tradeInfo.wrap2First(AppConst.entity);
            //输入参数
            //<inputs name=default>
            List<?> consumerInfoList = tradeInfo.get("consumerinfos"); //消费信息
            String devphyid = tradeInfo.getString("devphyid");//设备物理ID
            String sysid = tradeInfo.getString("sysid");//子系统ID
            String flowingtype = tradeInfo.getString("flowingtype");//流水类型 1-实时单笔 2-脱机批量
            //</inputs>

            //效验上送数据
            //<default>

//            if ( Validate.isEmpty( sysid ) )
//            {
//            	throw new RWarn( RWarn.zl_99997, "【sysid:子系统ID】不能为空" );
//            }

            //</default>

            if (sysid == null || sysid.isEmpty() || sysid.trim().length() == 0) {
                sysid = "0";
            }


            //pos流水处理

            for (Object Obj : consumerInfoList) {
                //局部变量
                ConsumerInfos consumerinfos = new ConsumerInfos();
                TPosdtlId tPosdtlId = new TPosdtlId();
                TPosdtl tPosdtl = new TPosdtl(null);
                TPurseposdtlId tPurseposdtlId = new TPurseposdtlId();
                TPurseposdtl tPurseposdtl = new TPurseposdtl(null);

                Map<?, ?> consumerInfoMap = (Map<?, ?>) Obj;
                if (!UploadUtils.getConsumerInfos(consumerInfoMap, consumerinfos)) {
                    throw new RuntimeException("获取消费信息失败");
                }


            } //end for

            //业务逻辑结束
            this.commitTransaction();

            //返回数据
            tradeInfo.putReason("zl_00000", "前置机上传消费流水成功");
            //<outputs name=out>
            //</outputs>
        } catch (RuntimeException e) {
            this.rollbackTransaction();
            throw e;
        } catch (Exception e) {
            this.rollbackTransaction();
            throw new RuntimeException(tradeInfo.getAtomInfo().getTradeName());
        }


        return true;
    }

    private int check(TPosdtl tposdtl) {
        return 0;

    }

    private int check(TPurseposdtl tpurseposdtl) {


        return 0;

    }

    @Override
    public boolean init() {
        return true;
    }

    @Override
    public boolean stop() {
        // TODO Auto-generated method stub
        return false;
    }
}