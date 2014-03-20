package com.offke.tradeunits.atoms.examples;

import com.offke.core.annotation.stereotype.Component;
import com.offke.core.annotation.stereotype.Component.Status;
import com.offke.core.annotation.stereotype.Item;
import com.offke.core.annotation.stereotype.Item.Nullable;
import com.offke.core.annotation.stereotype.Item.Type;
import com.offke.core.annotation.stereotype.Modified;
import com.offke.core.annotation.stereotype.Parameter;
import com.offke.core.bu.struct.pojo.SecurityType;
import com.offke.core.common.mgr.SecurityFactory;
import com.offke.core.standard.abstracts.Atom;
import com.offke.core.status.procedure.TradeInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(
        tradeCode = "90006",
        status = Status.Stop,
        tradeName = "安全工厂测试",
        author = "jiangli",
        comment = "安全工厂测试",
        createDate = "2012/04/23",
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
public class SecurityTest extends Atom {
    private static final Logger _logger = LoggerFactory.getLogger(SecurityTest.class);

    @Override
    public boolean atomicTransaction(TradeInfo tradeInfo) {
        try {
            this.beginTransaction();
            //业务逻辑开始
            
            /*
            //...
           String ret =  SecurityFactory.process( SecurityType.DesEncryptToBase64String,  ByteBuffer.wrap( "待加密的数据".getBytes( ) ) );
           tradeInfo.put( "result1", ret );
           
           
           byte[] ret2 =  SecurityFactory.process( SecurityType.DesEncryptToBase64Byte,  ByteBuffer.wrap( "待加密的数据".getBytes( ) ) );
           
          byte[] ret3 =  SecurityFactory.process( SecurityType.DesDecryptToByte, ByteBuffer.wrap( ret2 ) );//des加密,返回二进制byte
          tradeInfo.put( "result2", new String(ret3) );
          String ret4 =  SecurityFactory.process( SecurityType.DesDecryptToString, ByteBuffer.wrap( ret2 ) );//de加密,返回解密
          tradeInfo.put( "result3",ret4 );
          */
            String ret = SecurityFactory.process(SecurityType.DesEncryptToCustomer, "666666");
            tradeInfo.put("666666", ret);
            tradeInfo.put(SecurityFactory.process(SecurityType.DesDecryptToCustomer, ret).toString(), "666666");

            //业务逻辑结束

            this.commitTransaction();
        } catch (Exception e) {
            this.rollbackTransaction();
        }


        return true;
    }
}