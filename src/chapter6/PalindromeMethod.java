package chapter6;

import java.util.Scanner;

public class PalindromeMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter my number ");
        int number  = input.nextInt();
        System.out.println(isPalindrome(number));
    }

    public static boolean isPalindrome(int number){
        if (reverse(number) == number){
            return true;
        }
        return false;
    }

    public static int reverse(int number) {
        String reverseNumber = "";
      while(number !=0){
          reverseNumber += number%10;
          number = number/10;
      }
      return Integer.parseInt(reverseNumber);
    }
}