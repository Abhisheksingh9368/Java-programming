import java.util.*;
public class TwoDArrays {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the how many rows you want =");
        int rows= sc.nextInt();
        System.out.print("Enter the how many cols you want =");
        int cols= sc.nextInt();

        int number[][]=new int [rows] [cols];
        // input
        // rows
        for(int i=0;i<rows;i++){
            // cols
            for(int j=0;j<cols;j++){
                number[i][j]=sc.nextInt();
            }
        }

        System.out.print("Enter the number you found =");
        int x= sc.nextInt();

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(number[i][j]==x){
                System.out.print("X is found at index ("+ i +","+ j +")");
                }
            }
        }
    }
}
