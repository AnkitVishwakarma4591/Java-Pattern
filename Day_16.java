/*
       * 
     *    *
   *        *
 *            *
   *        *
     *    *
       *
 */

public class Day_16 {
    public static void main(String[] args){
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--){
                if(i == j){
                System.out.print(" * ");
                }else{
                    System.out.print("  ");
                }
            }
            for(int j=2;j<=i;j++){
                if(i != j){
                System.out.print("  ");
                }
                else{
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }

        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--){
                if(i == j){
                System.out.print(" * ");
                }else{
                    System.out.print("  ");
                }
            }
            for(int j=2;j<=i;j++){
                if(i != j){
                System.out.print("  ");
                }
                else{
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }
}
