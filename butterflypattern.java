import java.util.*;
public class butterflypattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of row =");
        int n= sc.nextInt();

        // upper part
        for(int i=1;i<=n;i++){
            // 1st part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // space
            int Space=2*(n-i);
            for(int j=1;j<=Space;j++){
                System.out.print(" ");
            }
            // 2nd part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // lower part
        for(int i=n;i>=1;i--){
            // 1st part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // space
            int Space=2*(n-i);
            for(int j=1;j<=Space;j++){
                System.out.print(" ");
            }
            // 2nd part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
