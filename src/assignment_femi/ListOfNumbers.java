package assignment_femi;

import java.util.ArrayList;

public class ListOfNumbers {


    public int[] getListOfNumbers(int number){
        ArrayList<Integer> result = new ArrayList<>();
        int index;
        int j = 0;
        while(number > 0) {
            result.add(number % 10);
            number /= 10;
        }
        int [] arr = new int[result.size()];
        for(index = result.size()-1;index >=0; index--){
            arr[j++] = result.get(index);
        }
        return arr;
    }
}
