package myExamplesTutorial;

import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the cost of Adeyemi books ");
        int userInput = input.nextInt();
        int totalSales = 0;
        while(userInput != -1){
            totalSales = totalSales + userInput;
            System.out.println("Enter the sales of Adeyemi Book ");
            userInput = input.nextInt();
            double average = totalSales / userInput;
            System.out.println("the average amount he sold " + average);




        }


    }
}
