package chapter3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    Car car;

    @BeforeEach
    void setup() {
        car = new Car("Ranger rover", "2019", 1_000_000);
    }

    @Test
    public void setCarModelTest() {
        car.setModel("Range rover");
        assertEquals("Range rover", car.getModel());
    }

    @Test
    public void setTheYearOfCarTest() {
        car.setYear("2019");
        assertEquals("2019", car.getYear());
    }

    @Test
    public void getPriceOfCarTest() {
        car.setPrice(1_000_000);
        assertEquals(1_000_000, car.getPrice());
    }

    @Test
    public void doNotSetNegativePrice() {
        car.setPrice(1_000_000);
        car.setPrice(-1_000_000);
        assertEquals(1_000_000, car.getPrice());
    }

    @Test
    public void getDiscountOfCarTest() {
        car.setPrice(1_000_000);
        //car.discount1();
        assertEquals(50_000, car.getDiscount());
    }

    public void getDiscountOfCar2Test() {
        car.discount2();
    }
}