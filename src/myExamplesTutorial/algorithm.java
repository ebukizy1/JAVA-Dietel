package myExamplesTutorial;

import java.util.Scanner;

public class algorithm {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int number = userInput.nextInt();
        if (number > 6) {
            System.out.println("number is greater than 6" );
        }else if(number == 6){
            System.out.println("number is equal to 6");
        }
        else  {
            System.out.println("number is less than 6" + number);
        }
    }
}