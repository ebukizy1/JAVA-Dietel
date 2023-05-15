package chapter5;

import java.util.Scanner;

public class ExceriseBarChart5_16 {
    public static void main(String[] args) {
        BarChart5_16 barChat = new BarChart5_16();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first Number: ");
        int number1 = input.nextInt();
        System.out.println("Enter the second Number: ");
        int number2 = input.nextInt();
        System.out.println("Enter the third Number: ");
        int number3 = input.nextInt();
        System.out.println("Enter the fourth Number: ");
        int number4 = input.nextInt();
        System.out.println("Enter the fifth Number: ");
        int number5 = input.nextInt();


        barChat.setNumberOfStars(number1, number2, number3, number4, number5);
        barChat.displayNumberOfStars();


    }

}
