package BankAccount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    Account davidAccount = new Account();

    @Test
    public void depositAmountTest() {
        //given
        davidAccount.deposit(2_000);

        //assert
        double balance = davidAccount.getbalance();
        assertEquals(2_000, balance);

    }

    @Test
    public void depositAmountTest1() {
        //given
        davidAccount.deposit(2_000);
        //when
        davidAccount.deposit(2_000);
        //assert
        double balance = davidAccount.getbalance();
        assertEquals(4_000, balance);
    }

    @Test
    public void depositNegativeTest2() {
        davidAccount.deposit(-2000);
        assertEquals(0, davidAccount.getbalance());


    }

    @Test
    public void depositNegativeTest() {
        davidAccount.deposit(-4000);
        assertEquals(0, davidAccount.getbalance());
    }

    @Test
    public void withdrawalCashTest() {
        davidAccount.deposit(5000);
        davidAccount.withdraw(3000);


        assertEquals(2000, davidAccount.getbalance());

    }

    @Test
    public void withdrawAboveBalance() {
        davidAccount.deposit(5000);
        davidAccount.withdraw(6000);
        assertEquals(5000, davidAccount.getbalance());
    }

    @Test
    public void withdrawNegativeAmount() {
        davidAccount.deposit(5000);
        davidAccount.withdraw(-5000);
        assertEquals(5000, davidAccount.getbalance());
    }

}
