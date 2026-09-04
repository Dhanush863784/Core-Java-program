package com.tnsif.ploymethod;


class BankAccount {

    void calculateInterest(double amount) {
        System.out.println("Bank Account");
        System.out.println("Principal: " + amount);
    }
}

class FixedDeposit extends BankAccount {

    @Override
    void calculateInterest(double amount) {
        double interest = amount * 0.04;

        System.out.println("Fixed Deposit Account");
        System.out.println("Principal: " + amount);
        System.out.println("Interest: " + interest);
    }
}

public class MethodOverriding {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();
        account.calculateInterest(10000);
       
        System.out.println("data enterd and sucessfully and validated");

        BankAccount fd = new FixedDeposit();
        fd.calculateInterest(10000);
    }
}