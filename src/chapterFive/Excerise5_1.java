package chapterFive;

import java.util.Scanner;

public class Excerise5_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer, the input ends if it is 0: ");
        int userInput = input.nextInt();
        int positiveNumbers = 0;
        int negativeNumbers = 0;
        double total = 0;
        double average = 0;
        int sum = 0;
        while(userInput != 0) {
            System.out.println("Enter an integer, the input end if it is 0: ");
            userInput = input.nextInt();
            if (userInput > 0) positiveNumbers = userInput;
            if (userInput < 0) negativeNumbers = userInput;
            sum = positiveNumbers + negativeNumbers;
            total = positiveNumbers + negativeNumbers;
            average = total / sum;
        }
        System.out.printf("The number of positive numbers is %d%n", positiveNumbers );
        System.out.printf("The number of negative numbers is %d%n", negativeNumbers);
        System.out.printf("The total is %.1f%n ", total);
        System.out.printf(" The average is %.1f%n ", average);



        }

    }

