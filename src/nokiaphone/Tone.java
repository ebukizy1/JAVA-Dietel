package nokiaphone;

import java.util.Scanner;

public class Tone {
    private static Scanner input = new Scanner(System.in);
    public static void showTone() {
        System.out.println("""
                1: Ringing tone
                2: Ringing volume
                3: Incoming 
                4: Composer
                5: Message alert tone
                6: Keypad tones
                7: Warning and game tones
                8: Vibrant alert
                                                           9: menu
                """);
        System.out.println("pick an option to proceed");
        tone();
    }

        public static void tone(){
       int tone = input.nextInt();
       switch (tone) {
           case 1 -> {
               System.out.println("""
                   1: guitar
                   2: soul ringing tone
                   3: xpress music
                   4: phone bloom
                   5: espionage tune
                   6: lumia 
                   """);
               System.out.println("""
                        1: back                         2: menu
                       """);
               int whatsapp = input.nextInt();

           switch (whatsapp) {
               case 1 -> Tone.showTone();
               case 2 -> MenuBar.showMenuBar();
           }
       }

           case 2-> {
               System.out.println("""
                       -------------------15
                       0-------------------
                       """);
               System.out.println("""
                        1: back                         2: menu
                       """);
               int whatsapp = input.nextInt();
               switch (whatsapp) {
                   case 1 -> Tone.showTone();
                   case 2 -> MenuBar.showMenuBar();
               }
           }
           case 3-> {
               System.out.println("ringing.............");
               System.out.println("""
                        1: back                         2: menu
                       """);
               int whatsapp = input.nextInt();
               switch (whatsapp) {
                   case 1 -> Tone.showTone();
                   case 2 -> MenuBar.showMenuBar();
               }
           }
           case 4-> {
               System.out.println(" composer");
               System.out.println("""
               1: back                         2: menu
               """);
               int whatsapp = input.nextInt();
               switch (whatsapp) {
                   case 1 -> Tone.showTone();
                   case 2 -> MenuBar.showMenuBar();
               }
           }
           case 5-> {
               System.out.println("""
                       beem 
                       tiktok
                       boom""");
               System.out.println("""
                        1: back                         2: menu
                       """);
               int whatsapp = input.nextInt();
               switch (whatsapp) {
                   case 1 ->Tone.showTone();
                   case 2 -> MenuBar.showMenuBar();
               }
           }
            case 6-> {
                System.out.println(" boom");
                System.out.println("""
                 1: back                         2: menu
                 """);
                int whatsapp = input.nextInt();
                switch (whatsapp) {
                    case 1 -> Tone.showTone();
                    case 2 -> MenuBar.showMenuBar();
                }
            }
            case 7-> {
                System.out.println(" vibrating");
                System.out.println("""
                         1: back                         2: menu
                        """);
                int whatsapp = input.nextInt();
                switch (whatsapp) {
                    case 1 ->Tone.showTone();
                    case 2 -> MenuBar.showMenuBar();
                }
            }
            case 8-> {
                System.out.println("""
                        water color
                        bubbles
                        skyfly""");
                System.out.println("""
                         1: back                         2: menu
                        """);
                int whatsapp = input.nextInt();
                switch (whatsapp) {
                    case 1 -> Tone.showTone();
                    case 2 -> MenuBar.showMenuBar();
                }
            }
            case 9-> MenuBar.showMenuBar();
       }

    }
}
