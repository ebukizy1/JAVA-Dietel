package chapter5;

public class Exercise5_13 {
    public static void main(String[] args) {


        long sum = 0;
        long count = 1;
        long number = 100;
        for (count = 1; count <= number; count++) {
            for (int i = 1; i <= count; count++)
                sum += i;
            System.out.printf("The sum of the %d +%d ", sum);
        }
        System.out.println();
    }


}

