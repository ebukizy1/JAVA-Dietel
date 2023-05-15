package chapter7;

import java.awt.*;
import java.util.Scanner;

public class ArrayOfPoint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the element(max 20):");
        int userInput = input.nextInt();
        while(userInput>20 || userInput<=0){
            System.out.println("invalid number try again!!");
            userInput = input.nextInt();
        }
        Point [] myArraypoint = new Point[userInput];
        fillArrayOfPoint(myArraypoint);
        printArraysOfPoints(myArraypoint);


    }

    private static void printArraysOfPoints(Point[] myArraypoint) {
        System.out.println("These elements are: '");
        for(int i = 0; i < myArraypoint.length; i++){
            System.out.println("(" +"%d5%15d" + myArraypoint[i].x + ", " + myArraypoint[i].y + ") ");
        }
    }

    private static void fillArrayOfPoint(Point[] myArraypoint) {
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < myArraypoint.length; i++){
            System.out.println("Enter x and y for point  " + (i + 1) +": ");
            myArraypoint[i] = new Point(input.nextInt(), input.nextInt());
        }
    }
}
