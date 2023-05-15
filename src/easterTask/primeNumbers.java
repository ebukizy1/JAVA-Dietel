package easterTask;

import java.util.Scanner;

public class primeNumbers {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" enter an integer");
        int   number = input.nextInt();
        int i= 2;
            boolean isPrime = true;
        for( i = 2; i <=number/2; i++){
            if(number % i == 0){
                isPrime = false;
                break;
            }
        }
       System.out.println(isPrime ? "prime" : " is not prime");
    }
}

