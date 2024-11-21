// Diamond Pattern
/*
        * 
      * * * 
    * * * * * 
  * * * * * * * 
* * * * * * * * * 
* * * * * * * * * 
  * * * * * * * 
    * * * * * 
      * * * 
        * 
 */
public class Day_14 {
    public static void main(String[] args){
        int n=5;
        for(int i=1;i<=n;i++){
            // Space
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            // Star
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            // Star
            for(int j=2;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            // Space
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            // Star
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            // Star
            for(int j=2;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
