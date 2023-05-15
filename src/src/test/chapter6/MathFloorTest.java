package src.test.chapter6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MathFloorTest {
        MathFloor floor;
    @BeforeEach
    void setUp() {floor = new MathFloor();}

  @Test
  public void testMathFloor() {
        double result =floor.roundNumber(9.2);
        assertEquals(9.0, result);
    }

}