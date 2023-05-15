package chapter6;

import static java.lang.Integer.parseInt;

public class Excerise6_23 {




    public static int CheckPalindrome(int number ) {
        String reverse = "";
        int palindrome;
        while(number != 0) {
            reverse += number % 10;
            number /= 10;
        }
       palindrome = Integer.parseInt(reverse);
      return palindrome;
}
}
