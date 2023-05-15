package assignment_femi;

public class Largest_1 {
    private static int ZERO = 0;

    public int findLargestNumber(int [] arrrays){
        int index;
        int maximum = arrrays[0];
        for (index = ZERO; index < arrrays.length;index++){
            if(arrrays[index] > maximum)
               maximum = arrrays[index];
        }
        return maximum;
    }
}
