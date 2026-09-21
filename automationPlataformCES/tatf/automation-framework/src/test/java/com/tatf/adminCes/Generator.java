package com.tatf.adminCes;

public class Generator {

    public static String generateEmail(String firstName, String lastname, String domain, String TLD){
        String timestamp = String.valueOf(System.currentTimeMillis());
        String email = firstName+lastname+timestamp+"@"+domain+TLD;
        return email;
    }
}
