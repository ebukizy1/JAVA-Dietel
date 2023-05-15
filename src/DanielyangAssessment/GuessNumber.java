package DanielyangAssessment;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        int number1 = (int) (Math.random() * 100);
        Scanner input = new Scanner(System.in);
        System.out.println(" Guess a magic number between 0 and 100 ");
            int guess = 0;
        while ( guess != number1) {
            System.out.println("Enter your guess");
            guess = input.nextInt();
            if (guess == number1) {
                System.out.println("yes, the number is " + number1);
            } else if (guess > number1) {
                System.out.println("Your guess is too high");
            } else
                System.out.println("Your guess is too low");
        }


    }


}
