package src.test.chapter3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetrolPurchaseTest {
    PetrolPurchase petrol;

    @BeforeEach
    void setUp() {
        petrol = new PetrolPurchase("mobile", "fuel",
                50, 185.5, 25.5);
    }

    @Test
    public void setStationLocation() {
        petrol.setStationLocation("mobile");
        assertEquals("mobile", petrol.getStationLocation());
    }

    @Test
    public void getPriceOfFuel() {
        petrol.setPricePerLiters(185.5);
        assertEquals(185.5, petrol.getPricePerLiters());
    }

    @Test
    public void getPriceOfFuelWithNegativeAmount() {
        petrol.setPricePerLiters(-185.5);
        assertEquals(0, petrol.getPricePerLiters());
    }

    @Test
    public void setPetrolTypeTest() {
        petrol.setPetrolType("fuel");
        assertEquals("fuel", petrol.getPetrolType());
    }

    @Test
    public void setPercentageDiscountTest() {
        petrol.setPercentageDiscount(25.5);
        assertEquals(25.5, petrol.getPercentageDiscount());
    }

    @Test
    public void setNegativePercentageDiscountTest() {
        petrol.setPercentageDiscount(-25.5);
        assertEquals(0, petrol.getPercentageDiscount());
    }

    @Test
    public void setQuantityPurchaseLitersTest() {
        petrol.setQuantityPurchaseLiters(50);
        assertEquals(50, petrol.getQuantityPurchaseLiters());
    }

    @Test
    public void setNegativeQuantityPurchaseLitersTest() {
        petrol.setQuantityPurchaseLiters(-50);
        assertEquals(0, petrol.getQuantityPurchaseLiters());
    }

    @Test
    public void getPurchaseAmountTest() {
        petrol.setQuantityPurchaseLiters(50);
        petrol.setPricePerLiters(185.5);
        petrol.setPercentageDiscount(25);
        assertEquals(9274.0, petrol.getPurchaseAmountTest());
    }


}