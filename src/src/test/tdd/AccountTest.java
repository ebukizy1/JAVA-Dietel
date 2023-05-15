package src.test.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    @Test
    public void depositMoneyTest() {
        // given
        Account ebukaAccount = new Account();
        //When
        ebukaAccount.deposit(2_000);
        //assert
        double balance = ebukaAccount.getBalance();
        assertEquals(2_000, balance);
    }

    @Test
    public void negativeAmountCannotBeDepositedTest() {
        //Given
        Account ebukaAccount = new Account();
        //when
        ebukaAccount.deposit(-2_000);
        //assert
        double balance = ebukaAccount.getBalance();
        assertEquals(0, balance);
    }

    @Test
    public void withdrawMoneyTest() {
        // given
        Account ebukaAccount = new Account();
        //When
        ebukaAccount.deposit(5_000);
        ebukaAccount.withdraw(2_000);
        //assert
        double balance = ebukaAccount.getBalance();
        assertEquals(3_000, balance);
    }

    @Test
    public void zeroWithdrawalTest() {
        //given
        Account ebukaAccount = new Account();
        //when
        ebukaAccount.withdraw(-6000);
        //assert
        double balance = ebukaAccount.getBalance();
        assertEquals(0, balance);
    }

}