package com.offke.core.common.mgr;

import com.offke.core.bu.struct.pojo.KeyType;
import com.offke.core.standard.interfaces.ISyskey;

import java.util.HashMap;
import java.util.Map;

public class KeyFactory {
    private static KeyFactory self;
    private static Map<KeyType, ISyskey> syskey = new HashMap<KeyType, ISyskey>();

    public static KeyFactory instance() {
        if (self == null) {
            self = new KeyFactory();
        }
        return self;
    }

    private static ISyskey key(KeyType type) {
        return syskey.get(type);
    }

    public static <T> T get(KeyType type) {
//        ISyskey key = key( type );
        ISyskey key = BeanProxy.lookupBean(type.toString());
        if (key == null) {
            throw new RuntimeException(type.name());
        }
        return (T) key.generate(type);
    }

}
