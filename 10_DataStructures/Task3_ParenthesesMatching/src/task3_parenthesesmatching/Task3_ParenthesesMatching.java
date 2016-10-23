
package task3_parenthesesmatching;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Task3_ParenthesesMatching {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String text = sc.nextLine();
        Set<Integer> brackets1 = new HashSet<>();
        Set<Integer> brackets2 = new HashSet<>();
        boolean correctBrackets = true;
        
        for(int i = 0;i < text.length();i++){
            char element = text.charAt(i);
            switch (element) {
                case '[':
                    brackets1.add(i);
                    break;
                case '(':
                    brackets1.add(i);
                    break;
                case '{':
                    brackets1.add(i);
                    break;
                case ']':
                    brackets2.add(i);
                    break;
                case ')':
                    brackets2.add(i);
                    break;
                case '}':
                    brackets2.add(i);
                    break;
                default:
                    break;
            }
        }
        if(brackets1.size() != brackets2.size()){
            correctBrackets = false;
        }
        System.out.println(correctBrackets);
    }    
}
