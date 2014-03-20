package com.offke.core.common.security.encrypt;

import com.offke.core.common.security.util.DesHelper;
import com.offke.core.standard.abstracts.AbstractSecurity;
import org.springframework.stereotype.Component;

/**
 * 加密数据-客户
 */
@Component("DesEncryptToCustomer")
public class DesEncryptToCustomer extends AbstractSecurity {

    @Override
    public <T, V> T process(String key, V value) {
        try {
            return (T) DesHelper.DESEnc((String) value);
        } catch (Exception e) {
            throw new RuntimeException("zl_90015", e);
        }
    }

}
