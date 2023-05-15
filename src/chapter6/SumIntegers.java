package chapter6;

public class SumIntegers {


    public  int addSumOfIntegers(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }


}