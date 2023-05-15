package chapterFive;
import java.util.Scanner;

public class HigestScore {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        System.out.println("enter the number of Student");
        int numberOfStudent = input.nextInt();
        int higestScore = 0;
        String highestScoreName= "";
        int score;
        String name;
        for(int i = 1; i <=numberOfStudent; i++ ) {
            System.out.println("Enter student name");
            name = input.nextLine();
            System.out.println("Enter Student score");
            score = input.nextInt();
            if (score > higestScore) {
                higestScore = score;
                highestScoreName = name;
            }
            }
        System.out.println("the  student with the highestest score is : "  + highestScoreName + "  " + higestScore);
    }





            }
