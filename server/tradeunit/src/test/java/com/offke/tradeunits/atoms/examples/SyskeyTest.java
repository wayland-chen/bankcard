package com.offke.tradeunits.atoms.examples;

import com.offke.core.annotation.stereotype.Component;
import com.offke.core.annotation.stereotype.Component.Status;
import com.offke.core.annotation.stereotype.Item;
import com.offke.core.annotation.stereotype.Item.Nullable;
import com.offke.core.annotation.stereotype.Item.Type;
import com.offke.core.annotation.stereotype.Modified;
import com.offke.core.annotation.stereotype.Parameter;
import com.offke.core.bu.struct.pojo.KeyType;
import com.offke.core.standard.abstracts.Atom;
import com.offke.core.standard.interfaces.IAtom;
import com.offke.core.status.procedure.TradeInfo;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(
        tradeCode = "9003",
        status = Status.Stop,
        tradeName = "系统主建生成测试",
        author = "jiangli",
        comment = "系统主建生成测试",
        createDate = "2012/04/16",
        params = {
                @Parameter(classify = "新增",
                        demo = "",
                        inputs = {
                                @Item(nullable = Nullable.NO, id = "", name = "", type = Type.STRING, explain = ""),
                                @Item(nullable = Nullable.NO, id = "", name = "", type = Type.STRING, explain = "")
                        },
                        outputs = {
                                @Item(nullable = Nullable.NO, id = "", name = "", type = Type.STRING, explain = ""),
                                @Item(nullable = Nullable.NO, id = "", name = "", type = Type.STRING, explain = "")
                        }
                ),
                @Parameter(classify = "更新",
                        demo = "",
                        inputs = {
                                @Item(nullable = Nullable.NO, id = "", name = "", explain = ""),
                                @Item(nullable = Nullable.NO, id = "", name = "", explain = "")
                        },
                        outputs = {
                                @Item(nullable = Nullable.NO, id = "", name = "", explain = ""),
                                @Item(nullable = Nullable.NO, id = "", name = "", explain = "")
                        }
                )
        },
        modified = {@Modified})
public class SyskeyTest extends Atom {
    private static final Logger _logger = LoggerFactory.getLogger(SyskeyTest.class);

    @Override
    public boolean atomicTransaction(TradeInfo tradeInfo) {
        _logger.info("\n" + StringUtils.center("Begin SyskeyTest TradeCode【" + tradeInfo.tradeCode() + "】", 80, '*'));
        try {
            this.beginTransaction();
            //业务逻辑开始
            
            /*
            TBooktype type = new TBooktype( Byte.valueOf( "17" ),"EEE" );
            this.save( type );
            SysKey lookupBean = BeanProxy.lookupBean( SysKey.class );
            Long key = lookupBean.get( "DOORDTL" );
            System.out.println("EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
             type = new TBooktype( Byte.valueOf( "18" ),String.valueOf( key ) );
            this.save( type );
            tradeInfo.put( "key", key );
            */

            Object obj = this.generateKey(KeyType.CARDACCNO);

            tradeInfo.put("key", obj);
            IAtom instance = this.instance("90001");
            instance.atomicTransaction(tradeInfo);

            //业务逻辑结束

            this.commitTransaction();
        } catch (Exception e) {
            this.rollbackTransaction();
            _logger.error("\n" + StringUtils.center("Failure SyskeyTest TradeCode【" + tradeInfo.tradeCode() + "】", 80, '*'), e);
        }

        _logger.info("\n" + StringUtils.center("Success SyskeyTest TradeCode【" + tradeInfo.tradeCode() + "】", 80, '*'));

        return true;
    }
}