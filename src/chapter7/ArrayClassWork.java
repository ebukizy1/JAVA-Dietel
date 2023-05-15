package chapter7;

import java.util.Arrays;

public class ArrayClassWork {


    public  int [] checkArrays(int[] myNewArrays) {
        for(int i = 0 ; i < myNewArrays.length; i++){
            myNewArrays[i] =i +1;
        }
return myNewArrays;
    }
}