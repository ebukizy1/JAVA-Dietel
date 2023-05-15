package DanielyangAssessment;

import java.util.Scanner;

public class MrNed {
    public static void main(String[] args) {

        int number = 3;
        int finalNumber = 21;
        int total = 0;
        while(number<=finalNumber){
             total+=number++;
            if(!isEvenNumbers(number)){
                continue;
            }

            if(total ==5){
                break;
            }
            System.out.println("old number " + total);
            }

        }

    public static boolean isEvenNumbers(int number) {
        if (number % 2 == 0) {
            return true;
        } else return false;
    }
}
