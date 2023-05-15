package chapter5;

import java.io.PrintStream;
import java.util.Scanner;

public class LetterGrade {
    public static void main(String[] args) {
        int total = 0;
        int gradeCounter = 0;
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;
        int fCount = 0;

        Scanner input = new Scanner(System.in);
        System.out.printf("%s%n%s%n     %s%n     %s%n",
                "Enter the integer grade int the range 0 -100.",
                "Type the end- of- line indicator to terminate input",
                "On UNIX/ LINUX/macOS type <Ctrl> d then press Enter",

                "On windows type <Ctrl> z then press Enter ");
        while (input.hasNext()) {
            int grade = input.nextInt();
            total += grade;
            ++gradeCounter;
            switch (grade / 10) {
                case 9:
                case 10:
                    ++aCount;
                    break;
                case 8:
                    ++bCount;
                    break;
                case 7:
                    ++cCount;
                    break;
                case 6:
                    ++dCount;
                    break;
                default:
                    ++fCount;
                    break;
            }
        }
        System.out.printf("%n Grade Report : %n");
        if (gradeCounter != 0) {
            double average = (double) total / gradeCounter;
            System.out.printf("Total of the %d grade entered is %d%n",
                    gradeCounter, total);
            System.out.printf("Class average is %.2f", average);
            System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
                    "Number of students who received each grade:",
                    "A: ", aCount, // display number of A grades
                    "B: ", bCount, // display number of B grades
                    "C: ", cCount, // display number of C grades
                    "D: ", dCount, // display number of D grades
                    "F: ", fCount); // display number of F grades
        } else { // no grades were entered, so output approp


        }
    }
}

