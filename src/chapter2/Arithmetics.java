package chapter2;

import java.util.Scanner;

public class Arithmetics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter the firstNumber;");
        int firstNumber = input.nextInt();

        int secondNumber;
        int differenceOfSquare = 0;
        int firstNumberSquare;
        int secondNumberSquare2;
        int additionOfNumbers;
        int number = 2;
        int i;
        for (i = 1; i < number; i++) {
            System.out.println("enter the second number");
            secondNumber = input.nextInt();
            firstNumberSquare = firstNumber * firstNumber;
            secondNumberSquare2 = secondNumber * secondNumber;
            additionOfNumbers = firstNumberSquare + secondNumberSquare2;
            if (firstNumberSquare > secondNumberSquare2) {
                differenceOfSquare = firstNumberSquare - secondNumberSquare2;
            } else if (secondNumberSquare2 > firstNumberSquare) {
                differenceOfSquare = secondNumberSquare2 - firstNumberSquare;
            }
            System.out.println(" The square of the First numbers " + firstNumberSquare);
            System.out.println(" The square of the Second numbers " + secondNumberSquare2);
            System.out.println(" The addition of the Square " + additionOfNumbers);
            System.out.println(" the difference of the Square " + differenceOfSquare);
        }


    }
}
