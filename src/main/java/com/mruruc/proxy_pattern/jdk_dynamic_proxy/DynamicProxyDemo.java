package com.mruruc.proxy_pattern.jdk_dynamic_proxy;


import java.lang.reflect.Proxy;

public class DynamicProxyDemo {

    public static void main(String[] args) {
        BankAccountOperationsImpl bankAccount = new BankAccountOperationsImpl();

        BankAccountOperations proxyInstance = (BankAccountOperations) Proxy.newProxyInstance(
                bankAccount.getClass().getClassLoader(),
                new Class<?>[]{BankAccountOperations.class},
                new LoggingInvocationHandler(bankAccount)
        );

        proxyInstance.deposit(100);
        proxyInstance.withdraw(50);
        proxyInstance.getBalance();

    }
}
