package chapter7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BeginningTaskTest {
        BeginningTask max;
    int[] myNumber = {1, 2, 3, 4, 5, 6, 7, 15 ,10};
    @BeforeEach
    void setUp() {max = new BeginningTask();}
    @Test
    public void testMinimumAndMaximumNumbers(){
        int[] expected = {15, 1};
        int[] result = max.myNumber(myNumber);
        assertEquals(Arrays.toString(expected), Arrays.toString(result));

    }
}