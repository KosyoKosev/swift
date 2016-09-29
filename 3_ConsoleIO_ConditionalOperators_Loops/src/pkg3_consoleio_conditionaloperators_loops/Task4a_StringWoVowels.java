
import java.util.Scanner;


public class Task4a_StringWoVowels {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        
        String text = sc.nextLine();
                
        for (char c:text.toCharArray()){
            switch (c){
                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'i':
                case 'I':
                case 'o':
                case 'O':
                case 'u':
                case 'U':
                  continue;  
            }
         System.out.print(c);
        }
    System.out.println();
    }
                                      
}                                    // Ползвах помощ!
