package com.offke.core.common.security.util;

import org.apache.commons.lang.StringUtils;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.SecretKeySpec;
import java.text.MessageFormat;

public class DesHelper {
    private static byte[] key = {'1', '2', '3', '4', '5', '6', '7', '8'};

    public static String toHEX(byte b) {
        int i = b & 0X00FF;
        char hi, low;
        if (i / 16 < 10)
            hi = (char) ('0' + i / 16);
        else
            hi = (char) ('A' + i / 16 - 10);
        if (i % 16 < 10)
            low = (char) ('0' + i % 16);
        else
            low = (char) ('A' + i % 16 - 10);
        return hi + "" + low;

    }

    public static byte[] hexStr2ByteArr(String strIn) throws Exception {
        byte[] arrB = strIn.getBytes();
        int iLen = arrB.length;
        // 两个字符表示一个字节，所以字节数组长度是字符串长度除以2
        byte[] arrOut = new byte[iLen / 2];
        for (int i = 0; i < iLen; i = i + 2) {
            String strTmp = new String(arrB, i, 2);
            arrOut[i / 2] = (byte) Integer.parseInt(strTmp, 16);
        }
        return arrOut;
    }

    public static String DESEnc(String s) throws Exception {
        byte[] clearText = {'\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
        byte[] bytes = s.getBytes();
        byte[] cipherText;
        SecretKey desKey = new SecretKeySpec(key, "DES");
        Cipher desCipher;
        //			Create the cipher
        desCipher = Cipher.getInstance("DES/ECB/NoPadding");
        //desCipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
        //	   Initialize the cipher for encryption
        desCipher.init(Cipher.ENCRYPT_MODE, desKey);
        System.arraycopy(bytes, 0, clearText, 0, (bytes.length < clearText.length ? bytes.length : clearText.length));
        cipherText = desCipher.doFinal(clearText);

        String ciphered = "";
        for (byte aCipherText : cipherText) {
            ciphered += toHEX(aCipherText);
        }
        return ciphered;
    }

    public static String DESDec(String pwd) throws Exception {
        DESKeySpec dks = new DESKeySpec(key);
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
        SecretKey secretKey = keyFactory.generateSecret(dks);
        Cipher cipher = Cipher.getInstance("DES/ECB/NoPadding");
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] cipherText = cipher.doFinal(hexStr2ByteArr(pwd));
        int i = 0;
        for (; i < cipherText.length; i++) {
            if (cipherText[i] == 0) {
                break;
            }
        }
        return new String(cipherText, 0, i);
    }

    public static String format(String src) {
        String dist = "######";
        try {
            MessageFormat format = new MessageFormat("{0,number,#.##}");
            if (StringUtils.isNotBlank(src)) {
                src = src.trim();
                Object[] objs = {Double.valueOf(src)};
                dist = format.format(objs);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dist;
    }


    /**
     * A algorithm base on DES, you can use your own key to encrypt the password
     * the length of the key and password should not be greater than 8
     *
     * @param key      secret key which is used to encrypt password
     * @param password original password
     * @return encrypted password
     * @throws Exception .
     */
    public static String DESEnc(String key, String password) throws Exception {
        byte[] clearText = {'\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
        byte[] bytes = password.getBytes();
        byte[] cipherText;
        byte[] keyText = {'\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
        byte[] temp = key.getBytes();
        System.arraycopy(temp, 0, keyText, 0, (keyText.length < temp.length ? keyText.length : temp.length));
        SecretKey desKey = new SecretKeySpec(keyText, "DES");
        Cipher desCipher;
        //Create the cipher
        desCipher = Cipher.getInstance("DES/ECB/NoPadding");
        //Initialize the cipher for encryption
        desCipher.init(Cipher.ENCRYPT_MODE, desKey);
        System.arraycopy(bytes, 0, clearText, 0, (bytes.length < clearText.length ? bytes.length : clearText.length));
        cipherText = desCipher.doFinal(clearText);

        String ciphered = "";
        for (byte aCipherText : cipherText) {
            ciphered += toHEX(aCipherText);
        }
        return ciphered;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(DESEnc("666666"));
        System.out.println(DESDec("F2CEF513747713F7"));
        System.out.println(DESDec("642D7C8EB2C8E658"));
        System.out.println(DESEnc("system", "111111"));
    }
}
