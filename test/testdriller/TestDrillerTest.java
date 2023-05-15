package testdriller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDrillerTest {
    TestDriller book;

    @BeforeEach
    void setup() {
        book = new TestDriller();
    }

    @Test
    public void CheckHowMuchPriceOfBooksCostTest() {
        assertEquals(2000, book.priceOfBooks(1));
    }

    @Test
    public void checkHowMuchIsThreeBooksTest() {
        assertEquals(6000, book.priceOfBooks(3));
    }

    @Test
    public void checkHowMuchIsFourBooksTest() {
        assertEquals(8000, book.priceOfBooks(4));
    }

    @Test
    public void priceOfFiveBooksWithDiscountTest() {
        assertEquals(9000, book.priceOfBooks(5));
    }

    @Test
    public void priceOfSevenBooksWithDiscountTest() {
        assertEquals(12600, book.priceOfBooks(7));
    }

    @Test
    public void priceOfNineBooksWithDiscountTest() {
        assertEquals(16200, book.priceOfBooks(9));
    }

    @Test
    public void priceOfTenBooksWithDiscountTest() {
        assertEquals(16_000, book.priceOfBooks(10));
    }

    @Test
    public void priceOfTwentyBooksWithDiscountTest() {
        assertEquals(32_000, book.priceOfBooks(20));
    }

    @Test
    public void priceOfTwentyFiveBooksWithDiscountTest() {
        assertEquals(40_000, book.priceOfBooks(25));
    }

    @Test
    public void priceOfTwentyNineBooksWithDiscountTest() {
        assertEquals(46_400, book.priceOfBooks(29));
    }

    @Test
    public void priceOfThirtyBooksWithDiscountTest() {
        assertEquals(45_000, book.priceOfBooks(30));
    }

    @Test
    public void priceOfThirtyFiveBooksWithDiscountTest() {
        assertEquals(52_500, book.priceOfBooks(35));
    }

    @Test
    public void priceOfFortyNineBooksWithDiscountTest() {
        assertEquals(73_500, book.priceOfBooks(49));
    }

    @Test
    public void priceOFiftyBooksWithDiscountTest() {
        assertEquals(65_000, book.priceOfBooks(50));
    }

    @Test
    public void priceOfSeventyFiveBooksWithDiscountTest() {
        assertEquals(97_500, book.priceOfBooks(75));
    }

    @Test
    public void priceOfNinetyNineBooksWithDiscountTest() {
        assertEquals(128_700, book.priceOfBooks(99));
    }

    @Test
    public void priceOfHundredBooksWithDiscountTest() {
        assertEquals(120_000, book.priceOfBooks(100));
    }

    @Test
    public void priceOfOneFiftyBooksWithDiscountTest() {
        assertEquals(180_000, book.priceOfBooks(150));
    }

    @Test
    public void priceOneHundredNinetyNineBooksWithDiscountTest() {
        assertEquals(238_800, book.priceOfBooks(199));
    }

    @Test
    public void priceOfTwoHundredBooksWithDiscountTest() {
        assertEquals(220_000, book.priceOfBooks(200));
    }

    @Test
    public void priceOfThreeHundredBooksWithDiscountTest() {
        assertEquals(330_000, book.priceOfBooks(300));
    }

    @Test
    public void priceOfThreeHundredFiftyBooksWithDiscountTest() {
        assertEquals(385_000, book.priceOfBooks(350));
    }

    @Test
    public void priceOfFourHundredBooksWithDiscountTest() {
        assertEquals(440_000, book.priceOfBooks(400));
    }

    @Test
    public void priceOfFourHundredNinetyNineBooksWithDiscountTest() {
        assertEquals(548_900, book.priceOfBooks(499));
    }

    @Test
    public void priceOfFiveHundredBooksWithDiscountTest() {
        assertEquals(500_000, book.priceOfBooks(500));
    }

    @Test
    public void priceOfSixHundredBooksWithDiscountTest() {
        assertEquals(600_000, book.priceOfBooks(600));
    }
}




