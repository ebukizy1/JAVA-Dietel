package ArrayList;

import java.util.Arrays;

public class example7_2 {
    public static void main(String[] args) {
        int [] myArray = {1,23,34, 23, 45, 54, 32, 32, 54,32,24,24,23,22,33 ,37, 27, 17, 50};
        int [] temp = new int [myArray.length];

        int k= 0;
        int j = myArray.length-1;
        for (int i = 0; i < myArray.length; i++){
            if(myArray[i] % 2 ==0){
                temp[k++] = myArray[i];
            }else temp[j--] = myArray[i];
        }

        System.out.println(Arrays.toString(temp));

    }


}
