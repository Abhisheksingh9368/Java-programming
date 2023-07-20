import java.util.*;
public class multiple {
    
    public static int product(int a,int b){
        int product=a*b;
        return product;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of A=");
        int a=sc.nextInt();
        System.out.print("Entre the value of B=");
        int b=sc.nextInt();

        System.out.print("Product of A and B is =" + product(a,b));

    }
}
