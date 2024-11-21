// Butterfly Pattern.
// *                 * 
// * *             * * 
// * * *         * * * 
// * * * *     * * * * 
// * * * * * * * * * * 
// * * * * * * * * * * 
// * * * *     * * * * 
// * * *         * * * 
// * *             * * 
// *                 * 

public class Day_10 {
    public static void main(String[] args){
        int n=5;

        // first part
        for(int i=1;i<=n;i++){
            // star
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            // space
            for(int j=1;j<=2*(n-i);j++){
                System.out.print("  ");
            }
            // star
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        // lower part
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
