package assignment_femi;

public class SumNumberswhileLoops {


    public int sumOfIntegers(int... numbers) {
        int count = 0;
        int total = 0;
        while(count < numbers.length){
            total += numbers[count];
            count++;
        }
        return total;
    }
}
