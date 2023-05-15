package myExamplesTutorial;

import java.util.Scanner;

public class LoopsExcerise {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int [] myIntArrays = getList (5);
        for (int i =0; i < myIntArrays.length; i++){
            System.out.println("Element "  + i + " the value types " + myIntArrays[i]);
        }
        System.out.println("the average is " + getAverage(myIntArrays));
//
//       int [ ] myIntArray =  new int [30]; //{23, 34 , 56, 22, 56, 22, 60, 600, 234, 708 };
//        for(int i = 0; i<myIntArray.length; i++) {
//            myIntArray[i] = i * 10;
//        }
//        printArray(myIntArray);
//
//    }
//    public static void printArray(int [] array){
//        for(int i = 0; i < array.length;i++) {
//            System.out.println("Element " + i + "value is " +array[i]);
//        }
    }
    public static int [] getList(int number){
        System.out.println("Enter " + number + " integers values.\r");
        int [] myArrays = new int  [number];
        for(int i = 0; i< myArrays.length; i++){
            myArrays[i] = input.nextInt();
        }
        return myArrays;
    }
    public static double getAverage(int [] array){
        int sum = 0;
        for(int i = 0; i< array.length; i++) {
            sum += array[i];
        }
        return (double) sum / (double) array.length;
    }
}

