package easterTask;

public class SumNumbers {
    public static void main(String[] args) {
        int numbers;
        int n = 1000;
        int sum = 0;
        int count = 0;

        for (numbers = 1; numbers <= 500; numbers++) {
            if (numbers % 3== 0 && numbers % 5 == 0) {
                count++;
                sum += numbers;
                System.out.println(" the number found: " + numbers);
            }
            if (count == 10) {
                break;
            }
        }
        System.out.println(" the sum of the total is: " + sum);
    }
}