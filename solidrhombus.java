import java.util.*;
public class solidrhombus {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of row =");
        int n= sc.nextInt();
        System.out.print("Entre how many stars you want =");
        int m= sc.nextInt();

        // outer loop
        for(int i=1;i<=n;i++){
            // inner loop
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // stars
            for(int j=1;j<=m;j++){
                System.out.print("*");
            }
            System.out.println( );
        }
    }
    
}
