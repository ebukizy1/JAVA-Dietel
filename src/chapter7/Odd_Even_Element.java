package chapter7;

import java.util.Arrays;

public class Odd_Even_Element {

    public static void main(String[] args) {

        int[] myArrays = {1, 2, 6, 3, 4, 8, -2, 16, 12, 7};
        int[] newTemp = new int[myArrays.length];
        int j = 0;
        int k = myArrays.length - 1;
        for (int i = 0; i < myArrays.length; i++) {
            if (myArrays[i] % 2 != 0) newTemp[j++] = myArrays[i];
            else newTemp[k--] = myArrays[i];
        }
        copyArrays(newTemp, myArrays);
        System.out.println(Arrays.toString(myArrays));
    }

    private static void copyArrays(int[] newTemp, int[] myArrays) {
        for (int i = 0; i < newTemp.length; i++) {
            myArrays[i] = newTemp[i];
        }
    }
}


