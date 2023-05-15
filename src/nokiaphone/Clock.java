package nokiaphone;

import java.util.Scanner;

public class Clock {
     private static Scanner input = new Scanner(System.in);
           public static void showClock() {
              System.out.println("""
                =====================
                 =====CLOCK  ========
                ====================
                1: clock      
                   
                
                """);
            System.out.println("pick an option to proceed");
            clock();}

        public static void clock(){
        System.out.println("clock");
        int clock = input.nextInt();
        System.out.println("""
                 ->>>>CLOCK->>>>>>>
                 1: Alarm clock
                 2: Clock settings
                 3: Date settings
                 4: Stopwatch
                 5: Countdown timer
                 6: Auto update of time and date               7:menu
                 """);
        switch(clock) {
            case 1 -> {
                System.out.println(" ..ringing snooze ....");
                System.out.println("  1: back                  2: menu");
                int alarmClock= input.nextInt();
                switch (alarmClock) {
                    case 1 -> Clock.showClock();
                    case 2 -> MenuBar.showMenuBar();}}

            case 2 -> {
                System.out.println(" 12:20pm .... set clock..");
                System.out.println("1: back                  2: menu");
                int setClock = input.nextInt();
                switch (setClock) {
                case 1 -> Clock.showClock();
                case 2 -> MenuBar.showMenuBar();}}

           case 3-> {
                System.out.println(" 08 : 04: 2023");
                System.out.println(" 1: back                 2: menu");
                int setDate = input.nextInt();
                switch (setDate) {
                 case 1 -> Clock.showClock();
                 case 2 -> MenuBar.showMenuBar();}}

         case 4-> {
             System.out.println("counting........");
             System.out.println("1: back                    2: menu");
             int stoppageTime = input.nextInt();
             switch (stoppageTime) {
                 case 1 -> Clock.showClock();
                 case 2 -> MenuBar.showMenuBar();}}

         case 5-> {
             System.out.println(" timer.......");
             System.out.println("1: back             2: menu ");
             int timer = input.nextInt();
             switch (timer) {
                 case 1 ->Clock.showClock();
                 case 2 -> MenuBar.showMenuBar();}}

         case 6-> {
             System.out.println("date & time set already");
             System.out.println("1: back              2: menu");
             int updateTme = input.nextInt();
             switch (updateTme) {
                 case 1 ->Clock.showClock();
                 case 2 -> MenuBar.showMenuBar();}}

            case 7->MenuBar.showMenuBar();
         }
        }
    }

