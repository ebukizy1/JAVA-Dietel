package chapter4;

import java.util.Scanner;

public class encryptionPraction {
    public static void main(String[] args) {
            enrpytionPractice timi = new enrpytionPractice();

        Scanner input = new Scanner(System.in);


        System.out.println("1. Press 1 to encrypt");
        System.out.println("1. Press 2 to decrypt");
        System.out.println("1. Press 3 to exit");
        String option = input.nextLine();
        switch (option) {
            case "1":
                System.out.println("Enter number");
                String data = input.nextLine();
                while (data.length() != 4 || !data.matches("[0123456789]+"))
                {
                    System.out.println("Enter a valid four digit");
                    data = input.nextLine();
                }

                System.out.println("The encrypted number of " + data + " is " + timi.encrypt(data));
                break;
            case "2":
                System.out.println("Enter number");
                 data = input.nextLine();
                while (data.length() != 4 || !data.matches("[0123456789]+")) {
                    System.out.println("Enter a valid four digit");
                    data = input.nextLine();
                }

                System.out.println("The encrypted number of " + data + " is " + timi.decrypted(data));
                break;
            case "3":
                    System.out.println("Thank you");
                    break;
        }

    }
}
