package Task;

public class ArrayValuesMain {
    public static void main(String[] args) {
        ArraysValues array = new ArraysValues(50);
        System.out.println("from the main");
        System.out.println(array.getValue());
        modifyObj(array);
        System.out.println(array.getValue());

    }
    public static void modifyObj(ArraysValues arr){
        arr.setValue(405);
    }

}

class ArraysValues {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }




    public ArraysValues(int value) {
        this.value = value;
    }

}
