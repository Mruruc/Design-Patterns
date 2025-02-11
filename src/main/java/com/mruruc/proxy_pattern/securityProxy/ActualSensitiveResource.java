package com.mruruc.proxy_pattern.securityProxy;

public class ActualSensitiveResource implements SensitiveResource{
    protected ActualSensitiveResource(){}
    @Override
    public void accessResource() {
        System.out.println("Accessed Sensitive Resource !");
    }
}
