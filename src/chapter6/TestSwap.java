package chapter6;

public class TestSwap {
    public static void main(String[] args) {
        int number1 = 30;
        int number2  = 65;
        System.out.println("The numbers before swapping " + "number1 "  +  "= "+ number1 +" \n" +
                "number2 " + "= " + number2);
        System.out.println(swapNumbers(678, 419));
    }


public  static String swapNumbers(int number1, int number2){
    int temp = number1;
    number1 = number2;
    number2 = temp;
    return "the value of both numbers after swaping is "+ "number1" + "="+ number1 + " " +"\n"
            + "the value of number2 after swapping is "+ "number2" + "=" + number2;




}

}
