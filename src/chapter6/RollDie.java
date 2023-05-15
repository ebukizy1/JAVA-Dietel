package chapter6;

import java.security.SecureRandom;

public class RollDie {
    public static void main(String[] args) {
        SecureRandom randomNumber = new SecureRandom();


        int frequency1 = 0;
        int frequency2 = 0;
        int frequency3 = 0;
        int frequency4 = 0;
        int frequency5 = 0;
        int frequency6 = 0;

        for( int counter = 1; counter <= 60_000_000; counter++){
            int face = 1 +randomNumber.nextInt(6);
            switch (face){
                case 1:
                    ++frequency1;
                    break;
                case 2:
                    ++frequency2;
                    break;
                case 3:
                    ++frequency3;
                    break;
                case 4:
                    ++frequency4;
                    break;
                case 5:
                    ++frequency5;
                    break;
                case 6:
                    ++frequency6;
                    break;
            }
        }
                    System.out.println(" face\tFrequency");
                    System.out.printf("1\t%15d%n2\t%15d%n3\t%15d%n4\t%15d%n5\t%15d%n6\t%15d%n",
                  frequency1, frequency2, frequency3, frequency4, frequency5, frequency6);
    }
}
