package DanielyangAssessment;

public class LoopsComparison {
    public static void main(String[] args) {

        System.out.println("             Chukwuma emmanuel ");

         System.out.print("       ");
        for( int i = 1; i<= 9; i++)
            System.out.print("   " + i );
            System.out.println("\n___________________________________");

            for(int j = 1; j <= 9; j++ ) {
                System.out.print(j + " | ");
                for(int i= 1; i <= 9; i++){
                    System.out.printf("%4d", j * i);
                }
                System.out.println();
            }









    }
    }











