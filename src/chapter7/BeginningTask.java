package chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class BeginningTask {
    public static void main(String[] args) {
        int[] nums = {2,4,6,8,10,20,30};
        System.out.println(Arrays.toString(myNumber(nums)));

    }

    public static int[] myNumber(int [] myNumber) {
       // int[] myNumber = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result;
        int maximum = myNumber[0];
        int minimum = myNumber[0];
        int [] index ;
        for (int i = 0; i < myNumber.length; i++) {
            if(myNumber[i] > maximum) {
                maximum = myNumber[i];
            }else if( myNumber[i] < minimum){
                minimum = myNumber[i];}}
            result = new int[]{maximum, minimum};
//        for (int i = 0; i < result.length; i++){
//           index  = new int[]{result[i]};
//            System.out.println(Arrays.toString(index));


        return result;
    }
}