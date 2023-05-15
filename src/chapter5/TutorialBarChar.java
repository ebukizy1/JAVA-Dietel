package chapter5;

import java.util.Scanner;

public class TutorialBarChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Barchart barchart = new Barchart();
        int sales1, sales2, sales3, sales4, sales5;
        System.out.println("Enter today sales for store 1");
        sales1 = input.nextInt();
        System.out.println("Enter today sales for store 1");
        sales2 = input.nextInt();
        System.out.println("Enter today sales for store 1");
        sales3 = input.nextInt();
        System.out.println("Enter today sales for store 1");
        sales4 = input.nextInt();
        System.out.println("Enter today sales for store 1");
        sales5 = input.nextInt();
        barchart.setNumberStars(sales1, sales2, sales3, sales4, sales5);
        // barchart.displayNumberOfStars();
    }
}