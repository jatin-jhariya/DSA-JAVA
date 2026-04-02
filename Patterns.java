public class Patterns {
    public static void main(String args[]) {

        // Q1. print the pattern(solid rectangle)
        // outer loop

        /*
         * int m=5,n=4;
         * for(int i=1;i<=n;i++){
         * // inner loop
         * for(int j=1;j<=m;j++){
         * System.out.print("*");
         * }
         * System.out.print("\n");
         * }
         */

        // Q2. print the pattern(hollow rectangle)
        /*
         * for (int i = 1; i <= 4; i++) {
         * for (int j = 1; j <= 5; j++) {
         * if (i == 1 || j == 1 || i == 4 || j == 5) {
         * System.out.print("*");
         * } else {
         * System.out.print(" ");
         * }
         * }
         * System.out.println();
         * }
         */

        // Q3.print the pattern(half pyramid)
        /*
         * for(int i=1;i<=4;i++){
         * for(int j=1;j<=i;j++){
         * System.out.print("*");
         * }
         * System.out.println();
         * }
         */

        // Q4. inverted half pyramid
        /*
         * int n=4;
         * for(int i=n;i>=1;i--){
         * for(int j=1;j<=i;j++){
         * System.out.print("*");
         * }
         * System.out.println();
         * }
         */

        // Q5. inverted half pyramid(rotated by 180 degree)
        /*
         * int n=4;
         * // outer loop
         * for(int i=1;i<=n;i++){
         * // inner loop -> space print
         * for(int j=1;j<=n-i;j++){
         * System.out.print(" ");
         * }
         * 
         * // inner loop -> star print
         * for(int j=1;j<=i;j++){
         * System.out.print("*");
         * }
         * System.out.println();
         * }
         */

        //Q6. half pyramid with numbers 
        /* int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        } */

        //Q7. inverted half pyramid with numbers 
        /* int n=5;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        } */

        //Q8. print the pattern(floyd's triangle)
        /* int n=5,num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        } */

        // print the pattern (0-1 triangle)
        int n=5;
        // outer loop
        for(int i=1;i<=n;i++){
            // inner loop
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){ // even
                    System.out.print("1");
                } else{ // odd
                    System.out.print("0");
                }   
            }
            System.out.println();
        }
    }
}
