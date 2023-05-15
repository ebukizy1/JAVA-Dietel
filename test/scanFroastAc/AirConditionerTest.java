package scanFroastAc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirConditionerTest {
    AirConditioner lg;

    @BeforeEach
    void setup() {
        lg = new AirConditioner();
    }

    @Test
    public void turnAcOnTheAcTest() {
        assertFalse(lg.isOn());
        lg.toggleOn();
        assertTrue(lg.isOn());
    }

    @Test
    public void turnAcOffTest() {
        lg.toggleOn();
        assertTrue(lg.isOn());
        lg.toggleOn();
        assertFalse(lg.isOn());
    }

    @Test
    public void increaseTemperatureTest() {
        lg.toggleOn();
        assertEquals(16, lg.getTemperature());
        assertTrue(lg.isOn());
        lg.increaseTemperature();
        assertEquals(17, lg.getTemperature());
    }

    @Test
    public void increaseTemperatureTo30() {
        lg.toggleOn();
        assertTrue(lg.isOn());
        int count = 0;
        while (count <= 13) {
            lg.increaseTemperature();
            count++;
        }
        assertEquals(30, lg.getTemperature());
        lg.increaseTemperature();
        assertEquals(30, lg.getTemperature());
    }

    @Test
    public void increaseAcWhileItOffTest() {
        lg.toggleOn();
        assertTrue(lg.isOn());
        lg.toggleOn();
        assertFalse(lg.isOn());
        lg.increaseTemperature();
        assertEquals(16, lg.getTemperature());
        lg.toggleOn();
        assertTrue(lg.isOn());
        lg.increaseTemperature();
        assertEquals(17, lg.getTemperature());

    }

    @Test
    public void decreaseTemperatureTest() {
        lg.toggleOn();
        assertTrue(lg.isOn());
        int count = 0;
        while (count <= 13) {
            lg.increaseTemperature();
            count++;
        }
        assertEquals(30, lg.getTemperature());
        count = 30;
        while (count > 16) {
            lg.decreaseTemperature();
            count--;
        }
        assertEquals(16, lg.getTemperature());
    }
}