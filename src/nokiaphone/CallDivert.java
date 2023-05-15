package nokiaphone;

import java.util.Scanner;

public class CallDivert {
    private static Scanner input = new Scanner(System.in);

    public static void showCallDivert(){
        System.out.println("""
                .......select one of the divert option....
                1: Cancel
                2: Activate               3:menu
                """);
        System.out.println("pick an option to proceed");
        callDivert();
    }
    public static void callDivert(){
        System.out.println(" call divert");
        int callDivert = input.nextInt();
        switch (callDivert){
            case 1-> {
                System.out.println(" cancel your call divert mode");
                System.out.println("""
                         1: back                         2: menu
                        """);
                int whatsapp = input.nextInt();
                switch (whatsapp) {
                    case 1 -> CallDivert.showCallDivert();
                    case 2 -> MenuBar.showMenuBar();
                }
            }
            case 2-> {
                System.out.println(" activate you call divert mode");
                System.out.println("""
                         1: back                         2: menu
                        """);
                int whatsapp = input.nextInt();
                switch (whatsapp) {
                    case 1 -> CallDivert.showCallDivert();
                    case 2 -> MenuBar.showMenuBar();
                }
            }
            case 3-> CallDivert.showCallDivert();
        }
    }
}
