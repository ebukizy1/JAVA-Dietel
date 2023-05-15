package chapter6;

public class PentagonNumbers {
    public static void main(String[] args) {
        int count;
        for (count = 1; count <= 100; count++) {
            if (count % 10 == 0) {
                System.out.printf("%-5s%n", getPentagonalNumbers(count));
            } else System.out.printf("%-5s", getPentagonalNumbers(count));

        }

    }
    public static int  getPentagonalNumbers(int n){
          return n * (3 * n -1)/2;
        }



    }

