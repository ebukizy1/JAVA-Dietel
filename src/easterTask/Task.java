package easterTask;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println(" Enter 5 an integers ");
        int digit = input.nextInt();
        int firstNumber = 0;
        int secondNumber = 0;
        int thirdNumber;
        int fourthNumber = 0;
        int fifthNumber = 0;
        int number;


        if (digit <= 5) {
            while (digit > 0) {

                firstNumber = digit % 10;
                number = digit / 10;
                secondNumber = number % 10;
                number = number / 10;
                thirdNumber = number % 10;
                number = number / 10;
                fourthNumber = number % 10;
                number = number / 10;
                fifthNumber = number % 10;
                digit++;
            }
            if (firstNumber == fifthNumber && secondNumber == fourthNumber) System.out.println(true);
        }


    }


}