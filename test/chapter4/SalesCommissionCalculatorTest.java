package chapter4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalesCommissionCalculatorTest {
    SalesCommissionCalculator sales;

    @BeforeEach
    void setUp() {
        sales = new SalesCommissionCalculator();
    }

    @Test
    public void checkWeeklyEarningOfSaleRepresentativeTest() {
        assertEquals(290, sales.salesPersonItemSold(100, 100, 100, 100, 100, 100, 100, 100, 100, 100));
    }
}