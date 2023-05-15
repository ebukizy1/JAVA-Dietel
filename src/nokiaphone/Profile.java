package nokiaphone;

import java.util.Scanner;

public class Profile {
    private static Scanner input = new Scanner(System.in);

    public static void showProfile() {
        System.out.println("""
                ========================
                ->>>>>>>PROFILE->>>>>>>>>
                =========================
                
                 
                You can easily edit the settings of the selected profile in the tones 
                menu. in standby mode or during a call: press the key quickli scroll
                to the desired profile and press OK
                """);
        System.out.println("1: back                2: menu");
        int profile = input.nextInt();
        switch (profile) {
            case 1 -> MenuBar.showMenuBar();


        }
    }
}
