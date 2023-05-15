package chapter5;

import java.util.Scanner;

public class practiceBarChar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //System.out.println("Enter 5 integers number");
        int userInput;
        String star="";
        while(true){
            System.out.println("Enter 5 integers number");
            userInput = input.nextInt();
            while (userInput > 30){
                System.out.println("Enter integer number range from 1 - 30");
                userInput = input.nextInt();
            }
           // System.out.println("Enter 5 integers number");
            //userInput= input.nextInt();
            for(int i = 0 ; i < userInput; i++){
                star+="*";
                if(userInput ==5){
                    break;
                }
            }
            System.out.println(star);
        }



    }


}
