package myExamplesTutorial;

import java.util.Scanner;

public class SentinelLoops {
    public static void main(String[] args) {

        //CONTROL LO
        Scanner input= new Scanner(System.in);
        int sales;
        int totalSales = 0;
        int counter = 0;
        while(counter < 5) {
            System.out.println("Enter sales for product " + (counter));
           totalSales += input.nextInt();
          //  totalSales += sales;
            counter = counter + 1;
            System.out.println("Total sales is " + totalSales);
            System.out.println("\n");

        }
        }
    }

