package DanielyangAssessment;

import java.util.Scanner;

public class DanSentinelValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" enter the sum of the product: \"0\" to end the program " );
        int data = input.nextInt();
        int sum = 0;
        while ( data != 0){
            System.out.println(" enter the sum of the product: \"0\" to end the program " );
            data= input.nextInt();
            sum +=data;
            System.out.println("the sum of the product is: " + sum );
        }
    }


}
