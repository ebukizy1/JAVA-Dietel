package nokiaphone;

import java.util.Scanner;

public class Games {
    private static final Scanner input = new Scanner(System.in);

    public static void showGames() {
        System.out.println("""
                1: snake ||
                2: space impact
                3: bantumi
                4: paris ||
                5: football
                6: settings                    7: menu
                """);
        System.out.println("pick an option to proceed");
        game();
    }

    public static void game() {
        System.out.println("games");
        int games = input.nextInt();
        switch (games) {
            case 1, 2, 3, 4, 5, 6: {
                System.out.println("""
                        continue
                        option
                        """);
                System.out.println("""
                         1: back                         2: menu
                        """);
                int whatsapp = input.nextInt();
                switch (whatsapp) {
                    case 1 ->Games.showGames();
                    case 2 -> MenuBar.showMenuBar();
                }
            }
            case 7: MenuBar.showMenuBar();
        }
    }
}