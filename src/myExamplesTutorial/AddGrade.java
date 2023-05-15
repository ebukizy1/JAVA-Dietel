package myExamplesTutorial;

import java.util.Scanner;

public class AddGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;
        int counter = 0;
        System.out.println("Enter the first grade ");
        int grade = input.nextInt();
        while(grade != -1){
            total = grade + total;
            counter++;
            System.out.println("Enter the next grade ");
           grade = input.nextInt();
           if(counter != 0) {
               double average = (double) total / counter;
               System.out.printf("%nTotal of the %d grades entered is %d%n ", counter,total);
               System.out.printf("Class average is %.2f%n", average);
           }else{
               System.out.println("No grade were entered");
           }

        }
    }
}
