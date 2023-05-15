package chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class AnalyzingInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        Now you can write a program using arrays to solve the problem proposed at the beginning of
this chapter. The problem is to read 100 numbers, get the average of these numbers, and find the
number of the items greater than the average. To be flexible for handling any number of input, we
will let the user enter the number of input, rather than fixing it to 100. Listing 7.1 gives a solution.
         */
//
//        System.out.println("Enter the size total size of number you wan to store");
//        int number = input.nextInt();
//        double average = 0;
//        double sum = 0;
//        double [] arr = new double[number];
//        for(int i = 0; i < arr.length; i++){
//            System.out.println("enter the numbers of items");
////            arr[i] = input.nextDouble();
////            sum+=arr[i];
////        }
////        average = sum / number;
//
//        int count = 0;
//        for (int i = 0; i < number; i++) {
//            if (arr[i] > average)
//                count++;
//        }
//        System.out.println("the total average is "+ average);
//        System.out.println(" the total count greater than the average "+ count);
//

       int [] count = new int[50];
        Arrays.fill(count, 5);
        System.out.println(Arrays.toString(count));



    }
}
