
import java.util.Scanner;


public class Task4b_PrintCountOfWords {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String text = sc.nextLine();
        
        String[] words = text.split(" ");
        int w = words.length;
        System.out.println(w);   
    }
}
                                      //  Ползвах помощ!