package chapter4;

import java.util.Scanner;

public class SpecificSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");
        int userInput = input.nextInt();
        int sum = 0;

        while (sum < userInput) {
            System.out.println("enter an integer");
            sum += input.nextInt();
            sum++;
        }
        System.out.println(sum);


    }

}

