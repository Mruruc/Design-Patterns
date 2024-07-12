package com.mruruc.loggingProxy;

public class BankAccountOperationsImpl implements BankAccountOperations {
    private double balance;

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) balance -= amount;
        else System.out.println("Insufficient balance for the withdrawal of: "+amount);
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
