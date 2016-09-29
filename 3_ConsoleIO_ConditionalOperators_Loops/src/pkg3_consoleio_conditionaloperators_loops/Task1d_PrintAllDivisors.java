
import java.util.Scanner;


public class Task1d_PrintAllDivisors {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter a number");
        
        int number = sc.nextInt();
        
        for (int i =1;i<=number;i++){
           if(number % i != 0){
               continue;
               } 
           System.out.print(i+" ");
        }
    }
    
}
