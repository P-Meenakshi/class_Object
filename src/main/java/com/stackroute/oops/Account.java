package com.stackroute.oops;


/*
   This class is used to store account details
 */
public class Account {
    private String status;
    private int accountNo;
    private double balance;
    private static int counter;
    private int amount;
    public Account(double balance, String status) {
        this.balance=balance;
        this.status=status;
        counter++;
        accountNo=counter;
    }
    public boolean depositAmount(double amount) {
        String status = this.status;
        if(status.equals("active")){
            balance+=amount;
            return true;
        }else
        return false;
    }

    public String getAccountDetails() {
        return ("[Account No : "+accountNo + ", Status : "+status+", Balance : "+balance+"]");
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {

        Account.counter=counter;
    }

    public int getAccountNo() {
        accountNo = this.counter;
        return accountNo;
    }
    public double getBalance() {
        return balance;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status=status;
    }
}