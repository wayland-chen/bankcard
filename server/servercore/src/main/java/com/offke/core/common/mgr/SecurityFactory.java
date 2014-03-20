package com.offke.core.common.mgr;

import com.offke.core.bu.struct.pojo.SecurityType;
import com.offke.core.bu.struct.pojo.Securitykeys;
import com.offke.core.standard.interfaces.ISecurity;

/**
 * <p>校园通安全处理工厂</p>
 *
 * @version 1.0
 * @since 2012/4/21
 */
public class SecurityFactory {
    /**
     * <p>安全模块功能调用</p>
     *
     * @param securityType 处理类型
     * @param message      数据
     * @return 结果
     */
    public static <T, V> T process(SecurityType securityType, V message) {
        ISecurity run = BeanProxy.lookupBean(securityType.toString());
        if (run == null) {
            throw new RuntimeException("安全模块对应的处理类型【" + securityType + "】不存在");
        }

        return (T) run.process(Securitykeys.DESKEY, message);
    }
}
