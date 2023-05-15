package chapter6;

import java.util.Scanner;

public class ParkingCharges {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            double totalCharge = 0;

        System.out.println(" enter the total customer ");
        int customer = input.nextInt();
        int hour;
        for(int count = 0; count < customer; count++ ){
            System.out.println(" enter the hour for each customer " + count + ":" );
            hour = input.nextInt();
            double charges = calculateCharges(hour);
            System.out.printf("%14s%14s %n", "customer", "hour");
            System.out.printf("%14d%14.2f%n", count,charges );
            totalCharge += charges;
        }
        System.out.printf( "the total charges for yesterday receipt: %10.2f ", totalCharge);



    }


        public  static double calculateCharges(int hour){
        double minimumGarageFees = 2.00;
        double additionalFeesForEachHour = 0.50;
        double additionalHour = 0;
        double excess =0;
        double totalCharges = 0;
            double maximumChargesFor24HOurs = 10.00;
        if(hour > 0 && hour <= 3) return  minimumGarageFees;
            if(hour> 3 && hour < 24) {
                additionalHour = hour -3;
                excess = additionalHour * minimumGarageFees;
                totalCharges = excess + minimumGarageFees;
                return totalCharges;
            }
        if (hour == 24) return  maximumChargesFor24HOurs;
      return 0;
        }

    }





