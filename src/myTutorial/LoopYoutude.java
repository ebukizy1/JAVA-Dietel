package myTutorial;

import java.util.Scanner;

public class LoopYoutude {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println(" Enter a number between 1 to 10:");
//        int number = input.nextInt();
//        int count = 1;
//                while(count <= 10){
//                    if( number>0 && number<=10 ){
//                        System.out.println( number + " is between 1 and 10. " + " thanks!");
//                    }else
//                        System.out.println( number + " is not between 1 and 10. "+ " Try again!.");
//                    number = input.nextInt();
//                }
        System.out.println("Enter a program between 1 and 10:");
        int n = input.nextInt();
        do {
            System.out.println(n + " is between 1 and 10");
        n++;
        } while (n < 1 || n > 10);

    }
        }




