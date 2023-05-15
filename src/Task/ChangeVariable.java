package Task;

import java.util.Arrays;

public class ChangeVariable {
    public static void main(String[] args) {
//int [] myNumber = new int[]{10};
//
//
////
////        modify(10);
////        int number = 10;
//        //      System.out.println(number);
//
//        int[] numbers = {1, 2, 3, 4, 5};
//        modify(numbers);
//        System.out.println(Arrays.toString(numbers));
//
//    }
//
//    public static void modify(int[] num) {
//
//        for (int i = 0; i < num.length; i++) {
//            num[i] = num[i] * num[i];
//            System.out.println(Arrays.toString(num));
        int num = 10;
        System.out.println("Before calling method, num is " + num);
        modify(num);
        System.out.println("After calling method, num is still " + num);
    }
    public static void modify(int num) {
        num = num + 5;
        System.out.println("Inside method, num is " + num);
    }
}


