import java.util.*;

public class ifelse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int a = sc.nextInt();
        if(a%2==0){
            System.out.println("This is even number");
        }
        else{
            System.out.println("This is odd number");
        }
    }    
}
