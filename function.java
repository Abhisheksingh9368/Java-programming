import java.util.*;
public class function {
    
    public static int CalculateSum(int a, int b){
        int sum = a+b;
        return sum;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre the value of A=");
        int a=sc.nextInt();
        System.out.print("Entre the value of B=");
        int b=sc.nextInt();
        int sum= CalculateSum(a, b);
        System.out.println( "Your sum is ="+sum);
    }

}
