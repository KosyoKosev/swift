
package task1_uniquenumbers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Task1_UniqueNumbers {
    public static void main(String[] args) {
        
        Scanner sc  = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        Set<Integer> numbers = new HashSet();
        for(int i = 0;i < n;i++){
            numbers.add(sc.nextInt());
        }
        System.out.println(numbers);   
    }
}
