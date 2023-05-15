package chapter7;

public class arrayClass {
    public static void main(String[] args) {

        int[] array = new int[10];
        System.out.println(array);

        array[2] = 20;
        System.out.println();
        System.out.println(toSting(array));
    }

    private static String toSting(int[] arrays) {
        String arrayRepresentation = "[";
        for (int i = 0; i < arrays.length; i++) {
            if (i != arrays.length - 1)
                arrayRepresentation += arrays[i] + " ,";
               else arrayRepresentation += arrays[i];
            }

        arrayRepresentation += "]";
        return arrayRepresentation;
    }
}