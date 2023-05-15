package myExamplesTutorial;

public class StarLoops {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }

        int p = 5;
        for (int i = 1; i <= p; i++) {
            for (int j = i; j <= p; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }


    }
}
