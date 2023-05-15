package chapter7;

public class MiniChallenge2 {



    public int  findMin(int ... numbers) {
        int minimum = numbers[0];
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] < minimum){
                minimum = numbers[i];
            }
        }


        return minimum;
    }


    // TODO: 05/05/2023


    /*
    test if the numbers receiver from the user and is the minmum number by creating a method
     */




}
