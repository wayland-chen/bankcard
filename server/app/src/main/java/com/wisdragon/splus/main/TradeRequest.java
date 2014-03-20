package com.wisdragon.splus.main;

import com.offke.core.messages.json.JsonException;
import com.offke.core.messages.json.JsonObject;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 12-5-2
 * Time: 下午7:49
 */
public class TradeRequest {
    public static String getRequest(String tradeid, String tradeCode, String bodyString) {

        JsonObject requestObject = new JsonObject();
        JsonObject cmdObject = new JsonObject();


        try {
            requestObject.put("CMD", cmdObject);

            cmdObject.put("appver", "1.0");
            cmdObject.put("tradeid", tradeid);
            cmdObject.put("src", "splusclient");
            cmdObject.put("des", "splusserver");
            cmdObject.put("tradecode", tradeCode);
            cmdObject.put("workdate", "2012-03-29");

            JsonObject dataObject = new JsonObject(bodyString);
            requestObject.put("DATA", dataObject);

        } catch (JsonException e) {
            e.printStackTrace();
        }


        return requestObject.toString();
    }

    public static String getRequest(String tradeString) throws JsonException {
        return new JsonObject(tradeString).toString();
    }

    public static void main(String[] args) throws JsonException {
        System.out.println(getRequest("1234", "111111", "{aaa:123}"));

        String tmp = "{\"HEAD\":{\"traderef\":\"8d55e8fc4bb549c3bf93228974f39ff0\",\"workdate\":\"20130423\"},\"BODY\":{\"reasoncode\":\"0\",\"reasonremark\":\"业务处理成功\"}}";

        System.out.println("BODY="  + new JsonObject(tmp).getJSONObject("BODY").getString("reasoncode"));


    }
}
