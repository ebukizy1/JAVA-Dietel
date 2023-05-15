package assignment_femi;

import java.util.ArrayList;

public class TotalList_6 {
private  static  int ZERO = 0;

    public int getTotalList(int [] total){
        int index;
        int sum = ZERO;
        for(index = ZERO; index < total.length; index++){
            sum += total[index];
        }
        return sum;
    }
}
