package chapter7;

import java.util.Arrays;

public class SwapNumbers {
    public static void main(String[] args) {
        int[] myList = {1, 5, 3, 4, 5, 5};
        listSwap(myList);


    }
    public static void listSwap(int [] myList) {
        for (int i = myList.length-1; i >0; i--){
            int j = (int)(Math.random() * (i + 1));
            double temp = myList[i];
            myList[i] = myList[j];
            myList[j] = (int) temp;
        }
        System.out.println(Arrays.toString(myList));
    }
}
