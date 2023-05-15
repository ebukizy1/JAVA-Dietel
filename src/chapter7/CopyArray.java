package chapter7;

import javax.xml.transform.Source;
import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {

        int [] sourceArray = {1, 2, 3, 4,53,5};
        int [] targetArray = new int[sourceArray.length];
        for (int i = 0; i < sourceArray.length; i++){
            targetArray[i] = sourceArray[i];
        }
        System.out.println(Arrays.toString(targetArray));
    }

}
