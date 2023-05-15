package chapter4;

public class CreditLimit {
    private double balance;


    int creditLimit = 10000;

    public String intialBalance(double beginningBalance, double chargesMonthly, double monthyCredit) {
        balance = (beginningBalance + chargesMonthly) - monthyCredit;
        if (balance > creditLimit) {
            return "credit limit exceeded";
        }
        return "Still have money";
    }

    public double newBalance() {
        return balance;
    }


}
