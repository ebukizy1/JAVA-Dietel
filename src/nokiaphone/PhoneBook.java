package nokiaphone;

import java.util.Scanner;

public class PhoneBook {
    private static Scanner input = new Scanner(System.in);

    public static void showPhoneBook() {
        System.out.println("""
                   ===================
                     PHONEBOOK MENU
                  ====================
                1: Search
                2: Services Nos
                3: Add name
                4: Erase 
                5: Edit
                6: Assign tone
                7: Eend b' card
                8: Option
                9: Speed dail
                10: Voice tags                                 
                                          11: go to menu
                """);
        System.out.println(" pick an option to proceed");
        phoneBooks();
    }

        public static void phoneBooks() {
                int phonebook = input.nextInt();
                switch (phonebook) {
                 case 1 -> {
                System.out.println("""
                        ===SEARCH BAR===
                        1: menu
                        2: message
                        3: chat
                        4: call register
                        5: tone
                        6: settings
                        7: call divert
                        8: game
                        9: calculator
                        10: reminder
                        11: clock
                        12: profile
                        13: sim services                     
                        14: exit to menu                    
                            """);

                     System.out.println("press 14 back: ");
                     System.out.println(" pick an option to proceed");
                System.out.println(" SEARCH");
                int search = input.nextInt();
                switch (search) {
                    case 1, 14 -> MenuBar.showMenuBar();
                    case 2 -> Message.showMessage();
                    case 3 -> Chat.showChat();
                    case 4 -> CallRegister.showCallRegister();
                    case 5 -> Tone.showTone();
                    case 6 -> Settings.showSettings();
                    case 7 -> CallDivert.showCallDivert();
                    case 8 -> Games.showGames();
                    case 9 -> Calculator.showCalculator();
                    case 10 -> Reminder.showReminder();
                    case 11 -> Clock.showClock();
                    case 12 -> Profile.showProfile();
                    case 13 -> SimServices.showSimServices();

                }

            }
             case 2 ->{
                     System.out.println(" services Nos");
                     int services = input.nextInt();
                     switch (services){
                         case 1: MenuBar.showMenuBar();
                         case 2: PhoneBook.showPhoneBook();
                             System.out.println("press 2 back:  press 1 menu");
                     }}
             case 3 -> {
                         System.out.println(" add name");
                         int addName = input.nextInt();
                         switch (addName) {
                             case 1: MenuBar.showMenuBar();
                             case 2: PhoneBook.showPhoneBook();
                                 System.out.println("press 2 back:  press 1 menu");}}
            case 4 ->{
                    System.out.println(" erase");
                    int erase = input.nextInt();
                    switch (erase) {
                    case 1: MenuBar.showMenuBar();
                    case 2: PhoneBook.showPhoneBook();
                        System.out.println("press 2 back:  press 1 menu");}}
            case 5 ->{
                    System.out.println(" edit");
                    System.out.println("press 2 back:  press 1 menu");
                    int edit = input.nextInt();
                     switch (edit) {
                    case 1: MenuBar.showMenuBar();
                    case 2: PhoneBook.showPhoneBook();}}
            case 6 -> {
                    System.out.println(" assign tone");
                    System.out.println("press 2 back:  press 1 menu");
                    int assign = input.nextInt();
                    switch (assign) {
                        case 1: MenuBar.showMenuBar();
                        case 2: PhoneBook.showPhoneBook();}}
            case 7 -> {
                    System.out.println(" send b' card");
                    System.out.println("press 2 back:  press 1 menu");
                    int sendCard = input.nextInt();
                    switch (sendCard) {
                        case 1: MenuBar.showMenuBar();
                        case 2: PhoneBook.showPhoneBook();}}
            case 8 -> {
                System.out.println("option");
                System.out.println("""
                        1: ==Type of view==
                        2: Memory status 
                        
                        3: back               4: go to menu             
                        """);
                System.out.println(" pick an option to proceed");
                int option = input.nextInt();
                switch (option) {
                    case 1 -> System.out.println(" type of view");
                    case 2 -> System.out.println(" memory status");
                    case 3 -> showPhoneBook();
                    case 4-> MenuBar.showMenuBar();
                }
            }
            case 9 ->{
                    System.out.println("speed dials");
                System.out.println("press 2 back:  press 1 menu");
                    int speedDail = input.nextInt();
                    switch (speedDail) {
                        case 1: MenuBar.showMenuBar();
                        case 2: PhoneBook.showPhoneBook();
                            System.out.println("press 2 back:  press 1 menu");}}
            case 10 -> {
                    System.out.println(" voice tags");
                System.out.println("press 2 back:  press 1 menu");
                    int voiceTag = input.nextInt();
                    switch (voiceTag) {
                        case 1: MenuBar.showMenuBar();
                        case 2: PhoneBook.showPhoneBook();
                         }}
            case 11-> MenuBar.showMenuBar();
        }
    }
}

