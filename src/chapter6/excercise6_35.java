package chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class excercise6_35 {
private static SecureRandom randomNumber = new SecureRandom();

private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
       //generateRandomNumbers();
     //   difficultyQuestion();
    }







    public static void generateRandomNumbers() {
        final int Number_0f_Question = 10;
        int count = 1;
        int answer;
        int answerPassed = 0;
        int answerFailed = 0;
        int total = 0;
        while (true) {
            int number1 = 1 + randomNumber.nextInt(10);
            int number2 = 1 + randomNumber.nextInt(10);

            System.out.println("How much is " + number1 + " times " + number2 + "?");
            answer = input.nextInt();
            if (number1 * number2 == answer) {
                passedStudentComment();
                ++answerPassed;}
            while (number1 * number2 != answer) {
                    failedStudentComment();
                System.out.println("How much is " + number1 + " times " + number2 + "?");
                answer = input.nextInt();
                ++answerFailed;}
                count++;
            if(answerPassed + answerFailed == 10){
                total = answerPassed + answerFailed;
            }
            }

//        double percentage =  (double) answerPassed / count;
    //    System.out.println(count);
     //   System.out.println("The total answer gotten correctly is: " + answerPassed);
    }

        private static void passedStudentComment(){
            int passedNumber = 1 + randomNumber.nextInt(4);
            switch (passedNumber){
                case 1->System.out.println("Very good!");
                case 2->System.out.println("Excellent!");
                case 3->System.out.println("Nice work!");
                case 4->System.out.println("Keep up the good work!");
            }
        }
    private static void failedStudentComment(){
            int failedNumber = 1 + randomNumber.nextInt(4);
            switch(failedNumber){
                case 1-> System.out.println(" No. Please try again.");
                case 2-> System.out.println("Wrong. Try once more.");
                case 3-> System.out.println("Don't give up!");
                case 4-> System.out.println("No. Keep trying. ");
            }
        }
        /*
6.39 (Computer-Assisted Instruction: Varying the Types of Problems) Modify the program of
Exercise 6.38 to allow the user to pick a type of arithmetic problem to study. An option of 1 means
addition problems only, 2 means subtraction problems only, 3 means multiplication problems only,
4 means division problems only and 5 means a random mixture of all these types.
         */
    public static void difficultyQuestion() {
        System.out.println("""
                ENTER YOUR DIFFICULTY LEVEL
                1) EASY
                2) HARD
                3) PROFESSION
                """);

        int level = input.nextInt();
        switch (level) {
            case 1:
                int number1 = 1 + randomNumber.nextInt(10);
                int number2 = 1 + randomNumber.nextInt(10);
                System.out.println("How much is " + number1 + " times " + number2 + "?");
                break;
            case 2:
                int number3 = 1 + randomNumber.nextInt(100);
                int number4 = 1 + randomNumber.nextInt(100);
                System.out.println("How much is " + number3 + " times " + number4 + "?");
                break;
            case 3:
                int number5 = 1 + randomNumber.nextInt(1000);
                int number6 = 2 + randomNumber.nextInt(1000);
                System.out.println("How much is " + number5 + " times " + number6 + "?");
        }
    }
        private static  void setAddtionalQuestion(){
            System.out.println("""
                ENTER YOUR DIFFICULTY LEVEL
                1) ADDITION
                2) SUBTRACTION
                3) MULTIPLICATION
                4) DIVISION
                5) PICK QUESTION RANDOMLY
                """);
            int choice = input.nextInt();
            switch (choice){
                case 1:int number1 = 1 + randomNumber.nextInt(10);
                    int number2 = 1 + randomNumber.nextInt(10);
                    System.out.println("How much is " + number1 + " times " + number2 + "?");
                    break;



        }
     /*   6.39 (Computer-Assisted Instruction: Varying the Types of Problems) Modify the program of
    Exercise 6.38 to allow the user to pick a type of arithmetic problem to study. An option of 1 means
    addition problems only, 2 means subtraction problems only, 3 means multiplication problems only,
4 means division problems only and 5 means a random mixture of all these types.
      */
    }

    }