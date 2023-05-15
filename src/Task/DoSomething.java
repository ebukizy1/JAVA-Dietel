package Task;

public class DoSomething {
    public static void main(String[] args) {

        doSomething(1,3,4,5,6,7,8);
    }






    public static void doSomething(int ... numbers){
        for(int number : numbers){
            System.out.println(number);
        }

    }
}
