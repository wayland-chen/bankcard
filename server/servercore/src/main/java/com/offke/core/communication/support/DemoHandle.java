package com.offke.core.communication.support;

import com.offke.core.common.util.SplusProperties;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import org.apache.commons.io.IOUtils;

import java.io.*;
import java.net.HttpURLConnection;
import java.util.List;

public class DemoHandle implements HttpHandler {

    @Override
    public void handle(HttpExchange httpExchange) throws IOException {
        StringBuffer msg = new StringBuffer();
        OutputStream out = httpExchange.getResponseBody();
        InputStream in = null;

        try {
            msg.append("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
            msg.append("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
            msg.append("<head>");
            msg.append("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />");
            msg.append("<title>校园通交易Demo</title>");
            msg.append("</head>");
            msg.append("<body>");
            in = httpExchange.getRequestBody(); //获得输入流
            List<String> lines = IOUtils.readLines(in);
            if (!lines.isEmpty()) {
                String tradecode = lines.get(0);
                String[] split = tradecode.split("=");
                if (split.length == 2) {
                    File res = new File(SplusProperties.instance().getConfig("app.package.demo") + split[1]);
                    if (res.exists()) {
                        InputStream ins = null;
                        try {
                            ins = new FileInputStream(res);
                            List<String> rets = IOUtils.readLines(ins);
                            StringBuffer sb = new StringBuffer();

                            for (String row : rets) {
                                sb.append(row + "<br/>");
                            }
                            msg.append(sb);
                        } finally {
                            IOUtils.closeQuietly(ins);
                        }
                    } else {
                        msg.append("<h2>报文接口Demo不存在</h2>");
                    }
                }
            }
            msg.append("");
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
