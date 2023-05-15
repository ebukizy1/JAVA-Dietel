package myExamplesTutorial;


import java.util.Scanner;

public class TheIteration {
    public static void main(String[] args) {
        Scanner userInput= new Scanner(System.in);
        //initialization phase
        int total = 0;
        int gradeCounter = 1;

        while (gradeCounter <=10) {
            System.out.println("Enter grade: ");
            int grade = userInput.nextInt();
            total = total + grade; //add grade to total since every loops start from 0
            gradeCounter = gradeCounter + 1; //increment counter by 1
        }
        //termination determination phase
        int average =  total / 10; //integer division yield integer result;
        //display total and average of grades
        System.out.printf("\n Total of all grades is %d%n" , total);
        System.out.printf("Class average is %d%n", average);








        }

    }



