package com.Vinayak;

public class helloWorld {
    public static void main(String[] a) {
        BankAccount bank = new BankAccount();
        bank.setAccountNumber(123456789);
        bank.setBalance(1000);
        bank.setEmail("vinay910@yahoo.co.in");
        bank.setName("Vinayak Mahajan");
        bank.setPhoneNumber(917838867949L);
        bank.deposit(99.99);
        bank.withdraw(1100.00);
        System.out.println("Account Number:- " + bank.getAccountNumber() + "\nName:- " + bank.getName() + "\nEmail:- " + bank.getEmail() + "\nPhone:- " + bank.getPhoneNumber() + "\nBalance:- " + bank.getBalance());
        VipCustomer vip=new VipCustomer();
        VipCustomer vip1=new VipCustomer("hell0",9000,"go");
        System.out.println("Email:- "+vip.getEmail()+"\nName:- "+vip.getName()+"\nLimit Amount:- "+vip.getLimit());
        System.out.println("Email:- "+vip1.getEmail()+"\nName:- "+vip1.getName()+"\nLimit Amount:- "+vip1.getLimit());
    }
}
