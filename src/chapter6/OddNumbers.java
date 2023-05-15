package chapter6;

public class OddNumbers {
    public static void main(String[] args) {


        System.out.println(strictDivisors(34));
    }

//    public static void printStrictDivisor(int numbersOfStrictDivisor) {
//        final int number_per_line = 15;
//        int count = 0;
//        int number = 2;
//        while (count <= numbersOfStrictDivisor) {
//            if (strictDivisors(number)) {
//                count++;
//                if (count % number_per_line == 0) {
//                    System.out.printf("%-5s%n ", number);}
//                    else
//                    System.out.printf("%-5s ", number);
//
//                }
//            number++;




    public static int strictDivisors(int number){
        int count;
        int sum = 0;
        for(count  = 1; count <=number/2 ; count++){
            if(number % count == 0){
                System.out.println(count);
                sum+= count;
            }
        }


        return sum;
    }


}
