package myExamplesTutorial;

import java.util.Scanner;

public class Jenifer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter a number or press -1 to exit");
        int userInput = input.nextInt();
        int sum = 0;
        for (; userInput != -1; ) {
            System.out.println("Enter the integers or press -1 to exit");
            sum += userInput;
            userInput = input.nextInt();
        }
        System.out.println("the sum of the total is: " + sum);

    }
}
