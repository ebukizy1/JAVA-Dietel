package chapter6;

import java.security.SecureRandom;

public class RandomIntegers {
    public static void main(String[] args) {
        SecureRandom randomNumber = new SecureRandom();

        for (int i =1 ; i <= 30; i++){
            int face = 1 + randomNumber.nextInt(6);
            System.out.printf("%d ", face);
            if(i % 6 == 0)
                System.out.println();
        }


    }





}
