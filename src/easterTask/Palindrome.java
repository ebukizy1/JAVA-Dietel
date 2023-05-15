package easterTask;

import chapter5.GlobalWarmingMain;

public class Palindrome {
    public static void main(String[] args) {

        palindlindrome(11111);


    }

    public static void palindlindrome(int number) {
        int firstNumber = 0;
        int secondNumber = 0;
        int thirdNumber = 0;
        int fourthNumber = 0;
        int fifthNumber = 0;
        int number1;
        firstNumber = number % 10;
        number = number / 10;
        secondNumber = number % 10;
        number = number / 10;
        thirdNumber = number % 10;
        number = number / 10;
        fourthNumber = number % 10;
        number = number / 10;
        fifthNumber = number % 10;
        number = number / 10;
        if (firstNumber == fifthNumber && secondNumber == fourthNumber) {
            System.out.println("it is a palindrome");
        } else System.out.println("it is not a palindrome");
    }
}
