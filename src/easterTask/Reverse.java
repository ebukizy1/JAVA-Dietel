package easterTask;

public class Reverse {

    public String reverseSetString(String name) {
        String reverse1 = "";
        for (int i = name.length() - 1; i >= 0; i--)
            reverse1 += name.charAt(i);
        return reverse1;
    }
}
