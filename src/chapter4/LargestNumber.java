package chapter4;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter;
        int largest = 0;
        int number;
        int secondLargest = 0;
        for (counter = 0; counter < 10; counter++) {
            System.out.println(" Enter the number of unit sold by each salesperson:  ");
            number = input.nextInt();
            if (number > largest) largest = number;
        }
        System.out.println(" The largest number is: " + largest);

    }
}
