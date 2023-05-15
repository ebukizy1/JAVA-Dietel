package chapterseven;

import java.util.Arrays;
import java.util.Scanner;

public class Occurance {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number from 1 - 100");
        int number = input.nextInt();
        checkNumberOccurance(number);


    }



    public static void   checkNumberOccurance(int  number){
        int counter = 0;
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 5,4, 4,4,4,  2, 3,2,3,3, 4,1,1,13};
        for(int index = 0; index < arr.length; index++) {
            if (number == arr[index]){
                ++counter;
            }
        }
        System.out.printf("%5s%10s%n","occur", "times");
        System.out.printf("%5d%10d%n",number,counter);


;
    }
}
