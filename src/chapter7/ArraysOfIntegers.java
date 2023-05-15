package chapter7;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysOfIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // TODO: 30/04/2023
        /*
        write a program that fill an array with n integers
        entered by the user;
        suppose that the user can enter at least 1 number and at most 20 numbers.
        prompt the user how many numbers he want to enter which is the integer n
        resolve with an array of point not integers
        -> declare a scanner object to take input
        -> prompt the user to enter number above 1 and below 20 at most
        -> collect the user input by storing it in a variable userInput
        -> so we want to keep looping if the user did not enter numbers we instructed it
        also using a do while loop

         */

//        int userInput;
//        do {
//            System.out.println("How many elements? (max is 20 ):");
//            userInput = input.nextInt();
//            if (userInput > 20 || userInput <= 0) {
//                System.out.println("invalid number, try again");
//            }
//        } while (userInput > 20 || userInput <= 0);
//
//            int[] numbers = new int[userInput];
//            fillArrayOfIntegers(numbers);
//            printArrayOfIntegers(numbers);
//


       System.out.println("How many elements? (max is 20 ):");
        int userInput = input.nextInt();
        while(userInput > 20 || userInput <=0){
            System.out.println("invalid number, try again");
            userInput = input.nextInt();
        }
        int[] numbers = new int [userInput];
        fillArrayOfIntegers(numbers);
        printArrayOfIntegers(numbers);
        }

    private static void printArrayOfIntegers(int[] numbers) {
        System.out.println("The element in the array are");
        System.out.println(Arrays.toString(numbers));
    }

    private static void fillArrayOfIntegers(int[] numbers) {
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < numbers.length; i++){
            System.out.println("Enter the element in the arrays");
            numbers[i] = input.nextInt();
        }
    }


}

