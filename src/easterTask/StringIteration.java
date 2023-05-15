package easterTask;

import java.util.Scanner;

public class StringIteration {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your String");
        String stringValue = input.nextLine();
        String reverse ="";
//      for ( int i = 0; i < stringValue.length(); i++){
//           System.out.print( stringValue.charAt(i)  + " " );
//     }
        for (int k = stringValue.length() - 1; k >=0; k--)
            reverse+=stringValue.charAt(k);
            System.out.print(reverse);


    }
}
