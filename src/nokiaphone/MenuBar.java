package nokiaphone;

import java.util.Scanner;

public class MenuBar {
    private static Scanner input = new Scanner(System.in);

    public static void showMenuBar() {
        System.out.println("""
                ====================
                ==>>>MENU BAR==>>>
                ====================
                1: phonebook                        
                 2: message     
                 3: chat
                4: call register      
                5: tone           
                6: settings                 
                7:call divert           
                8: game          
                9: calculator            
                10: reminder        
                 11: clock        
                 12: profile
                 13: sim services
                """);
        System.out.println("pick an option to proceed");
        menu();
    }

    public static void menu() {
        int menu = input.nextInt();
        switch (menu) {
            case 1 ->  PhoneBook.showPhoneBook();
            case 2 -> Message.showMessage();
            case 3 -> Chat.showChat();
            case 4 -> CallRegister.showCallRegister();
            case 5 -> Tone.showTone();
            case 6 -> Settings.showSettings();
            case 7 -> CallDivert.showCallDivert();
            case 8 ->Games.showGames();
            case 9 -> Calculator.showCalculator();
            case 10 -> Reminder.showReminder();
            case 11 -> Clock.showClock();
            case 12 -> Profile.showProfile();
            case 13 -> SimServices.showSimServices();
        }

    }
}





