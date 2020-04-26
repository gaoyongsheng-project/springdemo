package com.example.securityfix;

public class DecryptTest {

    public static void main(String[] args) {
        String username = "YWRtaW4=";
        username = new String(DecryptUtil.decode(username));
        System.out.println(username);
    }
}
