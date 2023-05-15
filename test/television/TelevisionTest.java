package television;

import jdk.jfr.Name;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelevisionTest {
    Television lg;

    @BeforeEach
    void setUp() {
        lg = new Television();
    }

    @Test
    public void turnOnTelevisionTest() {
        assertFalse(lg.isOn());
        lg.toggleOn();
        assertTrue(lg.isOn());
    }

    @Test
    public void turnOffTelevisionTest() {
        lg.toggleOn();
        assertTrue(lg.isOn());
        lg.toggleOn();
        assertFalse(lg.isOn());
    }

    @Test
    public void increaseVolumeTest() {
        lg.toggleOn();
        assertTrue(lg.isOn());
        for (int count = 1; count < 6; count++) {
            lg.increaseVolume();
        }
        assertEquals(5, lg.getVolume());
    }

    @Test
    @Name("Increase TV volume when Tv is on 5 to 20")
    public void increaseVolumeFrom5To20Test() {
        lg.toggleOn();
        assertTrue(lg.isOn());
        for (int count = 1; count < 6; count++) {
            lg.increaseVolume();
        }
        assertEquals(5, lg.getVolume());
        for (int count = 5; count < 20; count++) {
            lg.increaseVolume();
        }
        assertEquals(20, lg.getVolume());
    }

    @Test
    @Name("reduce TV volume when Tv is 20 to 10")
    public void decreaseVolumeFrom20to10() {
        lg.toggleOn();
        assertTrue(lg.isOn());
        for (int count = 0; count < 20; count++) {
            lg.increaseVolume();
        }
        assertEquals(20, lg.getVolume());
        int count = 20;
        while (count > 10) {
            lg.decreaseVolume();
            count--;
        }
        assertEquals(10, lg.getVolume());
    }

    @Test
    public void setTelevisionChannel() {
        lg.toggleOn();
        assertTrue(lg.isOn());
        for (int count = 0; count < 10; count++) {
            lg.setChannel();
        }
        assertEquals(10, lg.channel());
    }

    @Test
    public void reduceVolumeToZero() {
        lg.toggleOn();
        lg.increaseVolume();
        assertEquals(2, lg.getVolume());
        lg.decreaseVolume();
        lg.decreaseVolume();
        assertEquals(0, lg.getVolume());
    }

    @Test
    public void increaseVolumeWhileTvIsOff() {
        lg.increaseVolume();
        assertEquals(0, lg.getVolume());
        lg.toggleOn();
        lg.increaseVolume();
        assertEquals(1, lg.getVolume());
    }

    @Test
    public void ChangeTvChannelMode() {
        lg.toggleOn();
        assertTrue(lg.isOn());
        assertEquals("USB MODE", lg.tvMode(2));

    }

}











