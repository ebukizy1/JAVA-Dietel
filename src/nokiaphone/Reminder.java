package nokiaphone;

import java.util.Scanner;

public class Reminder {
    private static Scanner input = new Scanner(System.in);

public static void showReminder() {
    System.out.println("""
            1: note                         2; menu
                
            """);
    System.out.println("pick an option to proceed");
    reminder();
}
    public static void reminder(){
             System.out.println("note");
             int note = input.nextInt();
             switch (note){
                case 1-> {
                    System.out.println("""
                        ===>>>NOTE>>>====
                        add new
                        erase
                        view all
                        edit
                        send 
                        """);
                System.out.println("1: back                 2: menu ");
                int reminder = input.nextInt();
                switch (reminder) {
                    case 1-> showReminder();
                    case 2 -> MenuBar.showMenuBar();
                }
            }
            case 2->MenuBar.showMenuBar();
    }


}
}
