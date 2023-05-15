package chapter7;

public class Output {
    public static void main(String[] args) {

//        int x = 30;
//        int[] numbers = new int[x];
//        x = 60;
//        System.out.println("x is " + x);
//        System.out.println("The size of numbers is " + numbers.length);

                int list[] = {1, 2, 3, 4, 5, 6};
        for (int i = 1; i < list.length; i++)
            list[i] = list[i - 1];
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}
