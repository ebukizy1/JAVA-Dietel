package chapter3;

import java.util.Scanner;

public class HeartRateApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your FirstName: ");
        String firstName = input.nextLine();
        System.out.println("Enter your lastName: ");
        String lastName = input.nextLine();
        System.out.println("Enter your Date of Birt e.g 20-Apr-2002");
        String dateOfBirth = input.nextLine();
        HeartRate heart = new HeartRate(firstName, lastName, dateOfBirth);
        System.out.println("The first Name is " + heart.getFirstName());
        System.out.println("The last Name is " + heart.getLastName());
        System.out.println(" The date of birth is " + heart.getDateOfBirth());
        System.out.println(" The Age is " + heart.getAge());
        System.out.println(" The maximum heart rate " + heart.getMaximumHeartRate());
        System.out.println(" The target heart rate " + heart.getTargetHeartRate());


    }
}
