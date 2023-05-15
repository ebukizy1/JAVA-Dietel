package chapter6;

public class Excerise6_17 {


    public boolean isDivisible(int[] myArray) {
        int counter;
        for (counter = 0; counter < myArray.length; counter++) {
            if (myArray[counter] % 5 == 0) {
                return true;
            }
        }
        return false;
    }

    public boolean isDivisible2(int ...myArray) {
        for(int i = 0 ; i < myArray.length; i++)
        if( myArray [i]% 5== 0)return  true;
        return  false;
    }


}
