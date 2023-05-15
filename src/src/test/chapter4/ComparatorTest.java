package src.test.chapter4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ComparatorTest {
    Comparator comparator;

    @BeforeEach
    void setUp() {
        comparator = new Comparator();
    }

    @Test
    public void checkIntegers() {
        assertEquals(1, comparator.checkIntegers(34, 22));
    }

    @Test
    public void secondNumberGreaterThanFirstNumber() {
        assertEquals(-1, comparator.checkIntegers(2, 22));
    }

    @Test
    public void CheckIfUserInputNegativeNumbers() {
        assertEquals(1, comparator.checkIntegers(-20, -22));
    }


}