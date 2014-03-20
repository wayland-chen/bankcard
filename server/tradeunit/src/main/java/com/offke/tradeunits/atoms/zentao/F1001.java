package com.offke.tradeunits.atoms.zentao;

import com.offke.core.AppConst;
import com.offke.core.annotation.stereotype.Component;
import com.offke.core.annotation.stereotype.Item;
import com.offke.core.annotation.stereotype.Modified;
import com.offke.core.annotation.stereotype.Parameter;
import com.offke.core.standard.abstracts.Atom;
import com.offke.core.status.procedure.TradeInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;


@Component(
        tradeCode = "1001",
        tradeName = "zentao个人登录",
        author = "phy",
        comment = "zentao个人日志登录",
        createDate = "2013/4/19",
        params = {
                @Parameter(classify = "禅道日志-登录",
                        demo = "1001",
                        inputs = {
                                @Item(nullable = Item.Nullable.NO, id = "zt_account", name = "账户ID", type = Item.Type.STRING, explain = "禅道系统登录账户ID"),
                                @Item(nullable = Item.Nullable.NO, id = "zt_password", name = "账户密码", type = Item.Type.STRING, explain = "禅道系统登录密码"),
                                @Item(nullable = Item.Nullable.NO, id = "sysClientTime", name = "客户端系统时间", type = Item.Type.STRING, explain = "客户端的操作系统时间")
                        },
                        outputs = {
                                @Item(nullable = Item.Nullable.NO, id = "reasoncode", name = "返回码", type = Item.Type.STRING, explain = "成功:0,其他为错误"),
                                @Item(nullable = Item.Nullable.NO, id = "reasonremark", name = "说明", type = Item.Type.STRING, explain = "提示说明")
                        }
                )
        },
        modified = {@Modified}
)
public class F1001 extends Atom {
    private static final Logger _logger = LoggerFactory.getLogger(F1001.class);
    private static String _Select = "select realname,account from  `zt_user` where `account`=?  and `password`=?";

    @Override
    public boolean atomicTransaction(TradeInfo tradeInfo) {
        _logger.debug("Transaction begin (TradeCode={}),tradeInfo=[{}] ", tradeInfo.tradeCode(), tradeInfo);

        try {
            this.beginTransaction();
            //输入参数
            tradeInfo.wrap2First(AppConst.entity);
            String zt_account = tradeInfo.getString("zt_account");
            String zt_password = tradeInfo.getString("zt_password");
            _logger.info("zt_account=[{}],zt_password=[{}]", zt_account, zt_password);

            tradeInfo.putReason("9", "用户或密码不正确");

            //业务逻辑开始
            List<?> resultList = this.sqlQuery(_Select, zt_account, zt_password);
            if (resultList.size() > 0) {
                tradeInfo.putReason("0", "业务处理成功");
            }

            //业务逻辑结束
            this.commitTransaction();
        } catch (Exception e) {
            this.rollbackTransaction();
            e.printStackTrace();
            _logger.error("Transaction failure (TradeCode={}),error=[{}] ", tradeInfo.tradeCode(), e);
        }
        _logger.debug("Transaction end (TradeCode={}) ", tradeInfo.tradeCode());

        return true;
    }
}