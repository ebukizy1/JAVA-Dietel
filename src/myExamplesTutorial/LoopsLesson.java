package myExamplesTutorial;

public class LoopsLesson {
    public static void main(String[] args) {

        int count = 0;
        for(int i = 2; i < 50; i++){
            if(isPrime(i)){
                count++;
                System.out.println("Number " + i + " is a prime Number");
                if (count == 10){
                    System.out.println("existing for loops " );
                    break;
                }
            }
        }



         System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
         System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0, 3.0));
         System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0, 4.0));
         System.out.println("10,000 at 5% interest = " + calculateInterest(10000.0, 5.0));
         System.out.println("10,000 at 6% interest = " + calculateInterest(10000.0, 6.0));
         System.out.println("10,000 at 7% interest = " + calculateInterest(10000.0, 7.0));
         System.out.println("10,000 at 8% interest = " + calculateInterest(10000.0, 8.0));
        for (int i = 8; i>=2; i--){
            System.out.println("10,000 at 2% interest = " +  String.format("%.2f", calculateInterest(10000.0, i)));
        }
        System.out.println("************************");



        for (int i = 2; i < 9; i++) {
            System.out.println("10,000 at 2% interest = " +  String.format("%.2f", calculateInterest(10000.0, i)));
        }
    }




    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static double calculateInterest( double amount, double interestRate){
        return (amount*(interestRate/100));

    }

}





