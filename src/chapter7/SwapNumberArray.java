package chapter7;

import java.util.Arrays;

public class SwapNumberArray {
    public static void main(String[] args) {


        // TODO: 03/05/2023
        int[] myArray = {23, 45, 60, 10, 20, 50, 35, 45, 12, 33, 64, 70, 16, 89};
        int[] temp = new int[myArray.length];
        int counter;
        int j = 0;
        int k = myArray.length - 1;
        for (counter = 0; counter < myArray.length; counter++) {
            if (myArray[counter] % 5 == 0) {
                temp[j++] = myArray[counter];
            } else temp[k--] = myArray[counter];
        }

        copyArray(myArray, temp);
        System.out.println(Arrays.toString(temp));
        System.out.println(Arrays.toString(myArray));
    }

    private static void copyArray(int[] myArray, int[] temp) {
        for(int i = 0; i <temp.length; i++){
            myArray[i] = temp[i];
        }
    }


}
