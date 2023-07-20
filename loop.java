import java.util.*;
public class loop {
     public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nth value = ");
        int n= sc.nextInt();
        int sum =0;
        for(int i=1;i<=n;i++){
            sum = sum + i;
        }
        System.out.println("This is your sum ="+sum);
    }
    
}
