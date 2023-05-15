package easterTask;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter the fibonacci number");
         int number = input.nextInt();
        int i ;
        int firstNumber = 0;
        int secondNumber= 1;
        int thirdNumber = 0;

        for(i = 0; i<=number; i++) {
            thirdNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = thirdNumber;
            System.out.println(firstNumber);
        }
          //  System.out.println( "result " + (thirdNumber == 0? 1 : thirdNumber ));
//        int number;
//        int secondNumber = 0;
//        int thirdNumber = 0;
//        int i =  1;
//        System.out.println("Enter an integer");
//
//        for ( i = 1; i <=10; i++) {
//            thirdNumber = number + secondNumber;
//            secondNumber = number;
//            number = thirdNumber;
//            System.out.println(number);


        }




        }




