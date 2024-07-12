package com.mruruc.jdk_dynamic_proxy;
// subject interface
public interface BankAccountOperations {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}
