import java.util.*;
public class pattern4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no =");
        int n= sc.nextInt();

        // outer loop
        for(int i=1;i<=n;i++){
            // inner loop
            for(int j=1;j<=i;j++){
                int sum = i+j;
                if(sum%2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println(" ");
        }
    }
    
}
