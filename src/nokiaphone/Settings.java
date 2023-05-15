package nokiaphone;

import java.util.Scanner;

public class Settings {
    private static Scanner input = new Scanner(System.in);

    public static void showSettings() {
        System.out.println("""
                1:Call settings
                2: Phone settings
                3: Security settings
                4: Restore factory settings               5: menu
                """);
        System.out.println("pick an option to proceed");
        settings();
    }

    public static void settings() {
        System.out.println("settings");
        int settings = input.nextInt();
        switch (settings) {
            case 1 -> {
                System.out.println("Call settings ");
                System.out.println("""
                        1: Automatic redial
                        2: Speed dialling
                        3: Call waiting sending
                        4: own number sending
                        5: Phone line use
                        6: Automatic answer
                        
          
                        """);
                System.out.println("pick an option to proceed");

                int callSetting = input.nextInt();
                switch (callSetting) {
                    case 1 -> {
                        System.out.println(" calling .....favor......");
                        System.out.println("""
                                1: back                         2: menu
                                """);
                        int whatsapp = input.nextInt();
                        switch (whatsapp) {
                            case 1 -> Settings.showSettings();
                            case 2 -> MenuBar.showMenuBar();
                        }
                    }
                    case 2 -> {
                        System.out.println(" favor...........");
                        System.out.println("""
                                1: back                         2: menu
                                """);
                        int whatsapp = input.nextInt();
                        switch (whatsapp) {
                            case 1 -> Settings.showSettings();
                            case 2 -> MenuBar.showMenuBar();
                        }
                    }
                    case 3 -> {
                        System.out.println("favor ......  .... ");
                        System.out.println("""
                                 1: back                         2: menu
                                """);
                        int whatsapp = input.nextInt();
                        switch (whatsapp) {
                            case 1 -> Settings.showSettings();
                            case 2 -> MenuBar.showMenuBar();
                        }
                    }
                    case 4 -> {
                        System.out.println(" 09073406000");
                        System.out.println("""
                                 1: back                         2: menu
                                """);
                        int whatsapp = input.nextInt();
                        switch (whatsapp) {
                            case 1 -> Settings.showSettings();
                            case 2 -> MenuBar.showMenuBar();
                        }
                    }
                    case 5 -> {
                        System.out.println("mtn services ");
                        System.out.println("""
                                 1: back                         2: menu
                                """);
                        int whatsapp = input.nextInt();
                        switch (whatsapp) {
                            case 1 -> Settings.showSettings();
                            case 2 -> MenuBar.showMenuBar();
                        }
                    }
                    case 6 -> {
                        System.out.println("pick.. favor");
                        System.out.println("""
                                 1: back                         2: menu
                                """);
                        int whatsapp = input.nextInt();
                        switch (whatsapp) {
                            case 1 -> Settings.showSettings();
                            case 2 -> MenuBar.showMenuBar();
                        }
                    }
                }
            }
            case 2 -> {
                System.out.println("Phone settings");
                System.out.println("""
                        1: Language
                        2; Cell info display
                        3: Welcome note
                        4: Network selection
                        5: Light
                        6: Confirm SIM services actions
                        
                        """);
                System.out.println("pick an option to proceed");
                int phoneSettings = input.nextInt();
                switch (phoneSettings) {
                    case 1 -> {
                        System.out.println("""
                                english
                                yoruba
                                hausa
                                china
                                        
                                """);
                        System.out.println("""
                                 1: back                         2: menu
                                """);
                        int whatsapp = input.nextInt();
                        switch (whatsapp) {
                            case 1 -> Settings.showSettings();
                            case 2 -> MenuBar.showMenuBar();
                        }
                    }
                    case 2 -> {
                        System.out.println("""
                                cellular network
                                micro cellular
                                
                    
                                """);
                        System.out.println("""
                                 1: back                         2: menu
                                """);
                        int whatsapp = input.nextInt();
                        switch (whatsapp) {
                            case 1 -> Settings.showSettings();
                            case 2 -> MenuBar.showMenuBar();
                        }
                    }
                    case 3 -> {
                        System.out.println("welcome note for your phone");
                        System.out.println("""
                                 1: back                         2: menu
                                """);
                        int whatsapp = input.nextInt();
                        switch (whatsapp) {
                            case 1 -> Settings.showSettings();
                            case 2 -> MenuBar.showMenuBar();
                        }
                    }
                    case 4 -> {
                        System.out.println("""
                                MTN
                                AIRTEL
                                GLO
                                """);
                        System.out.println("""
                                 1: back                         2: menu
                                """);
                        int whatsapp = input.nextInt();
                        switch (whatsapp) {
                            case 1 -> Settings.showSettings();
                            case 2 -> MenuBar.showMenuBar();
                        }
                    }
                    case 5 -> {
                        System.out.println("on keypad light");
                        System.out.println("""
                                 1: back                         2: menu
                                """);
                        int whatsapp = input.nextInt();
                        switch (whatsapp) {
                            case 1 -> Settings.showSettings();
                            case 2 -> MenuBar.showMenuBar();
                        }
                    }
                    case 6 -> {
                        System.out.println("""
                                show hidden message
                                hide message
                                
                                
                                """);
                        System.out.println("""
                                 1: back                         2: menu
                                """);
                        int whatsapp = input.nextInt();
                        switch (whatsapp) {
                            case 1 ->Settings.showSettings();
                            case 2 -> MenuBar.showMenuBar();
                        }
                    }
                }
            }
            case 3 -> {
                System.out.println("Security settings");
                System.out.println("""
                        1: PIN code request
                        2: Call barring services
                        3: Fixed dialling 
                        4: Closed user group
                        5: Phone security
                        6; change access code
                        
                        """);
                System.out.println("pick an option to proceed");
                int security = input.nextInt();
                switch (security) {
                    case 1 -> {
                        System.out.println("code requested");
                        System.out.println("""
                                 1: back                         2: menu
                                """);
                        int whatsapp = input.nextInt();
                        switch (whatsapp) {
                            case 1 -> Settings.showSettings();
                            case 2 -> MenuBar.showMenuBar();
                        }
                    }
                    case 2 -> {
                        System.out.println("""
                                restriction option
                                cancel
                                actviate
                                status
                                """);
                        System.out.println("""
                                 1: back                         2: menu
                                """);
                        int whatsapp = input.nextInt();
                        switch (whatsapp) {
                            case 1 -> Settings.showSettings();
                            case 2 -> MenuBar.showMenuBar();
                        }
                    }
                    case 3 -> {
                        System.out.println(" restrict outgoing calls to select numbers");
                        System.out.println("""
                                1: back                         2: menu
                                      """);
                        int whatsapp = input.nextInt();
                        switch (whatsapp) {
                            case 1 ->Settings.showSettings();
                            case 2 -> MenuBar.showMenuBar();
                        }
                    }
                    case 4 -> {
                        System.out.println(" choose specific user to call you");
                        System.out.println("""
                                 1: back                         2: menu
                                """);
                        int whatsapp = input.nextInt();
                        switch (whatsapp) {
                            case 1 -> Settings.showSettings();
                            case 2 -> MenuBar.showMenuBar();
                        }
                    }
                    case 5 -> {
                        System.out.println("""
                                pin 
                                puk code
                                pin code2
                                          
                                """);
                        System.out.println("""
                                 1: back                         2: menu
                                """);
                        int whatsapp = input.nextInt();
                        switch (whatsapp) {
                            case 1 -> Settings.showSettings();
                            case 2 -> MenuBar.showMenuBar();
                        }
                    }
                    case 6 -> {
                        System.out.println("""
                                change pin
                                change code
                                change puk code
                                """);
                        System.out.println("""
                                 1: back                         2: menu
                                """);
                        int whatsapp = input.nextInt();
                        switch (whatsapp) {
                            case 1 -> Settings.showSettings();
                            case 2 -> MenuBar.showMenuBar();
                        }
                    }
                }
            }
            case 4 -> {
                System.out.println("""
                        general factory settings
                        factory for menus
                        """);
                System.out.println("""
                        1: back                         2: menu
                         """);
                int whatsapp = input.nextInt();
                switch (whatsapp) {
                    case 1 -> Settings.showSettings();
                    case 2 -> MenuBar.showMenuBar();
                }
            }
            case 5 -> MenuBar.showMenuBar();
        }
    }
}
