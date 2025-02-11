package com.mruruc.proxy_pattern.loggingProxy;


public class App {
    public static void main(String[] args) {
        BankAccountOperations bankAccountOperations =
                new LoggingProxy(new BankAccountOperationsImpl());
        bankAccountOperations.deposit(50);
        bankAccountOperations.withdraw(30);
        bankAccountOperations.getBalance();
    }
}
