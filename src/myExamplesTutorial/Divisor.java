package myExamplesTutorial;

import java.util.Scanner;

public class Divisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println(" Enter the a number to get the strict divisor ");
//        int n = input.nextInt();
//        int sum = 0;
//        for (int i = 1; i <= n / 2; i++) {
//            if (n % i == 0) {
//                sum += i;
//               System.out.println(" the divisor of a number is " + sum);
//                System.out.println(sum+n);
//            }

                while (true){
                    System.out.println("enter a number ");
                int  sum = input.nextInt();
                sum+=sum;
                if(sum >100) {
                break;}
                }System.out.println("done");

        }
    }
