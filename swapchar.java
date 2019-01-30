import java.util.*;
public class MyClass {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       String str = sc.next();
       char temp;
       char str1[] = str.toCharArray();
       for(int i=0;i<str1.length;i=i+2){
           temp = str1[i];
           str1[i] = str1[i+1];
           str1[i+1] = temp;
       }
       System.out.println(str1);
    }
}
