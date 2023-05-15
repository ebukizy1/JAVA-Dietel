package chapter7;

public class ReverseArrayChallenge {


    public int [] reversalArrays(int [] arr){
        int [] temp = new int[arr.length];
         int k = 0;
        for(int index = arr.length-1 ; index  >= 0; index--){
            temp[k++] = arr[index];
        }
        return temp;
    }

    }


