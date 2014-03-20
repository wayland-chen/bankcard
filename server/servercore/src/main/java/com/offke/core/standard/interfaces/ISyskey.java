package com.offke.core.standard.interfaces;

import com.offke.core.bu.struct.pojo.KeyType;

public interface ISyskey {
    public <T> T generate(KeyType type);
}
