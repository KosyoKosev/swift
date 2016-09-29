
import java.util.Scanner;


public class Task3b_PrintZFigure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for(int row = 0;row <n;row++ ){
            for(int col = 0;col < n;col++){
                if (row == 0){
                    System.out.print("*");
                }else if (row == n - 1 ){
                    System.out.print("*");
                }else if (n - row - 1 == col){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }    
        
       
    }
                                         // Ползвах помощ!
}
