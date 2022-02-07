package com.spring.java_spring_introduction;

import org.springframework.stereotype.Component;

import java.security.MessageDigest;

@Component("sha256")
public class SHA256 implements Algorithm{

    public static class SHA {
        public static String applySha256(String input){
            try {
                MessageDigest digest = MessageDigest.getInstance("SHA-256");
                byte[] hash = digest.digest(input.getBytes("UTF-8"));
                StringBuffer hexString = new StringBuffer();
                for (int i = 0; i < hash.length; i++) {
                    String hex = Integer.toHexString(0xff & hash[i]);
                    if(hex.length() == 1) hexString.append('0');
                    hexString.append(hex);
                }
                return hexString.toString();
            }
            catch(Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
    @Override
    public void doSmth(String text) {
        System.out.println("SHA256: " + SHA.applySha256(text));
    }
}