package com.offke.core.common.security.decrypt;

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
 * <p>des加密实现，返回Base64字符串</p>
 *
 * @version 1.0
 * @since 2012/04/21
 */
@Component("DesDecryptToString")
public class DesDecryptToString extends AbstractSecurity {

    @Override
    public <T, V> T process(String key, V value) {
        try {
            byte[] bytesrc = Base64.decodeBase64(((ByteBuffer) value).array());
            Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
            DESKeySpec desKeySpec = new DESKeySpec(key.getBytes(charsetName));
            SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
            SecretKey secretKey = keyFactory.generateSecret(desKeySpec);
            IvParameterSpec iv = new IvParameterSpec(key.getBytes(charsetName));

            cipher.init(Cipher.DECRYPT_MODE, secretKey, iv);

            byte[] retByte = cipher.doFinal(bytesrc);
            return (T) new String(retByte);
        } catch (Exception e) {
            throw new RuntimeException("zl_90016", e);
        }
    }
}
