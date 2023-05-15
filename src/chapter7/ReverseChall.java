package chapter7;

import java.util.Arrays;

public class ReverseChall {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4 ,5, 6, 7, 8, 9};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }


    private static void reverse(int [] array){
        int maxIndex = array.length-1;
        int halfLength = array.length / 2;
        for (int index = 0; index < halfLength; index++){
            int temp = array[index];
            array[index] = array[maxIndex - index];
            array[maxIndex - index] = temp;

        }

    }
}
