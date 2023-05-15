package chapterseven;

public class ReverseNumbers {


    public int  findMaximumNumber(int ... arr) {
        int index;
       int  maximum = arr[0];
        for(index = 0; index < arr.length; index++){
            if(arr[index] > maximum){
                maximum = arr[index];}}
        return maximum;}

    public int findMinimumNumbers(int ... arr){
        int index;
        int minimum = arr[0];
        for(index = 0; index < arr.length; index++){
            if(arr[index] < minimum){
                minimum = arr[index];}}
        return minimum;
    }

    public int [] findMaxAndMin(int ... arr) {
        int index;
        int[] result = new int[0];
        int minimum = arr[0];
        int maximum = arr[0];
        for(index = 0; index < arr.length; index++){
            if(arr[index] > maximum){
                maximum = arr[index];
            } else if (arr[index] < minimum){
                minimum = arr[index];
            }
            result = new int[]{maximum, minimum};
        }
        return result;
    }
}
