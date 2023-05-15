package DanielyangAssessment;

public class TriangleLoops {
    public static void main(String[] args) {
        int n = 10;
//        for(int i = 0 ; i < n; i++ ){
//            for(int j = 0; j < i; j++){
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
//        for( int k = 0 ; k <n; k++){
//            for (int p = k; p<n ; p++){
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
//       for( int r = 0; r < n; r++) {
//           for ( int x = 0; x < n ; x++){
//               for( )

        for (int i = 0; i < n; i++)
            for (int c = 0; c < n; c++) {
                System.out.print("     ");
                for (int b = c; c < n; b++) {
                    System.out.print("*");
                }
                System.out.println();
            }



    }
}



