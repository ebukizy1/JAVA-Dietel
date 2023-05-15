package chapterFive;

import java.util.Scanner;

public class TwoHighestScore {
    public static void main(String[] args) {
        twoLargestNumber();
        // write a program that prompt the user to enter the number
        //of student and each students name and score and finally display the student
        // with the highest score and the student with the second highest score
        //Todo:
        /*
        declare a class
        collect input from the user to enter number of student
        declare variable firstHighestScore
        declare a variable second secondHighestScore
        declare variable firstHighestName
        declare a variable second secondHighestName
        we need a loop to run through the number of student
       collect input for the name and also input for the scores
       and compare if the score is greater than higestscore and
       also compare if score is lesser than highest score and also greater than score
         */





    }
    public static void twoLargestNumber(){
        Scanner input = new Scanner(System.in);
        int firstHighScore = 0;
        int secondHighestScore = 0;
        String firstHighestScoreName ="";
        String secondHighestScoreName ="";
        String name;
        int score;



        System.out.println("Enter the number of student");
        int numberOfStudent = input.nextInt();
        for (int i = 0; i<=numberOfStudent; i++){
            System.out.println("Enter the student Name");
            name = input.next().toUpperCase();
            System.out.println("Enter the student score");
            score = input.nextInt();
            if(score > firstHighScore){
                firstHighScore = score;
                firstHighestScoreName = name;
            } else if (secondHighestScore < firstHighScore && score > secondHighestScore){
                secondHighestScore = score;
                secondHighestScoreName = name;
            }
        }
        System.out.println(" the best score of the best student in cohort sixteen is " +firstHighestScoreName +"  " + firstHighScore);
        System.out.println(" the second best student in cohort sixteen is " + secondHighestScoreName + "  " + secondHighestScore);




    }
}
