package chapter7;

import java.util.Arrays;

public class ArrayStringFemi {
    public static void main(String[] args) {

        String [] words  = {"Hello", "Thank you", "Gems"};
        System.out.println("WORDS:: " + Arrays.toString(words));
            
        SemiColonNatives [] natives = new SemiColonNatives[4];
        natives[0]  = new SemiColonNatives("timmy", 16);
           natives [1] =   new SemiColonNatives("mariam", 16);
             natives [ 2] =new SemiColonNatives("ebuka", 16);
            natives[3] = new SemiColonNatives("dele", 16);
       System.out.println("SemicolonNatives:: " + Arrays.toString(natives));
    }
}
