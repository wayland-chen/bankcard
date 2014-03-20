package com.offke.tradeunits.atoms.examples;

import com.offke.core.annotation.stereotype.Component;
import com.offke.core.annotation.stereotype.Component.Status;
import com.offke.core.annotation.stereotype.Item;
import com.offke.core.annotation.stereotype.Item.Nullable;
import com.offke.core.annotation.stereotype.Item.Type;
import com.offke.core.annotation.stereotype.Modified;
import com.offke.core.annotation.stereotype.Parameter;
import com.offke.core.bu.struct.pojo.Condition;
import com.offke.core.bu.struct.pojo.ConditionValue;
import com.offke.core.bu.struct.pojo.QueryResult;
import com.offke.core.standard.abstracts.Atom;
import com.offke.core.status.procedure.TradeInfo;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(
        tradeCode = "90002",
        status = Status.Stop,
        tradeName = "前台通用查询Demo",
        author = "jiangli",
        comment = "前台通用查询Demo",
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
public class SQLConditionQueryTest extends Atom {
    private static final Logger _logger = LoggerFactory.getLogger(SQLConditionQueryTest.class);
    @Override
    public boolean atomicTransaction(TradeInfo tradeInfo) {
        _logger.info("\n" + StringUtils.center("Begin SQLConditionQueryTest TradeCode【" + tradeInfo.tradeCode() + "】", 80, '*'));
        try {
            this.beginTransaction();
            //业务逻辑开始

            /*单表查询, 从第1行到第2行*/
//            QueryResult queryResult = sqlConditionQuery( 0, 2, "select * from T_CARD", new String[]{"T_CARD"} );


            /*单表查询，带条件*/
            /*
            QueryResult queryResult = sqlConditionQuery( 0, 2, "select * from T_CARD", new String[]{"T_CARD"}, 
                                                         new Condition("cardno", 109, Condition.or ), //默认是and连接
                                                         new Condition("cardno", 110),
                                                         new Condition("BADFLAG", 0 )
                                                         );
             */

            /*单表查询，带条件,排序*/
            /*
            QueryResult  queryResult = sqlConditionQuery( 0, 2, "select * from T_CARD", new String[]{"T_CARD"}, 
                                                         new Condition("cardno", 109, new JoinCondition( "or" ) ), //默认是and连接
                                                         new Condition("cardno", 110),
                                                         new Condition("BADFLAG", 0 ),
                                                         new OrderBy( "cardno", OrderBy.desc )//默认为asc
                                                         );
                                                         */

            /*单表查询，in条件, NOT IN也类似*/
            /*
            QueryResult queryResult = sqlConditionQuery( 0, 2, "select * from T_CARD", new String[]{"T_CARD"}, 
                                                         new Condition("cardno", new Integer[]{109,110,111}, Condition.in )
                                                         );
                                                         */

            /*单表查询，in条件, NOT LIKE也类似*/
            QueryResult queryResult = sqlConditionQuery(0, 2, "select * from T_CARD",
                    new String[]{"T_CARD"},
                    new Condition(new ConditionValue("cardno like  '%6%'"))
            );

            tradeInfo.put("result", queryResult.getResult());
            tradeInfo.put("columns", queryResult.getColumns());
            tradeInfo.put("totalItems", queryResult.getTotalItems());

            //业务逻辑结束

            this.commitTransaction();
        } catch (Exception e) {
            this.rollbackTransaction();
            _logger.error("\n" + StringUtils.center("Failure SQLConditionQueryTest TradeCode【" + tradeInfo.tradeCode() + "】", 80, '*'), e);
        }

        _logger.info("\n" + StringUtils.center("Success SQLConditionQueryTest TradeCode【" + tradeInfo.tradeCode() + "】", 80, '*'));

        return true;
    }
}