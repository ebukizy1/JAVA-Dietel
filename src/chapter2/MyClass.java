package chapter2;

import java.util.ArrayList;
import java.util.List;

public class MyClass {


    public int [] sortArray(int [] arry, int [] arrays){
    int [] myarr = new int[arry.length + arrays.length];
    int count =0;
        for(int index = 0; index < arry.length; index++) {
            myarr[index] = arry[index];
            count++;
        }
            for(int index2 = 0; index2 < arrays.length; index2++){
              myarr[index2] = arrays[index2];

            }

return myarr;
    }
}
