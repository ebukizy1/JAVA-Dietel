package chapter7;

public class IniArray {
    public static void main(String[] args) {
      final int arrayNumber = 10;

        int [] num = new int [arrayNumber];
        int counter;
        for(counter = 0; counter <num.length; counter++){
            num[counter] = 2 +2 * counter;
        }
        System.out.printf("%4s%10s%n", "index", "value");

        for(counter = 0; counter< num.length; counter++){
            System.out.printf("%4d%10d%n", counter,num[counter]);
        }
    }
}
