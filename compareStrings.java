import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        int n1 = s1.length();
        int n2 = s2.length();
        if(n1>n2) System.out.println(s1);
        else System.out.println(s2);
        
       
    }
}
