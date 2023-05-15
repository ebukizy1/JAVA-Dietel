package nokiaphone;

import java.util.Scanner;

public class Chat {
    private static Scanner input = new Scanner(System.in);

    public static void showChat(){
        System.out.println("""
                1: whatsapp
                2: facebook
                3: snapChat
                4: twitter
                5: instagram
                6: tiktok                    7: menu
                """);
        System.out.println(" pick an option to proceed");
        chat();
    }
    public static void chat(){
        System.out.println("chat");
        int chat = input.nextInt();
        switch (chat) {
            case 1 -> {
                System.out.println("""
                        OPENING WHATSAPP
                        chat with segun
                        chat with mike 
                        chat with ada
                        """);
                System.out.println("""
                         1: back                         2: menu
                        """);
                int whatsapp = input.nextInt();
                switch (whatsapp) {
                    case 1 -> Chat.showChat();
                    case 2 -> MenuBar.showMenuBar();
                }
            }
            case 2 -> {
                System.out.println("""
                        OPENING FACEBOOK
                        open messenger
                        chat with friends
                        join group
                        invite friends to group
                        """);
                System.out.println("""
                         1: back                         2: menu
                        """);
                int faceBook = input.nextInt();
                switch (faceBook) {
                    case 1 -> Chat.showChat();
                    case 2 -> MenuBar.showMenuBar();
                }
            }
            case 3 -> {
                System.out.println("""
                        OPENING SNAPCHAT
                        view snap
                        view chat
                        view stories
                        """);
                System.out.println("""
                         1: back                         2: menu
                        """);
                int snapChat = input.nextInt();
                switch (snapChat) {
                    case 1 -> Chat.showChat();
                    case 2 -> MenuBar.showMenuBar();
                }
            }
            case 4 -> {
                System.out.println("""
                        OPENING TWITTER
                        view tweet
                        tweet davido comment
                        follow: wizkid , olamide 
                        """);
                System.out.println("""
                         1: back                         2: menu
                        """);
                int twitter = input.nextInt();
                switch (twitter) {
                    case 1 ->Chat.showChat();
                    case 2 -> MenuBar.showMenuBar();
                }
            }
            case 5 -> {
                System.out.println("""
                        OPENING INSTAGRAM
                        mike following you
                        people you may know 
                        davido post
                        #tag messi
                        """);
                System.out.println("""
                         1: back                         2: menu
                        """);
                int instagram = input.nextInt();
                switch (instagram) {
                    case 1 ->Chat.showChat();
                    case 2 -> MenuBar.showMenuBar();
                }
            }
            case 6 -> {
                System.out.println("""
                        OPENING INSTAGRAM
                        view videos
                        post videos
                        post photo
                        """);
                System.out.println("""
                         1: back                         2: menu
                        """);
                int tiktok = input.nextInt();
                switch (tiktok) {
                    case 1 -> Chat.showChat();
                    case 2 -> MenuBar.showMenuBar();
                }
            }
            case 7-> MenuBar.showMenuBar();
        }
    }
}
