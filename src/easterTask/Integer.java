package easterTask;

import javax.swing.*;
import java.util.Scanner;

public class Integer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter an integer ");
        int number = input.nextInt();

        int largestNumber = number;
        int lowestNumber = number;
        int integer;

        if(number>=0) {
            while (true) {
                number = input.nextInt();
                if (number < 0) {
                    break;
                }
                if (number > largestNumber)
                    largestNumber = number;
                if (number < lowestNumber)
                    lowestNumber = number;
            }
            System.out.println(" The largest Number is " + largestNumber);
            System.out.println(" The lowest Number is " + lowestNumber);

        }else
            System.out.println(" number is invalid");



    }
}
