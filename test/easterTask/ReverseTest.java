package easterTask;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTest {
    Reverse reverse;

    @BeforeEach
    void setUp() {
        reverse = new Reverse();
    }

    @Test
    public void givenIHaveAString() {
        String reverse1 = reverse.reverseSetString("Chukwuma");
        assertEquals("amuwkuhC", reverse1);

    }


}