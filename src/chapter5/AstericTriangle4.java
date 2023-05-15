package chapter5;

public class AstericTriangle4 {
    public static void main(String[] args) {

        int number = 10;
        for (int i = 1; i <= number; i++) {
            for (int j = i; j < number; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


}

