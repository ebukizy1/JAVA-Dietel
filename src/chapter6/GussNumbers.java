package chapter6;

import java.security.SecureRandom;
import java.util.Scanner;
public class GussNumbers {

   private static Scanner input = new Scanner(System.in);

        public static void menuBar() {
        SecureRandom random = new SecureRandom();
        int randomNumber = random.nextInt(1000);
            String name;
            int guessNumber;
            System.out.println("Player1 Enter your name");
            name = input.nextLine();
            System.out.println("Enter a number from 1 - 1000");
            guessNumber = input.nextInt();
            int counter = 0;
            if(guessNumber == randomNumber) System.out.println( name +" Congratulation!!! you won!!");
            while (guessNumber != randomNumber) {
                if (guessNumber > randomNumber) System.out.println("too high!! try again bro!!");
                    else if (guessNumber < randomNumber) System.out.println("too low!! try again my bro!!");
                        else {System.out.println( name +" Congratulation!!! you won!!");
                        break;}
                guessNumber = input.nextInt();
                counter++;
                if(counter< 10) System.out.println("you got lucky!");
                else if (counter == 10) System.out.println("Aha! You know the secret!");
                else if(counter > 10 )System.out.println(", display You should be able to do better! Why should it\n" +
                        "take no more than 10 guesses?");}
            continueGame();}

        public static void continueGame(){
            System.out.println("1) to continue  2) to exit" );
        int next = input.nextInt();
        switch (next){
            case 1: menuBar();
            case 2:}
        }


}
