package Set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ProgramExer {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();
        
        System.out.print("How many students dor course A?");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int number = sc.nextInt();
            a.add(number);
        }
        
        System.out.print("How many students dor course B?");
        int d = sc.nextInt();
        for(int i = 0; i < d; i++){
            int number = sc.nextInt();
            b.add(number);
        }
        
        System.out.print("How many students dor course C");
        int z = sc.nextInt();
        for(int i = 0; i < z; i++){
            int number = sc.nextInt();
            c.add(number);
        }
        
        Set<Integer> set = new HashSet(a);
        set.addAll(b);
        set.addAll(c);
        
        System.out.println("Total students: " + set.size());
    }
}
