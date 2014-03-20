package com.offke.core.communication.support;

import com.offke.core.annotation.stereotype.Component.Status;
import com.offke.core.bu.struct.pojo.AtomInfo;
import com.offke.core.common.mgr.Atommgr;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IndexHandle implements HttpHandler {

    @Override
    public void handle(HttpExchange httpExchange) throws IOException {
        StringBuffer msg = new StringBuffer();
        OutputStream out = httpExchange.getResponseBody();

        try {

            Map<String, AtomInfo> configs = sortMapByKey(Atommgr.instance().getAtomConfigs());
            msg
                    .append("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
            msg.append("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
            msg.append("<head>");
            msg.append("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />");
            msg.append("<title>校园通交易列表</title>");
            msg.append("</head>");
            msg.append("<body>");
            msg.append("<h2 align='center'>智隆校园通交易列表</h2>");
            msg.append("<table width='100%' border='1'>");
            msg.append("<thead  style='background-color:#CCC'><td>交易码</td><td>交易名称</td><td>功能详述</td><td>作者</td></thead>");
            for (Entry<String, AtomInfo> entry : configs.entrySet()) {
                if (entry.getValue().isInternal() || entry.getValue().getStatus() == Status.Stop) {
                    continue;
                }
                msg.append("<tr>");
                msg.append("<form  style='display:none'  name='form"
                        + entry.getKey()
                        + "' id='form"
                        + entry.getKey()
                        + "' action='/parameter' method='post'>");
                msg.append("<input type='hidden' name='tradeCode' value='" + entry.getKey() + "' />");
                msg.append("</form>");
                msg.append("<td style='width:90px;'><a href='javascript:form"
                        + entry.getKey()
                        + ".submit()'>"
                        + entry.getKey()
                        + "</a></td>");
                msg.append("<td style='width:300;'>" + entry.getValue().getTradeName() + "</td>");
                msg.append("<td>" + entry.getValue().getComment() + "</td>");
                msg.append("<td style='width:60;'>" + entry.getValue().getAuthor() + "</td>");
                msg.append("</tr>");
            }
            msg.append("</table>");
            msg.append("</body>");
            msg.append("</html>");
            httpExchange.sendResponseHeaders(HttpURLConnection.HTTP_OK, msg.toString().getBytes().length);
            out.write(msg.toString().getBytes());
            out.flush();
        } finally {
            IOUtils.closeQuietly(out);
        }

    }

    public Map<String, AtomInfo> sortMapByKey(Map<String, AtomInfo> oriMap) {
        if (oriMap == null || oriMap.isEmpty()) {
            return null;
        }
        Map<String, AtomInfo> sortedMap = new TreeMap<String, AtomInfo>(new Comparator<String>() {
            public int compare(String key1, String key2) {
                int intKey1 = 0, intKey2 = 0;
                try {
                    intKey1 = getInt(key1);
                    intKey2 = getInt(key2);
                } catch (Exception e) {
                    intKey1 = 0;
                    intKey2 = 0;
                }
                return intKey1 - intKey2;
            }
        });
        sortedMap.putAll(oriMap);
        return sortedMap;
    }

    private int getInt(String str) {
        int i = 0;
        try {
            Pattern p = Pattern.compile("^\\d+");
            Matcher m = p.matcher(str);
            if (m.find()) {
                i = Integer.valueOf(m.group());
            }
        } catch (NumberFormatException e) {
        }
        return i;
    }

}
