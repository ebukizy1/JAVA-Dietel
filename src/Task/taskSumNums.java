package Task;

import java.util.ArrayList;




public class taskSumNums {


    public int[] findSumOfNumbers(int number) {
        int sum = 0;
        int [] arrayNumbers = {1, 3, 5,6, 7, 5, 8, 7, 5, 34,3};
        ArrayList<Integer> result = new ArrayList<>();
        int index2;
        for(int index = 0; index < arrayNumbers.length;index++) {

            for (index2 = index; index2 < arrayNumbers.length; index2++)
                sum += arrayNumbers[index2];
               result.add(arrayNumbers[index2]);
               if(sum == number){
                   int [] storedValue = new int[result.size()];
                   for(int index3 = 0; index3 < result.size(); index3++){
                       storedValue[index3] = result.get(index3);}

                   return storedValue;}}

     return new int[0];

    }
}
