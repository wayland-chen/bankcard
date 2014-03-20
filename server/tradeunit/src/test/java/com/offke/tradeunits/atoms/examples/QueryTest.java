package com.offke.tradeunits.atoms.examples;

import com.offke.core.annotation.stereotype.Component;
import com.offke.core.annotation.stereotype.Component.Status;
import com.offke.core.annotation.stereotype.Item;
import com.offke.core.annotation.stereotype.Item.Nullable;
import com.offke.core.annotation.stereotype.Item.Type;
import com.offke.core.annotation.stereotype.Modified;
import com.offke.core.annotation.stereotype.Parameter;
import com.offke.core.standard.abstracts.Atom;
import com.offke.core.status.procedure.TradeInfo;
import org.apache.commons.lang.StringUtils;
import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(
        tradeCode = "90001",
        status = Status.Stop,
        tradeName = "通用查询测试",
        author = "jiangli",
        comment = "通用查询测试",
        createDate = "2012/04/12",
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
public class QueryTest extends Atom {
    private static final Logger _logger = LoggerFactory.getLogger(QueryTest.class);

    public QueryTest() {
    }

    private Session session = this.getSession();

    @Override
    public boolean atomicTransaction(TradeInfo tradeInfo) {
        try {
            this.beginTransaction();
            
            /*
            Atom instance = this.instance( "90002" );
            instance.atomicTransaction( tradeInfo );
            */

            //业务逻辑开始
            
            /*
             *  public  Serializable save( Object entityObj )测试
            TBooktype type = new TBooktype( 3, "傅江利测试" );
            save( type );
             */
            
            
            /*
             *     public  int save( String sql, Object... parameters )
             */
//            this.save( "insert into T_BOOKTYPE(booktype,bookname) values(?,?)", 2, "傅江利插入测试" );
            
            /*
             *     public void persist( Object entityObj )
             */
//            TBooktype type = new TBooktype( Byte.valueOf( "3" ), "傅江利测试" );
//            this.persist( type );
            
            /*
             *     public void merge( Object entityObj )
             */
//            TBooktype type = new TBooktype( Byte.valueOf( "3" ), "傅江利更新测试" );
//            merge( type );
            
            /*
             *     public int update( String sql, Object... parameters )
             */
//            update( "update T_BOOKTYPE set bookname=? where booktype=?",  "傅江利测试2", 3 );
            
            /*
             *     public void delete( Object entityObj )
             */
//            TBooktype type = new TBooktype( Byte.valueOf( "3" ), "傅江利更新测试" );
//            delete( type );
            
            /*
             *     public boolean delete(  Class<?> clazz, Serializable id )
             */
//            delete( TBooktype.class, Byte.valueOf( "1" ) );
            
            /*
             *  public int delete( String sql, Object... parameters )
             */
//            delete( "delete from t_booktype where booktype=?", 2 );

//            Object all = this.get( TAccount.class, "1000002648"  );
//            List<?> all = this.getAll( TCardtype.class );

//            List<?> list = sqlQuery( "select * from t_custtype order by custtype asc", 1, 2 );
//            tradeInfo.put( "rets", all  );
//            int amtcmp1 = Calculate.amtcmp( new BigDecimal( "-1" ), BigDecimal.ZERO );
//            int amtcmp2 = Calculate.amtcmp(0, 1);

//            TradeUtils.delCardAccDiffByCardno( session, 4359 );

            _logger.info("EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
            this.commitTransaction();
        } catch (Exception e) {
            this.rollbackTransaction();
            _logger.error("\n" + StringUtils.center("Failure QueryTest TradeCode【" + tradeInfo.tradeCode() + "】", 80, '#'), e);
        }

        _logger.info("\n" + StringUtils.center("Success QueryTest TradeCode【" + tradeInfo.tradeCode() + "】", 80, '#'));

        return true;
    }

}