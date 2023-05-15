package chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class MinChallenge {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("enter the numbers to count");
        int count = input.nextInt();
        input.nextLine();
      int [] returnValue  =  readInteger(count);
      int  returnValue2 = findMin(returnValue);
        System.out.println("minumum " + returnValue2);


    }



    public static int [] readInteger(int count) {
        int[] array = new int[count];
        for (int index = 0; index < array.length; index++) {
            System.out.println("enter a number");
            int number = input.nextInt();
            input.nextLine();
            array[index] = number;
        }
        return array;
    }

    public static   int findMin( int [] myArrays){
        int minimum = myArrays[0];
        for(int index = 0; index < myArrays.length; index++){
            if(myArrays[index] < minimum){
                minimum = myArrays[index];
            }
        }
return minimum;
}

    }
