package src.test.BankAccount;

import calculator.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    void setup() {
        calculator = new Calculator();
    }

    @Test
    public void addCalculatorTest() {
        assertEquals(36, calculator.add(10, 26));
    }

    @Test
    public void substractCalculatorTest() {
        assertEquals(15, calculator.substraction(30, 15));
    }

    @Test
    public void multiplyCalculaorTest() {
        assertEquals(36, calculator.multiply(6, 6));
    }

    @Test
    public void divideCalculatorTest() {
        calculator.divide(37, 5);
        assertEquals(7, calculator.divide(36, 5));

    }
}