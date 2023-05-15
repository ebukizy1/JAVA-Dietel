package assignment_femi;

import java.util.ArrayList;

public class Even_5 {


    public ArrayList<Integer> findEvenNumbers(int [] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        int index;
        for(index = 0; index < arr.length; index++){
            if(arr[index] % 2 == 0)
                result.add(arr[index]);
        }
        return result;
    }
}
