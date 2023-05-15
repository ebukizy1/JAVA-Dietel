package chapter4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaxCalculatorTest {
    TaxCalculator tax;

    @BeforeEach
    void setUp() {
        tax = new TaxCalculator();
    }

    @Test
    public void calculateCitizenTaxTest() {
        tax.citizenSalary(20000);
        assertEquals(3000, tax.citizenSalary(20000));
    }

    @Test
    public void calculateCitizenTaxRateAbove30000Test() {
        assertEquals(6500, tax.citizenSalary(40000));
    }

    @Test
    public void calculateCitizenTaxRateForAllTest() {
        double first = tax.citizenSalary(20_000);
        double second = tax.citizenSalary(40_000);
        double third = tax.citizenSalary(20_000);
        assertEquals(12500, tax.totalTax(first, second, third));
    }

}