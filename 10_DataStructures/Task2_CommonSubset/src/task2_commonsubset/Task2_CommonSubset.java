
package task2_commonsubset;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task2_CommonSubset {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        Set<Integer> setN = new HashSet<>();
        Set<Integer> setM = new HashSet<>();
        
        for(int i = 0;i < n;i++){
          int a =  sc.nextInt();
            setN.add(a);
        }
        
        for(int i = 0;i < m;i++){
            int a = sc.nextInt();
            setM.add(a);
        }
        
       Set<Integer> intersect = new HashSet<>();
       intersect.addAll(setN);
       intersect.retainAll(setM);
       
       System.out.println(intersect);
    }
    
}
