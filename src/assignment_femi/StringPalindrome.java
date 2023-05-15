package assignment_femi;

public class StringPalindrome {
    private static int ZERO = 0;

    public boolean reverseString(String word){
        int index;
        String reverse= "";
        int j = 0;
        for(index = word.length()-1; index >= ZERO; index--){
            reverse += word.charAt(index);
        if(word.equalsIgnoreCase(reverse))
            return true;
        }
        return false;
}


}
