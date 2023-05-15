package chapter5;

public class Excerise5_15asteric1 {
    public static void main(String[] args) {

        int number = 10;
        for (int i = 1; i <= number; ) {
            for (int j = 1; j <= i; ) {
                System.out.print(" *");
                j++;
            }
            System.out.println();
            i++;
        }


    }
}
