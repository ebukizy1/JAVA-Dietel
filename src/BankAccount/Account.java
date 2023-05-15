package BankAccount;

public class Account {
    private int balance;



    public void deposit(int amount) {
        if (amount > 0) balance = balance + amount;
    }

    public double getbalance() {
        return balance;
    }
     public void withdraw(int withdrawal) {
        if (withdrawal > balance || withdrawal < 0 ) {
            balance = balance;
        }else
            balance = balance - withdrawal;
     }

}


