package chapter7;

import java.util.Arrays;

public class Values {
    public static void main(String[] args) {

//        int myIntValues = 10;
//        int anotherIntValues = myIntValues;
//        System.out.println("myIntValues =" + myIntValues );
//        System.out.println(" anotherIntValues =" + anotherIntValues);
//
//        anotherIntValues++;
//        System.out.println("myIntValues =" + myIntValues);
//        System.out.println(" anotherIntValues =" + anotherIntValues);

    int [] myArrays = new int[5];
    int [] anotherArrays = myArrays;

        System.out.println("myIntArrays " + Arrays.toString(myArrays));
        System.out.println("another Arrays " + Arrays.toString(anotherArrays));

        anotherArrays[0] = 1;
        System.out.println("after change myIntArrays " + Arrays.toString(myArrays));
        System.out.println("after change myIntArrays " + Arrays.toString(anotherArrays));
        modifyArrays(myArrays);
        System.out.println("after change myIntArrays " + Arrays.toString(anotherArrays));
        System.out.println("after change myIntArrays " + Arrays.toString(myArrays));
    }
    private static void modifyArrays(int[] arrays){
        arrays[0] = 2;
        arrays = new int []{1, 2, 3, 4, 5};
    }
}
