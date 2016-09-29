
import java.util.Scanner;


public class Task2c_PrintOnlyEvenNumbers {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
       
        for(int i = 1;i <= n;i++){
            int m = sc.nextInt();
            int number = m;
           if  (number %2 != 0){
                  continue;
           }
           System.out.print(number + " ");
        }
        System.out.println();
    }
}
