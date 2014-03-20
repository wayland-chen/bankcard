package com.offke.core.communication.support;

import com.offke.core.annotation.stereotype.Item;
import com.offke.core.annotation.stereotype.Parameter;
import com.offke.core.bu.struct.pojo.AtomInfo;
import com.offke.core.common.mgr.Atommgr;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;

@SuppressWarnings("restriction")
public class ParameterHandle implements HttpHandler {

    @Override
    public void handle(HttpExchange httpExchange) throws IOException {
        StringBuffer msg = new StringBuffer();
        OutputStream out = httpExchange.getResponseBody();
        InputStream in = null;
        try {
            Map<String, AtomInfo> configs = Atommgr.instance().getAtomConfigs();
            msg
                    .append("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
            msg.append("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
            msg.append("<head>");
            msg.append("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />");
            msg.append("<title>校园通交易接口</title>");
            msg.append("</head>");
            msg.append("<body>");
            msg.append("<table width='100%' border='1'>");
            in = httpExchange.getRequestBody(); //获得输入流
            List<String> lines = IOUtils.readLines(in);
            if (!lines.isEmpty()) {
                String tradecode = lines.get(0);
                String[] split = tradecode.split("=");
                if (split.length == 2) {
                    String tradeCode = split[1];

                    AtomInfo atomInfo = configs.get(tradeCode);

                    msg.append("<h2 align='center'>"
                            + atomInfo.getTradeName()
                            + "("
                            + atomInfo.getTradeCode()
                            + ")"
                            + "</h2>");

                    Map<String, Parameter> atomParameters = atomInfo.getAtomParameters();
                    if (atomParameters != null) {
                        for (Map.Entry<String, Parameter> entry : atomParameters.entrySet()) {
                            if (entry.getValue().demo() != null && !entry.getValue().demo().isEmpty()) {
                                msg.append("<form  style='display:none'  name='form"
                                        + entry.getValue().demo()
                                        + "' id='form"
                                        + entry.getValue().demo()
                                        + "' action='/demo' method='post'>");
                                msg.append("<input type='hidden' name='classify' value='"
                                        + entry.getValue().demo()
                                        + "' />");
                                msg.append("</form>");
                            }
                            msg.append("<tr><td colspan='5' bgcolor='#CCFFFF'><strong><a href='javascript:form"
                                    + entry.getValue().demo()
                                    + ".submit()'>"
                                    + entry.getKey()
                                    + "</a></strong></td></tr>");
                            msg
                                    .append("<tr bgcolor='#CCCCCC'><td width='15%'>名称</td><td width='15%'>中文注解</td><td width='10%'>可为空</td><td width='12%'>类型</td> <td width='15%'>备注</td></tr>");
                            msg.append("<tr><td colspan='5' bgcolor='#F7F7F7'>入口参数</td></tr>");
                            if (entry.getValue().inputs() != null && entry.getValue().inputs().length > 0) {
                                for (Item p : entry.getValue().inputs()) {
                                    msg.append("<tr><td>"
                                            + p.id()
                                            + "</td><td>"
                                            + p.name()
                                            + "</td><td>"
                                            + p.nullable()
                                            + "</td><td>"
                                            + p.type()
                                            + "</td><td>"
                                            + p.explain()
                                            + "</td></tr>");
                                }
                            } else {
                                msg.append(" <tr><td colspan='5'>无</td></tr>");
                            }

                            msg.append("<tr><td colspan='5' bgcolor='#F7F7F7'>出口参数</td></tr>");
                            if (entry.getValue().outputs() != null && entry.getValue().outputs().length > 0) {
                                for (Item p : entry.getValue().outputs()) {
                                    msg.append("<tr><td>"
                                            + p.id()
                                            + "</td><td>"
                                            + p.name()
                                            + "</td><td>"
                                            + p.nullable()
                                            + "</td><td>"
                                            + p.type()
                                            + "</td><td>"
                                            + p.explain()
                                            + "</td></tr>");
                                }
                            } else {
                                msg.append(" <tr><td colspan='5'>无</td></tr>");
                            }
                        }
                    }

                }
            }
            msg.append("</table>");
            msg.append("</body>");
            msg.append("</html>");

            httpExchange.sendResponseHeaders(HttpURLConnection.HTTP_OK, msg.toString().getBytes().length);
            out.write(msg.toString().getBytes());
            out.flush();
        } finally {
            IOUtils.closeQuietly(out);
            IOUtils.closeQuietly(in);
        }

    }
}
