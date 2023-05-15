package chapter5;

public class LoopsTest {
    public static void main(String[] args) {
        int total = 0;
        for (int counter = 1; counter <= 10; total += counter, counter++) {
            System.out.printf(" the total is %d%n ", total);
        }

    }
}
