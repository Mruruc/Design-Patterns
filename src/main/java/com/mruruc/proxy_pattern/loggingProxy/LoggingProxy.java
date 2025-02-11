package com.mruruc.proxy_pattern.loggingProxy;

public class LoggingProxy implements BankAccountOperations{
    private final BankAccountOperationsImpl impl;

    public LoggingProxy(final BankAccountOperationsImpl impl) {
        this.impl = impl;
    }

    @Override
    public void deposit(double amount) {
        System.out.println("Logging: Depositing " + amount);
        impl.deposit(amount);
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Logging: Withdrawing " + amount);
        impl.withdraw(amount);
    }

    @Override
    public double getBalance() {
        System.out.println("Logging: Getting balance");
        return impl.getBalance();
    }
}
