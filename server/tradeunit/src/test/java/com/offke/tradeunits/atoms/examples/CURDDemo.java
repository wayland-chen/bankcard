package com.offke.tradeunits.atoms.examples;

import com.offke.core.annotation.stereotype.Component;
import com.offke.core.annotation.stereotype.Component.Status;
import com.offke.core.annotation.stereotype.Item;
import com.offke.core.annotation.stereotype.Item.Nullable;
import com.offke.core.annotation.stereotype.Item.Type;
import com.offke.core.annotation.stereotype.Modified;
import com.offke.core.annotation.stereotype.Parameter;
import com.offke.core.common.util.TradeUtils;
import com.offke.core.standard.abstracts.Atom;
import com.offke.core.standard.interfaces.IAtom;
import com.offke.core.status.procedure.TradeInfo;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(tradeCode = "90004",
        status = Status.Stop,
        tradeName = "CURDDemo", author = "jiangli", comment = "CURDDemo", createDate = "2012/04/13", params = {
        @Parameter(classify = "新增", demo = "", inputs = {
                @Item(nullable = Nullable.NO, id = "", name = "", type = Type.STRING, explain = ""),
                @Item(nullable = Nullable.NO, id = "", name = "", type = Type.STRING, explain = "")}, outputs = {
                @Item(nullable = Nullable.NO, id = "", name = "", type = Type.STRING, explain = ""),
                @Item(nullable = Nullable.NO, id = "", name = "", type = Type.STRING, explain = "")}),
        @Parameter(classify = "更新", demo = "", inputs = {
                @Item(nullable = Nullable.NO, id = "", name = "", explain = ""),
                @Item(nullable = Nullable.NO, id = "", name = "", explain = "")}, outputs = {
                @Item(nullable = Nullable.NO, id = "", name = "", explain = ""),
                @Item(nullable = Nullable.NO, id = "", name = "", explain = "")})}, modified = {@Modified})
public class CURDDemo extends Atom {
    private static final Logger _logger = LoggerFactory.getLogger(CURDDemo.class);
    @Override
    public boolean atomicTransaction(TradeInfo tradeInfo) {
        _logger.info("\n" + StringUtils.center("Begin CURDDemo TradeCode【" + tradeInfo.tradeCode() + "】", 80, '#'));
        try {
            this.beginTransaction();
            //业务逻辑开始

            /*
            TBooktype type = new TBooktype( Byte.valueOf( "2" ), "傅江利测试" );
            save( type ); 
            */

            //            this.save( "insert into T_BOOKTYPE(booktype,bookname) values(?,?)", 3, "傅江利插入测试" );

            /*
            TBooktype type = new TBooktype( Byte.valueOf( "3" ), "傅江利测试" );
            this.persist( type );
            */

            /*
            TBooktype type = new TBooktype( Byte.valueOf( "3" ), "傅江利更新测试" );
            this.merge( type );
            */

            //            update( "update T_BOOKTYPE set bookname=? where booktype=?", "傅江利测试2222222wswss", 2 );

            /*
            TBooktype type = new TBooktype( Byte.valueOf( "3" ), "傅江利更新测试" );
            delete( type );
            */

            //          this.delete( TBooktype.class, Byte.valueOf( "1" ) );   

            //            delete( "delete from t_booktype where booktype=?", 2 );

            //            List<?> sqlQuery = sqlQuery( "select * from T_CARDDTL t where t.SUMMARY=?", "卡片领入" );
            //            tradeInfo.put( "ret", sqlQuery );

            //            List<?> sqlQuery = sqlQuery( "select * from T_CARDDTL t", 0, 2 );

            //            tradeInfo.put( "ret", sqlQuery );

            /*List<?> hsqlQuery = this.hsqlQuery( "from TCarddtl t where t.summary=? or t.summary=?", 0, 3, "卡片领入", "撤销作废"    );
            tradeInfo.put( "ret", hsqlQuery );*/

            /*
            QueryResult result =
                    CommonQuery.sqlConditionQuery(
                            getConnection(),
                            0,
                            2,
                            "SELECT *  FROM T_CARD",
                            new String[]{"T_CARD"},
                            new Condition("cardno", 109)
                    );

            tradeInfo.put("cols", result.getColumns());
            tradeInfo.put("rets", result.getResult());
            */
            
            /*
            TSyspara syspara =  ( TSyspara ) getSession( ).get( TSyspara.class, DataTransition.intToBigDecimal( RDictionary.SYSPARA_MAXCARDVERNO ), LockMode.UPGRADE );
            syspara.setParaval( String.valueOf( Long.valueOf( syspara.getParaval( ) ) + 1 ) );
            */
            
            /*
            List<?> all = this.getAll( TCfgtrans.class );
            tradeInfo.put( "ret", all ) ;
            */

            tradeInfo.put("key", "111");

            IAtom atom = this.instance("22222222222");
            TradeInfo info = new TradeInfo();

            atom.atomicTransaction(info);


            tradeInfo.putReason("zl_00000","成功"); //默认采用了“成功”提示
//            tradeInfo.putReason( RWarn.zl_00000,"新增客户成功" ); //原因说明为“新增客户成功”提示

            //...

            //业务逻辑结束

            this.commitTransaction();
            //            this.rollbackTransaction( );

        } catch (Exception e) {
            this.rollbackTransaction();
            _logger.info(
                    "\n"
                            + StringUtils.center("Failure CURDDemo TradeCode【"
                            + tradeInfo.tradeCode()
                            + "】", 80, '#'),
                    e);
        }

        _logger.info(
                "\n"
                        + StringUtils.center("Success CURDDemo TradeCode【"
                        + tradeInfo.tradeCode()
                        + "】", 80, '#'));

        return true;
    }
}