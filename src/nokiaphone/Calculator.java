package nokiaphone;

import java.util.Scanner;

public class Calculator {
    private static Scanner input = new Scanner(System.in);
    public static void showCalculator(){
        System.out.println("""
                1: Addition
                2: Substraction
                3: minus
                4: division                   5: menu
                """);
        System.out.println("pick an option to proceed");
        calculator();
    }

    public static void calculator(){
        System.out.println("calculator");
        int calculator = input.nextInt();
        switch (calculator) {
            case 1 -> {
                System.out.println(10 + 10);
                System.out.println("1: back              2: menu");
                int add = input.nextInt();
                switch (add) {
                    case 1 ->showCalculator();
                    case 2 -> MenuBar.showMenuBar();
                }
            }
            case 2 -> {
                System.out.println(20 - 10);
                System.out.println(" 1: back                2: menu");
                int subs = input.nextInt();
                switch (subs) {
                    case 1 ->showCalculator();
                    case 2 -> MenuBar.showMenuBar();
                }
            }
            case 3 -> {
                System.out.println(32 * 10);
                System.out.println("1: back                 2: menu");
                int time = input.nextInt();
                switch (time) {
                    case 1 -> showCalculator();
                    case 2 -> MenuBar.showMenuBar();
                }
            }
            case 4 -> {
                System.out.println(22 / 10);
                System.out.println("1: back               2: menu");
                int divide = input.nextInt();
                switch (divide) {
                    case 1 -> Calculator.showCalculator();
                    case 2 -> MenuBar.showMenuBar();
                }
            }
            case 5->MenuBar.showMenuBar();

        }
    }

}
