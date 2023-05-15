package chapter3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class HeartRateTest {

    private HeartRate heartRate;

    @BeforeEach
    void setup() {
        heartRate = new HeartRate("Adeyemi", "Emmanuel", "13 - Apr - 1975");
    }

    @Test
    public void testThatAllArgsConstructorExistInHeartRates() {

        assertNotNull(heartRate);
    }

    @Test
    public void testGetName() {
        String name = heartRate.getFirstName();
        assertEquals("Adeyemi", name);
    }

    @Test
    public void testGetLastName() {
        String name = heartRate.getLastName();
        assertEquals("Emmanuel", name);
    }

    @Test
    public void testDateOfBirth() {
        String name = heartRate.getDateOfBirth();
        assertEquals("13 - Apr - 1975", name);
    }

    @Test
    public void testSetFirstName() {
        heartRate.setFirstName("sultan");
        assertEquals("sultan", heartRate.getFirstName());
    }

    @Test
    public void testSetLastName() {
        heartRate.setLastName("chukwuma");
        assertEquals("chukwuma", heartRate.getLastName());
    }

    @Test
    public void testSetDateOfBirth() {
        heartRate.setDateOfBirth("01 - 12 - 1999");
        assertEquals("01 - 12 - 1999", heartRate.getDateOfBirth());
    }

    @Test
    public void getAgeTest() {
        heartRate.setDateOfBirth("03-Apr-2000");
        assertEquals(23, heartRate.getAge());
    }

    @Test
    public void getMaximumHeartRate() {
        heartRate.setDateOfBirth("19-Apr-2000");
        assertEquals(197, heartRate.getMaximumHeartRate());
    }

    @Test
    public void getTargetHeartRate() {
        heartRate.setDateOfBirth("03-Apr-2000");
        assertEquals("98.5-167.45", heartRate.getTargetHeartRate());
    }

}

