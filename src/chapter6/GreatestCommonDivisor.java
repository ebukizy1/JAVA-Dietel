package chapter6;

public class GreatestCommonDivisor {


    public static int greatestCommonDvisior(int number1, int number2) {
        int gcd = 1;
        int divisor = 2;
        while (divisor <= number1 && divisor <= number2) {
            if (number1 % divisor == 0 && number2 % divisor == 0) {
                gcd = divisor;
            }
            divisor++;
        }
        return gcd;
    }
}



