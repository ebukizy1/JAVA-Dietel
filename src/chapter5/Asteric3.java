package chapter5;

public class Asteric3 {
    public static void main(String[] args) {
        int number = 10;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= number; k++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
