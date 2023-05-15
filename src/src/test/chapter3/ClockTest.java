package src.test.chapter3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClockTest {
    Clock clock;

    @BeforeEach
    public void setup() {
        clock = new Clock(22, 50, 59);
    }

    @Test
    public void setClockHourTest() {
        clock.setHour(23);
        assertEquals(23, clock.getHour());
    }

    @Test
    public void hourShouldNotExceedAbove23Test() {
        clock.setHour(25);
        assertEquals(0, clock.getHour());
    }

    @Test
    public void hourShouldNotBeANegativeNumberTest() {
        clock.setHour(-1);
        assertEquals(0, clock.getHour());
    }

    @Test
    public void setClockMinuteTest() {
        clock.setMinute(59);
        assertEquals(59, clock.getMinute());
    }

    @Test
    public void minuteShouldNotExceed60Test() {
        clock.setMinute(60);
        assertEquals(0, clock.getMinute());
    }

    @Test
    public void minuteShouldNotBeANegativeNumberTest() {
        clock.setMinute(-1);
        assertEquals(0, clock.getMinute());
    }

    @Test
    public void setSecondsTest() {
        clock.setSeconds(59);
        assertEquals(59, clock.getSeconds());
    }

    @Test
    public void secondsShouldNotExceed60Test() {
        clock.setSeconds(67);
        assertEquals(0, clock.getSeconds());
    }

    @Test
    public void secondsShouldNotBeANegativeNumberTest() {
        clock.setSeconds(-1);
        assertEquals(0, clock.getSeconds());
    }
}


































