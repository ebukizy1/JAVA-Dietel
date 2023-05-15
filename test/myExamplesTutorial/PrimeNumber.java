package myExamplesTutorial;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER A NUMBER; ");
        int n = input.nextInt();
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                System.out.println(n);
        }
    }

    public void primeNumbers(int n) {
    }
}