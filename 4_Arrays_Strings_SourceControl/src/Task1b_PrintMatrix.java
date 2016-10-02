
import java.util.Scanner;

public class Task1b_PrintMatrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] arr = new int[n][n];
        int count = 1;

        
        for (int col = 0; col < n; col ++) {
            for (int row = 0; row < n; row+=2) {
                arr[row][col] = count;
              count++;
            }
            for(int row = n-1; row >= 0;row--){
                arr[row][col]= count;
                count++;
            }
        }    
       
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(arr[row][col] + " ");
            }
        }
        System.out.println();
    }
}
