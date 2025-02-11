package com.mruruc.proxy_pattern.securityProxy;

public class App {
    public static void main(String[] args) {

        SensitiveResource authorizedProxy = new SecurityProxy("admin");
        //authorizedProxy.accessResource();

        SensitiveResource unAuthorizedProxy = new SecurityProxy("Mruruc");
        unAuthorizedProxy.accessResource();
    }
}
