package chapter7;

public class SumInteger {



    public int calculateTotalGrade(int number) {
        int count;
        int total = 0;
        int [] myArray = {12, 45, 32, 12, 59, 78, 30};
        for(count = 0; count <myArray.length; count++){
            total += myArray[count];
        }
        return total;
    }

}
