package chapter6;

public class primeNumbers {
    public static void main(String[] args) {

        for (int count = 1; count <= 10000; count++) {
            System.out.println(primeNumbersCheck(count));
        }

    }


    public static String primeNumbersCheck(int number) {
        int primeNumber = 0;
        for (int count = 1; count <= Math.sqrt(number); count++) {
            if (number % count == 0) {
                primeNumber++;
            }
        }
            if (primeNumber == 1) {
                return number + " it is a primeNumber";
            }else{
                return    number + " it is not a primeNumber";}


    }
}
