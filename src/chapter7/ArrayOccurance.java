package chapter7;

import java.util.Scanner;

public class  ArrayOccurance {
    public static void main(String[] args) {


        checkOccurance(7);

    }






    public static void checkOccurance(int number) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer to check it occurance");
        number = input.nextInt();
        int[] myArray = {1, 2, 2, 1, 4, 4, 5, 2, 5, 6, 6, 7, 6, 8, 9, 7, 8, 2, 1, 5, 6, 6,};
        int counter = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (number == myArray[i]) {
                ++counter;
            }
        }
        System.out.printf("%5s%15s%n", "occur", " times");
        System.out.printf("%5d%15d", number, counter);
    }
}


