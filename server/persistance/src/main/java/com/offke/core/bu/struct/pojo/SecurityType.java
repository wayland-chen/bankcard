package com.offke.core.bu.struct.pojo;

public enum SecurityType {
    DesEncryptToBase64Byte, //des加密,返回base64 byte数组
    DesEncryptToBase64String, //des加密,返回base64编码字符串
    DesDecryptToByte, //des解密,返回byte数组
    DesDecryptToString, //des解密，返回字符串
    DesEncryptToCustomer,
    DesDecryptToCustomer,
    MD5, //生成md5摘要
}
