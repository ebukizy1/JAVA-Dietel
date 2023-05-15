package assignment_femi;

public class SumOfDoWhileLoop {


    public int  sumOfList(int ... numbers){

        int total = 0;
        int count = 0;
        do {
            total += numbers[count];
            count++;
        }while( count < numbers.length);

        return total;
    }
}
