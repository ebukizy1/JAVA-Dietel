package chapter4;

import java.util.Scanner;

public class encryption {
    Scanner input = new Scanner(System.in);

    public String encryptDigit(String data) {
        int firstNumber = 0;
        int secondNumber = 0;
        int thirdNumber = 0;
        int fourthNumber = 0;
        int count = 0;
        while (count < data.length()) {
            char numberDigit = data.charAt(count);
            int numDigit = Character.getNumericValue(numberDigit);
            int result = (numDigit + 7) % 10;
            if (count == 0) {
                firstNumber = result;
            }
            if (count == 1) {
                secondNumber = result;
            }
            if (count == 2) {
                thirdNumber = result;
            }
            if (count == 3) {
                fourthNumber = result;
            }
            count++;
        }
        return thirdNumber + "" + fourthNumber + "" + firstNumber + "" + secondNumber;
    }

    public String decryptedDigit(String data) {
        int count = 0;
        int firstNumber = 0;
        int secondNumber = 0;
        int thirdNumber = 0;
        int fourthNumber = 0;
        while (count < data.length()) {
            char numbaDigit = data.charAt(count);
            int numDigit = Character.getNumericValue(numbaDigit);
            int result = (10 + numDigit - 7) % 10;
            if (count == 0) {
                firstNumber = result;
            }
            if (count == 1) {
                secondNumber = result;
            }
            if (count == 2) {
                thirdNumber = result;
            }
            if (count == 3) {
                fourthNumber = result;
            }
            count++;
        }
        return thirdNumber + "" + fourthNumber + "" + firstNumber + "" + secondNumber;
    }

    public void userValidation() {
        System.out.println("""
                =======================
                ==>>>CRYPTOGRAPHY<<<==
                =======================
                1) Encrypted 
                2) Decrypted
                3) Exit
                press 1 encrypt          2 decrypt            3 exit
                """);
        String option = input.nextLine();
        switch (option) {
            case "1": {
                System.out.println("Enter a 4 digit number: ");
                String data = input.nextLine();
                while (data.length() != 4 || !data.matches("[0123456789]+")) {
                    System.out.println("Enter a valid 4 digit number");
                    data = input.nextLine();}
                System.out.println("The encrypted data of  " + data + " is " + encryptDigit(data));
                System.out.println("""
                        1 to go back
                        """);
                data = input.nextLine();
                switch (data) {
                    case "1":
                        userValidation();}}

            case "2": {
                System.out.println("Enter a 4 digit number: ");
                String data = input.nextLine();
                while (data.length() != 4 || !data.matches("[0123456789]+")) {
                    System.out.println("Enter a valid 4 digit Number ");
                    data = input.nextLine();}
                System.out.println("The decrypted data of the encrypted  " + encryptDigit(data) + " is " + decryptedDigit(data));
                System.out.println("""
                         1 to go back
                        """);
                data = input.nextLine();
                switch (data) {
                    case "1":
                        userValidation();}}
            case "3":
                System.out.println("Good bye pals");

        }
    }
}
