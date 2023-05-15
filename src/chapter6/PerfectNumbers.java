package chapter6;

public class PerfectNumbers {


    public static boolean isPerfectNumbers(int number) {
            if(displayNumbers(number) == number){
                return true;
            }
            return false;
    }

    public static int displayNumbers(int number) {
        int counter;
        int sumOfDivisor = 0;
        for (counter = 1; counter <= number / 2; counter++) {
            if (number % counter == 0)
                sumOfDivisor += counter;
        }
        return sumOfDivisor;
    }
}