package DanielyangAssessment;

import java.util.Scanner;

public class Teacher {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gradeA = 0;
        int gradeB = 0;
        int gradeC = 0;
        int gradeD = 0;
        int gradeE = 0;
        int gradeF = 0;
        System.out.println(" How many student do you have?");
        int numberOfStudent = input.nextInt();
        for ( int i = 0; i < numberOfStudent; i++){
            System.out.println(" Enter a grade: ");
        }   int grade = input.nextInt();
        switch (grade / 10) {
            case 9, 10 -> gradeA++;
            case 8 -> gradeB++;
            case 7 -> gradeC++;
            case 6 -> gradeD++;
            case 5 -> gradeF++;
            }
        System.out.printf(" grade A ----> %d%n " , gradeA);
        System.out.printf(" grade B ----> %d%n " , gradeB);
        System.out.printf(" grade C ----> %d%n " , gradeC);
        System.out.printf(" grade D ----> %d%n " , gradeD);
        System.out.printf(" grade E ----> %d%n " , gradeE);
        System.out.printf(" grade F ----> %d%n " , gradeF);

        System.out.printf( "Average score of %d students ");
        }

    }

