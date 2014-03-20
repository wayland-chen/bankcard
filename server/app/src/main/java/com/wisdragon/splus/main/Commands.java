package com.wisdragon.splus.main;

import com.offke.core.standard.interfaces.ICommand;
import com.offke.core.status.procedure.TradeInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedList;
import java.util.List;

/**
 * <p>启动服务</p>
 *
 * @version 1.0
 * @since 2012/4/3
 */
public class Commands {
    private static final Logger _logger = LoggerFactory.getLogger(Commands.class);
    private final static List<ICommand> commands;

    static {
        commands = new LinkedList<ICommand>();
        commands.add(new com.wisdragon.splus.main.command.BaseServices());
        commands.add(new com.wisdragon.splus.main.command.ICEService());
        //commands.add(new com.wisdragon.splus.main.command.HttpService());
    }

    /**
     * <p>启动系统服务</p>
     *
     * @throws Exception
     */
    public static void start() throws Exception {
        _logger.info("Begin StartCommands...");

        TradeInfo tradeInfo = new TradeInfo();
        try {
            for (ICommand command : commands) {
                command.execute(tradeInfo);
            }

        } catch (Exception e) {
            _logger.error("Error StartCommands", e);
            throw e;
        }

        _logger.info("End StartCommands.");
    }

    /**
     * <p>停止系统服务</p>
     *
     */
    public static void stop() {
        for (ICommand com : commands) {
            com.stop();
        }
    }
}
