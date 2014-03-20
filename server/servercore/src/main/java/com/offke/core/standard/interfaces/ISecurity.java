package com.offke.core.standard.interfaces;


public interface ISecurity {
    String charsetName = "UTF-8";

    <T, V> T process(String key, V value);
}
