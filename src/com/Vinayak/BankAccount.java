package com.Vinayak;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String name;
    private String email;
    private long phoneNumber;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void deposit(double deposit) {
        balance += deposit;
        System.out.println("New balance after deposit of " + deposit + " is : " + balance);
    }

    public void withdraw(double deduct) {
        if (balance >= deduct) {
            balance -= deduct;
            System.out.println("New balance after deduct of " + deduct + " is : " + balance);
        } else {
            System.out.println("Insufficient balance please deposit some amount first");
        }
    }
}
