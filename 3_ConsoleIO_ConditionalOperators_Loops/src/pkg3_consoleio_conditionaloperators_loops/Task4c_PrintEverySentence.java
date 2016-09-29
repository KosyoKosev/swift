
import java.util.Scanner;


public class Task4c_PrintEverySentence {
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       
       String text = sc.nextLine();
       
       for (char c :text.toCharArray() ){
           switch (c){
               case '.':
               case '?':
               case '!':
           
             System.out.println();
             break;
           }
         System.out.print(c);
       }
      System.out.println();
    }
    
}
//