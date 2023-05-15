package myExamplesTutorial;

import java.util.Scanner;

public class ClassWork {
    public static Scanner input = new Scanner(System.in);
    private String name;


    public String promptUserName(String name) {
        System.out.println("what is your name");
        //   name = input.nextLine();
        return "hello " + name;

    }


}
