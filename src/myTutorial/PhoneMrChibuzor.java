package myTutorial;

import java.util.Scanner;

public class PhoneMrChibuzor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("LIST OF MENU");
        System.out.println("press 1 ------------------> PhoneBook ");
        System.out.println("press 2 ------------------>for message ");
        System.out.println("press 3 ------------------> chat");
        System.out.println("press 4 ------------------> call Register");
        System.out.println("press 5 --------------------> tone");
        System.out.println("press 6 --------------------->settings ");
        System.out.println("press 7 --------------------> game");
        System.out.println("press 8 --------------------> calculator");
        System.out.println("press 9 ---------------------> reminder");
        System.out.println(" press 10 -----------------> profile");
        System.out.println("press 11 --------------------> sim services");
        System.out.println(" menu");
        int menu = input.nextInt();
        switch (menu) {
            case 1:
                System.out.println("Phonebook");
                int phonebook = input.nextInt();
                switch (phonebook) {
                    case 1 -> System.out.println("Switch");
                    case 2 -> System.out.println("Services ");
                    case 3 -> System.out.println("Add name ");
                    case 4 -> System.out.println("Erase");
                    case 5 -> System.out.println("Edit");
                    case 6 -> System.out.println("Assign tone");
                    case 7 -> System.out.println("Send b' card");
                    case 8 -> {
                        System.out.println("Option");
                        int option = input.nextInt();
                        switch (option) {
                            case 1 -> System.out.println("Type of view");
                            case 2 -> System.out.println("Memory status");
                        }
                    }
                    case 9 -> System.out.println("Speed dail");
                    case 10 -> System.out.println("Voice tags");
                }
            case 2:
                System.out.println(" messages");
                int message = input.nextInt();
                switch (message) {
                    case 1 -> System.out.println("Write message");
                    case 2 -> System.out.println("Inbox");
                    case 3 -> System.out.println("Outbox");
                    case 4 -> System.out.println("Picture messages");
                    case 5 -> System.out.println("Template");
                    case 6 -> System.out.println("Smileys");
                    case 7 -> {
                        System.out.println("Message settings");
                        int messageSettings = input.nextInt();
                        switch (messageSettings) {
                            case 1:
                                System.out.println(" set 1");
                                int set1 = input.nextInt();
                                switch (set1) {
                                    case 1 -> System.out.println("Message centre number");
                                    case 2 -> System.out.println(" Messages sent as");
                                    case 3 -> System.out.println(" Message validility");
                                }
                                int common = input.nextInt();
                                switch (common) {
                                    case 1 -> System.out.println(" Delivery reports");
                                    case 2 -> System.out.println(" Reply via message");
                                    case 3 -> System.out.println(" Character support");
                                }
                        }
                    }

                    case 8 -> System.out.println(" Info service");
                    case 9 -> System.out.println(" voice mailbox");
                    case 10 -> System.out.println(" Services command editor");
                }
            case 3:
                System.out.println(" chat");
                int chat = input.nextInt();
                switch (chat){
                    case 1:
                        System.out.println("chat");
                }
            case 4:
                System.out.println(" call Register");
                int register = input.nextInt();
                switch (register){
                    case 1:
                        System.out.println(" missed calls");
                        break;
                    case 2:
                        System.out.println("Received calls");
                        break;
                    case 3:
                        System.out.println(" Dailled numbers");
                        break;
                    case 4:
                        System.out.println(" Erase recent call list");
                        break;
                    case 5: {
                        System.out.println(" call duration");
                        int duration = input.nextInt();
                        switch (duration) {
                            case 1:
                                System.out.println(" last call duration");
                                break;
                            case 2:
                                System.out.println(" all call's duration");
                                break;
                            case 3:
                                System.out.println(" Receive call's duration");
                                break;
                            case 4:
                                System.out.println(" Dialled calls duration ");
                                break;
                            case 5:
                                System.out.println(" clear timer");
                                break;
                        }
                    }
                    case 6: {
                        System.out.println("show call cost");
                        int cost = input.nextInt();
                        switch (cost) {
                            case 1:
                                System.out.println(" last call cost");
                                break;
                            case 2:
                                System.out.println(" all calls cost");
                                break;
                            case 3:
                                System.out.println(" Clear counters");
                                break;
                        }
                    }
                    case 7: {
                        System.out.println(" Cost setting");
                        int cost = input.nextInt();
                        switch (cost) {
                            case 1:
                                System.out.println(" call cost limit");
                                break;
                            case 2:
                                System.out.println(" show cost in");
                                break;
                        }
                    }
                    case 8:
                        System.out.println(" prepaid credit");
                       break;
                        }
            case 5:
                System.out.println("tone");
                int tone = input.nextInt();
                switch (tone){
                    case 1:

                }



                                }

                }


        }

