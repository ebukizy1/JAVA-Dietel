package chapter7;

import java.util.Scanner;

public class ElectricalMain {
    private  static Scanner input = new Scanner(System.in);
    private static ElectricalList electricalItem = new ElectricalList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstruction();
        while(!quit){
            System.out.println("Enter a choice  ");
            choice = input.nextInt();
            input.nextLine();

            switch(choice){
                case 0:
                    printInstruction();
                    break;
                case 1:
                    electricalItem.printElectricalList();
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit=true;
                    break;

            }
        }

    }
    public static void printInstruction(){
        System.out.println("\npress");
        System.out.println("\t 0 - To print choice options. ");
        System.out.println("\t 1 - To print the list of electrical item, ");
        System.out.println("\t 2 - To add item to the list. ");
        System.out.println("\t 3 - To modify an item in the list. ");
        System.out.println("\t 4 - To remove an item from the list ");
        System.out.println("\t 5 - To search for an item in the list ");
        System.out.println("\t 6 - To quit the application ");
    }

    public static void addItem(){
        System.out.println("please enter the electrical items. ");
        electricalItem.addElectricalItems(input.nextLine());
    }

    public static void modifyItem(){
        System.out.println("Enter item number: ");
        int itemNo = input.nextInt();
        input.nextInt();
        System.out.println("Enter replacement item: ");
        String newItem = input.nextLine();
        electricalItem.modifyElectricalItem(itemNo-1, newItem);
    }
    public static  void removeItem(){
        System.out.println("Enter item number: ");
        int itemNo = input.nextInt();
        input.nextInt();
        electricalItem.removeElectricalItem(itemNo);
    }
    public static void searchForItem(){
        System.out.println("item to search for: ");
        String searchItem = input.nextLine();
        if (electricalItem.findItem(searchItem) != null){
            System.out.println("found " + searchItem + "in our electrical list");
        }else {
            System.out.println(searchItem + "is not in the electrical list");
        }

    }
}
