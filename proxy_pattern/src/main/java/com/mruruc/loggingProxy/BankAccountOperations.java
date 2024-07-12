package com.mruruc.loggingProxy;
// subject interface
public interface BankAccountOperations {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}
