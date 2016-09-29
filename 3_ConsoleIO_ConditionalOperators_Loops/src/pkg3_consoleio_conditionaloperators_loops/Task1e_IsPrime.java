
import java.util.Scanner;


public class Task1e_IsPrime {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       int number = sc.nextInt();
       
       
       boolean prime = true;
       for (int i = 2; i <= (number/2); i++){
           if (number % i ==0){
              prime = false;
              break;
           }
       } 
       System.out.print(prime);
              
           
       
    }
    
}
