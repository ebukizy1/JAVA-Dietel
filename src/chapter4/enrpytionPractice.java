package chapter4;

public class enrpytionPractice {

    public String encrypt(String data) {
        int count = 0;
        int firstNumber = 0;
        int secondNumber = 0;
        int thirdNumber = 0;
        int fourthNumber = 0;
        while (count < data.length()) {  //data is the parameter we use in storing the value
            char digit = data.charAt(count);   //we want to pick each value entered by the user using the charAt
            int numDigit = Character.getNumericValue(digit);  // since we know that char at has own digit in the accil we need to use the get numeric value
            int result = (numDigit + 7) % 10;
            if (count == 0) {firstNumber = result;}
            if (count == 1) {secondNumber = result;}
            if (count == 2) {thirdNumber = result;}
            if (count == 3) {fourthNumber = result;}
                    count++;
        }
        return thirdNumber + "" + fourthNumber + "" + firstNumber + "" + secondNumber;
    }

    public String decrypted(String data) {
        int count = 0;

        int firstNumber = 0;
        int secondNumber = 0;
        int thirdNumber = 0;
        int fourthNumber = 0;
        while(count < data.length()){
            char digit = data.charAt(count);
            int numDigit = Character.getNumericValue(digit);
            int result = (10 + numDigit - 7)%10;
            if(count == 0){firstNumber = result;}
            if(count == 1){secondNumber = result;}
            if(count == 2){thirdNumber = result;}
            if(count == 3){fourthNumber = result;}
            count++;
        }
        return thirdNumber + "" + fourthNumber +"" +firstNumber+ "" + secondNumber;
    }
}
