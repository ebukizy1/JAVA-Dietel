package chapter5;

public class CompoundInterest {
    public static void main(String[] args) {
        double principal = 1000.0;
        double rate = 0.05;
        int years;
        double amount = 0;

        System.out.printf("%s%20s%n", "Year", "Amount on deposit");
        for (years = 1; years <= 10; ++years) {
            amount = principal * Math.pow(1.0 + rate, years);


            // System.out.printf("%4d%,20.2f%n", years, amount "\t\t" a);

        }


    }
}
