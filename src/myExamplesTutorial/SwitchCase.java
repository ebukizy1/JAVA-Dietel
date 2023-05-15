package myExamplesTutorial;

public class SwitchCase {
    public static void main(String[] args) {


        printDayOfTheWeek(-1);
        printDayOfTheWeek(0);
        printDayOfTheWeek(-2);
        printDayOfTheWeek(7);


    }

    private static void printDayOfTheWeek(int day) {
        if (day == 0) {
//            System.out.println("Sunday");
//        } else if (day == 1) {
//            System.out.println("Monday");
//        } else if (day == 2) {
//            System.out.println("Tuesday");
//        } else if (day == 3) {
//            System.out.println("Wednesday");
//        } else if (day == 4) {
//            System.out.println("thursday");
//        } else if (day == 5) {
//            System.out.println("friday");
//        } else if (day == 6) {
//            System.out.println("saturday");
//        } else {
//            System.out.println("invlid input");
//        }

            switch (day) {
                case 0:
                    System.out.println("Sunday");
                    break;
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                case 6:
                    System.out.println("Saturday");
                default:
                    System.out.println("invalid day");
                    break;
            }


        }
    }
}