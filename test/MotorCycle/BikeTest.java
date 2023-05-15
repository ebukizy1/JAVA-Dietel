package MotorCycle;

import jdk.jfr.Name;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BikeTest {
    Bike bike;

    @BeforeEach
    void setUp() {
        bike = new Bike();
    }

    @Test
    public void turnBikeOnTest() {
        bike.isOn();
        assertTrue(bike.turnOn());
    }

    @Test
    public void turnBikeOffTest() {
        bike.isOn();
        bike.isOff();
        assertFalse(bike.turnOn());
    }

    @Test
    public void accelerateBikeBy1Test() {
        bike.accelerate(1);
        assertEquals(2, bike.getSpeed());
    }

    @Test
    @Name("accelerate bike by -1")
    public void accelerateBikeByNegative1Test() {
        bike.accelerate(-1);
        assertEquals(2, bike.getSpeed());
    }


}