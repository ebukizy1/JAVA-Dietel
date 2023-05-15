package Task;

import java.util.Arrays;
import java.util.Scanner;

public class task {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your numbers");
//
//
//
//
//
//
//        int[] myNumber = new int[5];
//   //     int [] num =new int[5];
//        int index;
//        int sum= 0;
//        for(index = 0; index < myNumber.length; index++){
//            if (index == 0) myNumber[index] = input.nextInt();
//          else
//              myNumber[index] = input.nextInt() + myNumber[index-1];
//            System.out.println(Arrays.toString(myNumber));
////        }
//
//        try {
//            int[] arr = {2, 4, 5, 6, 7 , 8, 9, 2, 3};
//            System.out.println(arr[10]);
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println(e);
//        }
//    }
//        int [] numbers = {1, 2, 4, 5, 8 , 6, 9, 10, 45, 3, 2, 5};
//                        for(int number:numbers){
//                            if(number % 2 == 0){
//                                System.out.println("even");


        add(12,45, 44, 43, 55,33,22);
addDouble(33.3,34.4,43.5,3.3,2.2,2.2,3.3,4.4,5.5);





    }
        public static void add(int ... number){
        int total = 0;
            for(int numbers: number){
                 total += numbers;
            }
            System.out.println(total);
        }
    public static void addDouble(double ... number){
        double total = 0;
        for(double numbers: number){
            total += numbers;
        }
        System.out.println(total);
    }

}