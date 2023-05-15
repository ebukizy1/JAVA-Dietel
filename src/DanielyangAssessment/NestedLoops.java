package DanielyangAssessment;

public class NestedLoops {
    public static void main(String[] args) {

//            for (int i = 1; i < 5; i++) {
//                int j = 0;
//                while (j < i) {
//                    System.out.print(j + " ");
//                    j++;
//                }
//            }
        int i = 0;
        while (i < 5) {
            for (int j = i; j > 1; j--)
                System.out.print(j + " ");
            System.out.println("****");
            i++;
        }
    }

        }


