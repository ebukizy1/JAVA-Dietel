package nokiaphone;

import java.util.Scanner;

public class Message {
    private static Scanner input = new Scanner(System.in);

    public static void showMessage() {
        System.out.println("""
                =======================
                ->>>>MESSAGE BOX->>>>
                =======================
                1: Write messages
                2: Inbox
                3: Outbox
                4: Picture messages
                5: Template
                6: Smileys
                7; Message settings
                8: Info services
                9: Voice mailbox number
                10: Services command editor                                         
                11: go to menu                                              
                """);
        System.out.println("pick an option to proceed");
        message();
    }
      public static String  messageSettings(){
        return            """
                    1: Set 1
                    2: Common             
                    3: back                                   
                   4: exit to menu           
                   """;}

                  public static void message() {
                  System.out.println("message");
                  int message = input.nextInt();
                      switch (message) {
            case 1 -> {
                System.out.println("write message");
                System.out.println(" 1: back          2: menu");
                int writeMessage = input.nextInt();
                switch (writeMessage) {
                    case 1 -> Message.showMessage();
                    case 2 -> MenuBar.showMenuBar();}}
            case 2 -> {
                System.out.println("inbox");
                System.out.println( "1: back             2: menu");
                int inbox = input.nextInt();
                switch (inbox) {
                    case 1 -> Message.showMessage();
                    case 2 -> MenuBar.showMenuBar();}}
            case 3 -> {
                System.out.println("outbox");
                System.out.println("1: back               2: menu");
                int inbox = input.nextInt();
                switch (inbox) {
                    case 1 -> Message.showMessage();
                    case 2 -> MenuBar.showMenuBar();}}
            case 4 -> {
                System.out.println("picture message");
                System.out.println("1 back                  2: menu");
                int pictureMessage = input.nextInt();
                switch (pictureMessage) {
                    case 1 -> Message.showMessage();
                    case 2 -> MenuBar.showMenuBar();}}
            case 5 -> {
                System.out.println("template");
                System.out.println("1: back          2: menu");
                int template = input.nextInt();
                switch (template) {
                    case 1 -> Message.showMessage();
                    case 2 -> MenuBar.showMenuBar();}}
            case 6 -> {
                System.out.println("smiley");
                System.out.println("back                         2: menu");
                int smiley = input.nextInt();
                switch (smiley) {
                    case 1 -> Message.showMessage();
                    case 2 -> MenuBar.showMenuBar();}}
            case 7 -> {System.out.println("message settings");
                System.out.println(messageSettings());
                System.out.println("pick an option to proceed");
                int messageSettings = input.nextInt();
                switch (messageSettings) {
                    case 1 -> {System.out.println("""
                                 ->>>SET1->>>
                                 message centre number
                                  message sent as
                                 message  settings        
                                  1: back                                2: go to menu
                                """);
                        int set1 = input.nextInt();
                        switch (set1) {
                            case 1 -> Message.showMessage();
                            case 2 -> MenuBar.showMenuBar();
                            case 3-> Message.messageSettings();}}

                    case 2 -> {
                        System.out.println("""
                                ->>>>COMMON->>>>>
                                delivery report
                                 reply via same centre
                                 character support     
                                """);
                        System.out.println("1: back               2: menu");
                        int common = input.nextInt();
                        switch (common) {
                            case 1 -> Message.showMessage();
                            case 2 -> MenuBar.showMenuBar();
                        }
                    }
                    case 8 -> {
                        System.out.println(" info services");
                        System.out.println(" 1: back               2: menu");
                        int set1 = input.nextInt();
                        switch (set1) {
                            case 1 -> Message.showMessage();
                            case 2 -> MenuBar.showMenuBar();
                        }
                    }
                    case 9 -> {
                        System.out.println(" voice mailbox number");
                        System.out.println("1: back              2: menu");
                        int set1 = input.nextInt();
                        switch (set1) {
                            case 1 -> Message.showMessage();
                            case 2 -> MenuBar.showMenuBar();
                        }
                    }

                    case 10 -> {
                        System.out.println(" services command editor");
                        System.out.println("1: back               2: menu");
                        int set1 = input.nextInt();
                        switch (set1) {
                            case 1 -> Message.showMessage();
                            case 2 -> MenuBar.showMenuBar();
                        }
                    }
                    case 11 -> MenuBar.showMenuBar();
                }
            }

        }
    }
}

