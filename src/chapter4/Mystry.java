package chapter4;

public class Mystry {
    public static void main(String[] args) {
        int x =  -2;
        int total = 0;
        while(x <= 10){
            int y = x + 2;
            x++;
            total += y;
            //System.out.println(total);
            System.out.printf("y is: %d and total is %d\n ", y , total );

        }
    }
}
