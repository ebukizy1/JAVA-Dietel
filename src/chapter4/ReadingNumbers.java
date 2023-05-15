package chapter4;

import java.util.Scanner;

public class ReadingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a firstNumber");
        int firstNumber = input.nextInt();
        int sum=0;
        while(firstNumber>=sum){
            System.out.println("Enter a Number");
          int    number = input.nextInt();
            sum +=number;
            System.out.println("the first number " + firstNumber);
            System.out.println(" The sum of the number is "+ sum );

            }


        }
    }

