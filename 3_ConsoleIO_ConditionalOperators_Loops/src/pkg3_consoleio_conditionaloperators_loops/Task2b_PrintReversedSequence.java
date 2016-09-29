
import java.util.Scanner;


public class Task2b_PrintReversedSequence {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n;i++){
            int m = sc.nextInt();
           arr[i] = m;
        }
        for (int i = n-1;i >= 0;i-- ){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
}
