
import java.util.Scanner;


public class Task2a_PrintSumOfN {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1;i <= n;i++){
           int m = sc.nextInt();
           sum += m;
        }
        System.out.println(sum);
    }
}
