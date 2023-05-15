package myExamplesTutorial;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Increment {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number ");
        int userInput = input.nextInt();
        if (userInput > 0) {
            System.out.println("Number is positive ");
        }else if(userInput < 0){
            System.out.println("number is Negative ");
        }else{
            System.out.println("number is zero");
        }


    }
}
