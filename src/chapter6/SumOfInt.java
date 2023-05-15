package chapter6;

public class SumOfInt {


    public int CheckIntegers(int number) {
        int count = 0;
        int sum = 0;
        while (number > 0){
           sum+= number%10;
            number/=10;
            count++;
        }
        return sum;
    }

}
