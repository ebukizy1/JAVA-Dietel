package chapterseven;



import java.util.Scanner;

public class GradeScore {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the number of student");
        int number = input.nextInt();
        checkStudentScore(number);




    }

    public static void checkStudentScore(int number) {
        int[] studentScore = new int[number];
        int score;
        for (int index = 0; index < studentScore.length; index++) {
            System.out.println("enter the score of the student");
            score = input.nextInt();
            studentScore[index] = score;
            String grade = "";
            for (int index1 = 0; index1 < studentScore.length; index1++) {
                if (studentScore[index] > 70 && studentScore[index] <= 100) grade = "A";
                else if (studentScore[index] > 50 && studentScore[index] <= 69) grade = "B";
                else if (studentScore[index] > 40 && studentScore[index] <= 40) grade = "C";
                else grade = "F";
            }
            System.out.println("Student " + " score " + " is " + score + " and " + " grade " + " is " + grade);
        }
    }
}
