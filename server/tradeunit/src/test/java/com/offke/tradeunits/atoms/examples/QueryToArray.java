package com.offke.tradeunits.atoms.examples;

import com.offke.core.annotation.stereotype.Component;
import com.offke.core.annotation.stereotype.Component.Status;
import com.offke.core.annotation.stereotype.Item;
import com.offke.core.annotation.stereotype.Item.Nullable;
import com.offke.core.annotation.stereotype.Item.Type;
import com.offke.core.annotation.stereotype.Modified;
import com.offke.core.annotation.stereotype.Parameter;
import com.offke.core.bu.struct.pojo.Condition;
import com.offke.core.bu.struct.pojo.QueryResult;
import com.offke.core.standard.abstracts.Atom;
import com.offke.core.status.procedure.TradeInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(tradeCode = "90005",
        status = Status.Stop,
        tradeName = "查询测试",
        author = "jiangli",
        comment = "查询测试",
        createDate = "2012/04/19",
        params = {
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
public class QueryToArray extends Atom {
    private static final Logger _logger = LoggerFactory.getLogger(QueryToArray.class);

    @Override
    public boolean atomicTransaction(TradeInfo tradeInfo) {

        try {
            this.beginTransaction();
            //业务逻辑开始

            QueryResult queryResult =
                    sqlConditionQuery(
                            0,
                            2,
                            "select * from T_CARD",
                            new String[]{"T_CARD"},
                            new Condition("cardno", 6, Condition.like));

            tradeInfo.put("result", queryResult.getResult());
            tradeInfo.put("columns", queryResult.getColumns());
            tradeInfo.put("totalItems", queryResult.getTotalItems());

            //业务逻辑结束

            this.commitTransaction();
        } catch (Exception e) {
            this.rollbackTransaction();
        }


        return true;
    }
}