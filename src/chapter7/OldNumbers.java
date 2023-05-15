package chapter7;

public class OldNumbers {




    public int [] findEvenNumbers(int ... number){
        int evenCounter = 0;
        int oddCounter = number.length - 1;
        int [] arr = new int[number.length];
         for(int index = 0; index < arr.length; index++){
            if(number[index] % 2 == 0){
               arr[evenCounter] = number[index];
               evenCounter++;
            }
            else {
                arr[oddCounter] = number[index];
                oddCounter--;   int j = 0;
            }
        }
        return arr;
    }



}
