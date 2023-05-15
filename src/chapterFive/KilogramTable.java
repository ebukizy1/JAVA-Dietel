package chapterFive;

public class KilogramTable {
    public static void main(String[] args) {

        final double POUNDS_PER_KILOGRAM = 2.2;    // Create constant

        // Display header for table
        System.out.println("Kilograms      Pounds");

        // Display table
        for (int i = 1; i <= 10; i += 2) {
            System.out.printf(
                    "%- 15d%6.1f\n", i, (i * POUNDS_PER_KILOGRAM));

        }
    }
}