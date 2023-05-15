package tdd;

public class Account {
    private double balance = 0;





    public void deposit(int amount) {
        if (amount > 0){
            balance = balance + amount;
        }
    }

    public double getBalance() {
    return balance;
    }


    public void withdraw(double withdraw) {
        if(withdraw > balance) {
            balance = 0;
            balance = balance-withdraw;
        }
       // balance = balance-withdraw;
    }

}
