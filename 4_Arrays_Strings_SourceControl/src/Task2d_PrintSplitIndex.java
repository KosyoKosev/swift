
import java.util.Scanner;


public class Task2d_PrintSplitIndex {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        int leftSum = 0;
        
        
        for(int i = 0; i < n;i++){
            leftSum += arr[i];
            sum -= arr[i];
            if(leftSum == sum){
                System.out.println(i);
            }
        
            
        }
        
    }
    
}
