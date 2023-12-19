package com.example.certificate_management.utils;

public class Utils {
    public boolean checkCertificateId(String id){
        if (id.matches("^[a-zA-Z0-9-]*$")){
            return true;
        }else {
            return false;
        }
    }
}
