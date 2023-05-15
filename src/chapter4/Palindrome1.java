package chapter4;

import java.util.Scanner;

public class Palindrome1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter five digit");
        String name = input.nextLine();
        int firstNumber = 0;
        int secondNumber = 0;
        int thirdNumber = 0;
        int fourthNumber = 0;
        int fifthNumber = 0;

        while (name.length() != 5 || !name.matches("[0123456789]+")) {
            System.out.println("Enter a five digit Number");
            name = input.nextLine();
        }
        for (int i = name.length() - 1; i >= 0; i--) {
            char reverse1 = name.charAt(i);
            int myNumber = Character.getNumericValue(reverse1);
            if (i == 0) firstNumber = myNumber;
            if (i == 1) secondNumber = myNumber;
            if (i == 2) thirdNumber = myNumber;
            if (i == 3) fourthNumber = myNumber;
            if (i == 4) fifthNumber = myNumber;
        }
        if (firstNumber == fifthNumber && secondNumber == fourthNumber) {
            System.out.println(" it is a palindrome");
        } else System.out.println(" it is not a palindrome");
    }
}










