
import java.util.Scanner;


public class Task3a_PrintSquare {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for(int row = 1;row <=n;row++ ){
            for(int col = 1;col <= n;col++){
                if (row == 1){
                    System.out.print("*");                 
                }else if (col == 1){
                    System.out.print("*");
                }else if (row == n){
                    System.out.print("*");
                }else if (col == n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}                                         // Ползвах помощ!
