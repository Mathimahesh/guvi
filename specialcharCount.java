import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int alpha=0,small=0,spechar=0;
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>='A'&& s.charAt(i)<='Z') || (s.charAt(i)>='a'&& s.charAt(i)<='z')) alpha++;
            else if(s.charAt(i)>='0' && s.charAt(i)<='9') small++;
            else spechar++;
        }
        
       System.out.println(spechar); 
        
    }
}
