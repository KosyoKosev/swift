
import java.util.Scanner;


public class Task1f_ToBinaryAndHexa {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        int number = sc.nextInt();
        int newNumber = number;
        int binaryNumber = 0;
        while(number>0){
            binaryNumber *= 10;
             binaryNumber = number % 2;
            number /=2;
            
        }
        System.out.print(binaryNumber);
        System.out.println();
        System.out.printf("%x%n",newNumber);
        
             
    }
}
