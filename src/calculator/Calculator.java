package calculator;

public class Calculator {

    public int add(int firstNumber, int secondNumber) {
        int result = firstNumber + secondNumber;
        return result;
    }
    public int substraction(int number1, int number2) {int result;
        if (number1 > number2) {result = number1 - number2;}else {result =  number2 - number1;}
        int result1 = result;return result1;
    }
    public int multiply(int number1, int number2) {
        int result = number1 *number2;
        return result;
    }

    public int divide(int number1, int number2) {
        int result = number1/number2;
        int result1 = result;
        return result1;
    }
}