package chapter7;

public class Maximum_Minumum {

    public String getMaximumResult(int [] number) {
        int maximum =number[0];
        int minimum = number[0];
        int count;
        for(count = 1; count < number.length; count++){
            if(number[count] > maximum){
                maximum = number[count];
            }else if(number[count] < minimum){
                minimum = number[count];
            }
        }
        return maximum +""+minimum;
    }
}
