package chapter7;

import java.util.Scanner;

public class ArrayOcc {


    public int checkOccurance(int number) {
        int[] myArray = {1, 2, 2, 1, 4, 4, 5, 2, 5, 6, 6, 7, 6, 8, 9, 7, 8, 2, 1, 5, 6, 6,};
        int counter = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (number == myArray[i]){
                ++counter;
            }
        }
        return counter;
    }
}
