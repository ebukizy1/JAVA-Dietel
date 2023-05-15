package src.test.chapter7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ReverseArrayChallengeTest {
    ReverseArrayChallenge reverse;
    @BeforeEach
    void setUp() {reverse = new ReverseArrayChallenge();}
    int [] myArray = {10, 20, 30, 40, 50, 60, 70, 80, 90};

    @Test
    public void testArrayReversal(){
        int [] temp = reverse.reversalArrays(myArray);
            assertEquals("[90, 80, 70, 60, 50, 40, 30, 20, 10]", Arrays.toString(temp));

        }

    }
