import java.util.*;
public class table {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the table number you want =");
        int n=sc.nextInt();
        for(int i=1;i<11;i++){
            System.out.println(n*i);
        }
    }
    
}
