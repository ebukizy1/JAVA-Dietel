package chapter4;

public class DanglingElse2 {
    public static void main(String[] args) {
        int x = 9;
        int y = 11;
        if (y > 10)
            if (x < 10) {
                System.out.println("*****");
            } else System.out.println("$$$$$");
        if (x < 10) System.out.println("*****");

    }
}
