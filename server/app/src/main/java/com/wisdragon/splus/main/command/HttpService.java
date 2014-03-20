package com.wisdragon.splus.main.command;

import com.offke.core.common.util.SplusProperties;
import com.offke.core.communication.support.DemoHandle;
import com.offke.core.communication.support.IndexHandle;
import com.offke.core.communication.support.ParameterHandle;
import com.offke.core.standard.interfaces.ICommand;
import com.offke.core.status.procedure.TradeInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.InetSocketAddress;

/**
 * <p>httpserver服务启动</p>
 *
 * @version 1.0
 * @since 2012/3/31
 */
public class HttpService implements ICommand {
    private static final Logger _logger = LoggerFactory.getLogger(HttpService.class);
    private com.sun.net.httpserver.HttpServer hs;

    @Override
    public boolean execute(TradeInfo tradeInfo) {
        String debug = SplusProperties.getConfig("app.debug");
        if (debug == null || !debug.equalsIgnoreCase("true")) {
            return true;
        }

        _logger.info("Begin HttpService........");

        try {
            String port = SplusProperties.getConfig("support.httpserver.port");
            _logger.info("对外提供服务的接口【" + port + "】");
            hs =
                    com.sun.net.httpserver.HttpServer
                            .create(new InetSocketAddress(Integer.valueOf(port.trim())), 2);
            hs.createContext("/", new IndexHandle());
            hs.createContext("/parameter", new ParameterHandle());
            hs.createContext("/demo", new DemoHandle());
            hs.setExecutor(null); // creates a default executor
            hs.start();
        } catch (IOException e) {
            _logger.error("Error HttpService.", e);
        }

        _logger.info("Success HttpService.");
        return true;
    }

    @Override
    public void stop() {
        if (hs != null) {
            hs.stop(2);
        }
    }

}
