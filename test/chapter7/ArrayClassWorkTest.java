package chapter7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayClassWorkTest {

    ArrayClassWork test = new ArrayClassWork();
    int[] myNewArrays = new int[10];

    @BeforeEach
    @Test
    public void testMyArrays() {
        int[] myNumber = test.checkArrays(myNewArrays);
        for (int index = 0; index < myNumber.length; index++) {
            assertEquals(index + 1, myNumber[index]);
        }
    }
}