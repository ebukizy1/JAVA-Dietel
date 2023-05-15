package chapter5;

import java.util.Scanner;

public class Excerise5_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 integers number");
        int userInput = input.nextInt();
        int i = 1;
        int number = 10;
        int minimum = userInput;
        int maximum = userInput;
        int sum = 0;
        for (i = 1; i <= number; i++) {
            System.out.println("Enter 10 integers numbers");
            userInput = input.nextInt();
            if (userInput > maximum) maximum = userInput;
            if (userInput < minimum) minimum = userInput;
            sum = maximum + minimum;
        }
        System.out.printf("The sum of the  maximum and minimum number is:%d %n ", sum);
        System.out.printf("The maximum number %d%nThe minimum number:%d", maximum, minimum);


    }
}


