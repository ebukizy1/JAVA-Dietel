package chapterFive;

import java.util.Scanner;

public class SubstractionQuiz {
    public static void main(String[] args) {
        final int NUMBER_OF_QUESTION = 10;
            int correctCount = 0;
            int count = 0;
            long startTime = System.currentTimeMillis();
            String output = " ";
        Scanner input = new Scanner(System.in);
        while(count < NUMBER_OF_QUESTION){
            int number1 = (int)(Math.random() * 15);
            int number2 = (int)(Math.random() * 15);

            if(number1 < number2 ) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
                temp = number2;
                number1 = temp;
                number2 = number1;
            }
                System.out.println("what is number: " + number1 + " + " + number2 + "? ");
                int answer = input.nextInt();
                if (number1 + number2 == answer) {
                    System.out.println("you are correct !!");
                    correctCount++;
                } else
                    System.out.println("your answer is wrong. \n" + number1 + "+" + number2
                            + "should be " + (number1 - number2));
                count++;
                output += "\n" + number1 + " + " + number2 + "=" + answer +
                        ((number1 + number2 == answer ? "you are right" : " you are wrong"));
            }
                long endTimeNoCaps = System.currentTimeMillis();
                long testTimeDuration = endTimeNoCaps - startTime;
        System.out.println("Correct count is " + correctCount +
                "\nTest time is " + testTimeDuration / 1000 + " seconds\n" + output);
            }

        }




