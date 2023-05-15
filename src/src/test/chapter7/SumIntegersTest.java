package src.test.chapter7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumIntegersTest {
    SumInteger sum;

    @BeforeEach
    void setUp() {
        sum = new SumInteger();
    }

    @Test
    public void calculateSumOfIntegers() {
        assertEquals(268, sum.calculateTotalGrade(265));
    }
}