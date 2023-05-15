package chapter7;

import java.util.Arrays;

public class SortMaximumNumbers {
    public static void main(String[] args) {

        int [] myArrays = {23, 56, 12 , 87, 56, 34, 54, 67, 123, 89, 45, 44, 150};
        int [] temp = new int[myArrays.length];
        int counter;
        int maximum=0;
        int minimum = myArrays.length-1;
        for(counter = 1; counter < myArrays.length; counter++){
            if(myArrays[counter] > maximum)
               temp[maximum] = myArrays[counter];
            //    if(myArrays[counter] > maximum
//            }else if(myArrays[counter] < minimum ){
//                temp[minimum--] = myArrays[counter];
//            }
            maximum++;
      }
        System.out.println(Arrays.toString(temp));



    }

}
