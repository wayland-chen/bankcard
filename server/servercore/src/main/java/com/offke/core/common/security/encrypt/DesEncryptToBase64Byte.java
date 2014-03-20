package com.offke.core.common.security.encrypt;

import com.offke.core.standard.abstracts.AbstractSecurity;
import org.apache.commons.codec.binary.Base64;
import org.springframework.stereotype.Component;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import java.nio.ByteBuffer;

/**
 * 加密数据，返回 Base64 byte数组
 */
@Component("DesEncryptToBase64Byte")
public class DesEncryptToBase64Byte extends AbstractSecurity {

    @Override
    public <T, V> T process(String key, V value) {
        Cipher cipher;
        try {
            cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");

            DESKeySpec desKeySpec = new DESKeySpec(key.getBytes(charsetName));
            SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
            SecretKey secretKey = keyFactory.generateSecret(desKeySpec);
            IvParameterSpec iv = new IvParameterSpec(key.getBytes(charsetName));
            cipher.init(Cipher.ENCRYPT_MODE, secretKey, iv);
            byte[] b = cipher.doFinal(((ByteBuffer) value).array());

            return (T) Base64.encodeBase64(b);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
