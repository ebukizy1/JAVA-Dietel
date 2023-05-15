package chapter4;

import java.util.Scanner;

public class ValidateUserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter 1 for pass and 2 for fail: ");
        int studentCounter = input.nextInt();
        int passes = 0;
        int failures = 0;
        while (studentCounter != 1 && studentCounter != 2) {
            System.out.println(" Enter 1 for pass and 2 for fail: ");
            int result = input.nextInt();
            if (studentCounter >= 10) {
                if (result == 1) {
                    passes = passes + 1;
                } else if (result == 2) failures = failures + 1;
            }
            studentCounter++;
        }
        System.out.printf(" passes: %d%n failures %d%n ", passes, failures);
        if (passes > 8) {
            System.out.println(" bonus!! to instructor ");
        }


    }


}
