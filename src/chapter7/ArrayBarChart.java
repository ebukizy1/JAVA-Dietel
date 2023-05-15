package chapter7;

public class ArrayBarChart {
    public static void main(String[] args) {
     int [] arr = {0 , 0, 0, 0, 0 ,0, 1, 2, 4, 2 ,1};
     // priint the header
        System.out.println(" Grade distribution ");
        for (int i = 0; i < arr.length; i++){
            if(i == 10){
                System.out.printf("%5d: ", 100);
            }else {
                System.out.printf("%02d-%02d: ",
                        i * 10 , i * 10 + 9);
            }
            for (int star = 0; star < arr[i] ; star++){
                System.out.println("*");
            }
            System.out.println();
        }
    }

}