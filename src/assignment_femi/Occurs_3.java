package assignment_femi;

public class Occurs_3{
        private static int ZERO = 0;

    public int occursElement(int [] arr, int numbers){
        int counter = ZERO;
        int index;
        for(index = ZERO; index < arr.length; index++)
            if(arr[index] == numbers)
                counter++;

        return counter;
    }
}
