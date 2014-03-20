package com.offke.core.common.security.decrypt;

import com.offke.core.common.security.util.DesHelper;
import com.offke.core.standard.abstracts.AbstractSecurity;
import org.springframework.stereotype.Component;

/**
 * 解密数据-客户
 */
@Component("DesDecryptToCustomer")
public class DesDecryptToCustomer extends AbstractSecurity {

    @Override
    public <T, V> T process(String key, V value) {
        try {
            return (T) DesHelper.DESDec((String) value);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
