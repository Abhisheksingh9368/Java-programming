import java.util.Scanner;

import java.util.*;
public class floydtriangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows = ");
        int n = sc.nextInt();
        int number = 1;
        for(int i=0;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(number + " ");
                number++;
            }
            System.out.println(" ");

        }
    }
    
}
