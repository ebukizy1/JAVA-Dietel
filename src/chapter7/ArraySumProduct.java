package chapter7;

public class ArraySumProduct {
    // TODO: 30/04/2023
    /*
    write a program that display the sum, product, and average of the element of an integer array
   {1, 2, -3,  5, 7}
   create a method that to calculate the sum and product
   declare an array
   provide a loop that could run through the number the length of the arrays
   provide a variable sum initialize to zero and variable average and also product with a variable counter to run through the length of the arrays
   then your final output will be sum = 12, product = -120, average = 

     */

    public int displaySumOfProduct(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
    public int displayProductOfArray(int [] arr){
        int product = 1;
        for(int i= 0; i < arr.length; i++){
            product *=arr[i];
        }
         return product;
    }


    public double displayAverageOfArray(int[] arr) {
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum+=arr[i];
        }
        double average = (double)sum / arr.length;
        return average;
    }
}
