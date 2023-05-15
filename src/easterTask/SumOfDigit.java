package easterTask;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter the Integer");
        int number = input.nextInt();
        int sum = 0;
     while (number > 0){
                sum+=number % 10;
                    number/=10;
        }
        System.out.println(sum);
    }
}
