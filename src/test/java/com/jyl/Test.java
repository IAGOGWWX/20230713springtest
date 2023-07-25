package com.jyl;

import org.jasypt.util.text.BasicTextEncryptor;

public class Test {
    public static void main(String[] args) {

        BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
        textEncryptor.setPassword("123456@!#$"); //加密所需的salt(盐)
        String username = textEncryptor.encrypt("root");//要加密的数据（数据库
        String password = textEncryptor.encrypt("123456");
        System.out.println(username);
        System.out.println(password);
    }
}
