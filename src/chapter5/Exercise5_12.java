package chapter5;

import java.util.Scanner;

public class Exercise5_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int number = 30;
        int i;
        int userInput;
        for (i = 1; i <= number; i++) {
            System.out.println("Enter integer number");
            userInput = input.nextInt();
            if (userInput % 3 == 0)
                sum += userInput;
        }
        System.out.printf("The sum of the integer number divisible by 3 %d%n ", sum);
    }


}
