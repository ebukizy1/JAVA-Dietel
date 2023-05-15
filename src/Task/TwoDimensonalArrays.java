package Task;

import java.util.Arrays;

public class TwoDimensonalArrays {
    private static final int ZERO = 0;
    public static void main(String[] args) {


        int [] [] arr = new int[5][];
        arr[ZERO] = new int [5];
        arr[1] = new int [3];
        arr[2] = new int [10];
        arr[3] = new int []{400, 500};
        arr[4] = new int [5];

        populateArrays(arr[ZERO]);
         populateArrays(arr[1]);
        populateArrays(arr[2]);
        populatedArrayswithby100(arr[4]);


        System.out.println(Arrays.deepToString(arr));

}
private static int [] populateArrays(int [] inputtedValue){
        for( int index = 0; index < inputtedValue.length; index++){
            inputtedValue[index] = index;
        }
        return inputtedValue;
}
public static  int [] populatedArrayswithby100(int [] inputtedValues){
        for(int index = 0; index < inputtedValues.length; index++){
            inputtedValues[index] = (index +1) * 100;
        }
        return inputtedValues;
}


}
