package chapterseven;

public class ReverseIntegers {

/*
l public static int[] reverse(int[] list) {
2
int[] result = new int[list.length];
3
4
for (int i = 0, j = result.length - 1;
5
i < list.length; i++, j--) {
6
result[j] = list[i];
list
7
}
8
result
9
return result;
 */

    public int [] reverseIntegers( int... numbers) {
        int [] myarr = new int[numbers.length];
        int j = myarr.length-1;
        for(int i = 0; i < numbers.length; i++,j--)
            myarr[j] = numbers[i];
        return myarr;
    }
}
