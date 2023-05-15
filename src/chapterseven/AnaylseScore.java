package chapterseven;

import javax.swing.plaf.IconUIResource;
import java.util.Arrays;
import java.util.Scanner;

public class AnaylseScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


/*
    (Analyze scores) Write a program that reads an unspecified number of scores and
    determines how many scores are above or equal to the average and how many
    scores are below the average. Enter a negative number to signify the end of the
    input. Assume that the maximum number of scores is 100.

 */
        System.out.println("enter a number or -1 to exit");
        int scores = input.nextInt();
        int count = 0;
        int [] arr = new int[scores];
        int average = 0;
        int sum = 0;
        while(scores != -1){
            System.out.println("enter a number -1 to exit");
            arr[count++] =scores = input.nextInt();
            count++;
            sum += arr[count++];
            }
            average = sum / count;

        System.out.println();
        }



    }

