package com.offke.core.common.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 系统开关
 *
 * @version 1.0
 * @since 2012/5/15
 */
public class Splusswitch {
    private static final Logger _logger = LoggerFactory.getLogger(Splusswitch.class);

    /**
     * 停止系统
     *
     * @param status
     */
    public static void stop(int status) {
        _logger.warn("调用了停止系统操作【" + status + "】");
        System.exit(status);
    }
}
