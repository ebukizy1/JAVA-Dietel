package DanielyangAssessment;

import java.util.Scanner;

public class QuizLoops {
    public static void main(String[] args) {
        //intialization;
        final int  Questions_for_Primary_Student = 4;
        int correctCounter = 0;
        int count = 0;
         long startTime = System.currentTimeMillis();
         String output = " ";
        Scanner input = new Scanner(System.in);
        //set questions

        while( count <Questions_for_Primary_Student ){
            int number1 = (int) (Math.random() * 10);
            int number2 = (int) (Math.random() * 10);

            if (number1<number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;

            }
                System.out.println("What is the answer of " + number1 + " - " +number2 + " ? ");
                int answer = input.nextInt();
                if(number1 - number2 == answer) {
                    System.out.println(" You are correct");
                    correctCounter++;
                }else
                System.out.println("Your answer are is wrong \n " + number1 + " - " +
                        number2 + " = " + "should be " + (number1 - number2));
                count++;
                output += "\n" + number1 + "-" + number2 + "=" + answer +
                    ((number1 - number2 == answer) ? " correct" : " wrong");
        }
        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;

        System.out.println("Your correct count is " + correctCounter+ "\n Test time is " + testTime / 1000 + "Seconds \n" + output);

    }
}
