package DanielyangAssessment;

import java.util.Scanner;

public class MrChibuzo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int counter = 1;
        int number;
        while (counter <= 5) {
            System.out.println("enter a number");
            number = input.nextInt();
            if (number >= 0 && number <= 100) {
                if (counter % 2 == 0)
                    sum += number;
                counter++;

            }
            System.out.println("Enter the total sum is:" + sum);

        }
    }
}
