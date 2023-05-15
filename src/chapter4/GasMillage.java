package chapter4;

import java.util.Scanner;

public class
GasMillage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int trip;

        trip = input.nextInt();
         while( trip != -1){
             System.out.println(" Hello ! Enter the mile that is been covered for each trip:");
             int miles = input.nextInt();
             System.out.println(" Hello!  enter the number of gallon bought: ");
            int gallon = input.nextInt();
            float miles_per_gallon = miles / gallon;
             System.out.print(miles_per_gallon);
             System.out.println();
             float combineMilesPerGallon = 0;
             combineMilesPerGallon +=miles_per_gallon;
                 System.out.printf(" the combine miles_per_gallon for each trip %f%n ", combineMilesPerGallon);
             System.out.println(" To Halt the program press -1");
             trip = input.nextInt();
             }
         }





    }
