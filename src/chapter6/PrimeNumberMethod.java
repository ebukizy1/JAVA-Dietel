package chapter6;

public class PrimeNumberMethod {
    public static void main(String[] args) {

        System.out.println("This are the numbers of prime numbers");
        printPrimeNumbers(100);
    }
    //todo:

//
//    ....stacking....
//        invoke printprimemethod
//        printPrintPrimeNumbersMethod
//        invoke is prime

        public static void printPrimeNumbers( int numberOfPrime){
            int primeNumbersPerLine = 15;
            int count = 0;
            int number = 2;
            while(count < numberOfPrime) {
                if (isPrimesNumbers(number)) {
                    count++;
                    if (count//package chapterseven;
//
//public class ReverseNumbers {
//
//
//    public int  findMaximumNumber(int ... arr) {
//        int index;
//       int  maximum = arr[0];
//        for(index = 0; index < arr.length; index++){
//            if(arr[index] > maximum){
//                maximum = arr[index];}}
//        return maximum;}
//
//    public int findMinimumNumbers(int ... arr){
//        int index;
//        int minimum = arr[0];
//        for(index = 0; index < arr.length; index++){
//            if(arr[index] < minimum){
//                minimum = arr[index];}}
//        return minimum;
//    }
//
//    public void findMaxAndMin(int ... arr) {
//        int index;
//        int result = 0;
//        int minimum = arr[0];
//        int maximum = arr[0];
//        for(index = 0; index < arr.length; index++){
//            if(arr[index] > maximum){
//                maximum = arr[index];
//            } else if (arr[index] < minimum){
//                minimum = arr[index];
//            }
//            result = maximum, minimum;
//        }
//    }
//}
 % primeNumbersPerLine == 0) {
                        System.out.printf("%-5s%n", number);
                    } else System.out.printf("%-5s", number);
                }
                number++;
            }
            }

    // create a method that print prime numbers
    public static boolean isPrimesNumbers(int number) {
        int count;
        for (count = 2; count <= number / 2; count++) {
            if (number % count == 0) {
                return false;
            }
        }
        return true;
    }
}
