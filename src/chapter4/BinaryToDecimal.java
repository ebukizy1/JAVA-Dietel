package chapter4;

public class BinaryToDecimal {
    public static void main(String[] args) {
        String userInput = "1111";
        int parseUserInput = Integer.parseInt(userInput);
        int sum = 0;
        for(int index = 0; index < parseUserInput; index++){
            int reminder;
            if(index == 0){
                reminder = parseUserInput % 10;
                sum += reminder * Math.pow(2, index);
            }
            else {
               parseUserInput  = parseUserInput / 10;
                reminder = parseUserInput % 10;
                sum+= reminder * Math.pow(2, index);
            }
        }
        System.out.println(sum);
    }

}
