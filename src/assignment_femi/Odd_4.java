package assignment_femi;

import java.util.ArrayList;

public class Odd_4{
        private static int ZERO = 0;

    public ArrayList<Integer> printOddElement(int ... numbers){
        int index;
        ArrayList<Integer> result = new ArrayList<>();
        for(index = ZERO; index < numbers.length; index++)
            if(numbers[index] % 2 != 0)
            result.add(numbers[index]);
        return result;
    }

}
