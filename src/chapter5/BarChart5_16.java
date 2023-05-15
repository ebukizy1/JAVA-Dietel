package chapter5;

import java.util.Scanner;

public class BarChart5_16 {
    Scanner input = new Scanner(System.in);
    int myNumber1, myNumber2, myNumber3, myNumber4, myNumber5;
    String firstNumber="", secondNumber="", thirdNumber="",
    fourthNumber="", fifthNumber="", stars="";

    public void setNumberOfStars(int number1, int number2, int number3,
                                 int number4, int number5) {
        myNumber1 = number1;
        myNumber2 = number2;
        myNumber3 = number3;
        myNumber4 = number4;
        myNumber5 = number5;
    }
    public void displayNumberOfStars() {
        int numb;
        System.out.println("Enter first Number");

        firstNumber = "first Number: ";
        for (int i = 0; i < myNumber1; i++){
            while (myNumber1 > 30){
                System.out.println("Enter integer number range from 1 - 30");
                numb = input.nextInt();
               }
                         stars += "*";
        }
                        firstNumber += stars;
                        stars="";
                        System.out.println(firstNumber);

      secondNumber = "second Number: ";
        for (int i = 0; i < myNumber2; i++){
            while (myNumber2 > 30){
                System.out.println("Enter integer number range from 1 - 30");
                numb = input.nextInt();}
            stars += "*";
        }
        secondNumber += stars;
        stars="";
        System.out.println(secondNumber);

        thirdNumber = "third";
        for(int i = 0; i<myNumber3; i++){
            while (myNumber3 > 30) {
                System.out.println("Enter integer number range from 1 - 30");
                    numb = input.nextInt();
            }
                      stars+="*";
                    }thirdNumber+=stars;
                   stars="";
                    System.out.println(thirdNumber);

        fourthNumber = "fourth Number: ";
        for (int i = 0; i < myNumber4; i++){
            while (myNumber4 > 30){
                System.out.println("Enter integer number range from 1 - 30");
                numb = input.nextInt();}
            stars += "*";
        }
        fourthNumber += stars;
        stars="";
        System.out.println(fourthNumber);

        fifthNumber = "fifth Number: ";
        for (int i = 0; i < myNumber5; i++){
            stars += "*";
        }
        fifthNumber += stars;
        stars="";
        System.out.println(fifthNumber);

        }
        }




