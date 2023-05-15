package chapter7;

public class CalculateAverage {





    public static double calculateAverage(int ... number){
        int[] newArr = new int[number.length];
        double average, sum = 0;
        for(int index =0; index<number.length; index++){
           sum +=newArr[index];
        }
        average = sum / number.length;
        return average;
    }

}
