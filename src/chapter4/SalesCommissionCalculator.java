package chapter4;

public class SalesCommissionCalculator {
    double commissionPercentage = 0;
    double totalItemSold = 0;
    double calculator = 0;
    double weeklyPay = 200;


    public double salesPersonItemSold(double... product) {
        for (int i = 0; i < product.length; i++)
            totalItemSold += product[i];
        commissionPercentage = (9 * totalItemSold) / 100;
        weeklyPay += commissionPercentage;
        return weeklyPay;
    }

}




