package myTutorial;

public class MyTutorial {
    private int total;



    public void drink(String cup, String water){

    }
    public void set(int numOne, int numTwo){
        if (numTwo == numOne) {
            total = numOne + numTwo;
        }else {
            System.out.println("it is not true");
        }
    }
    public int returnTotal(){
    return total;
        }
}
