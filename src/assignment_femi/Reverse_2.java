package assignment_femi;

public class Reverse_2 {
    private static int ZERO = 0;

    public int [] reverseBalance(int [] arrays) {
        int index;
        int j = ZERO;
        for(index = arrays.length; index >= ZERO; index--)
            arrays[j++] = arrays[index];

        return arrays;
    }


}
