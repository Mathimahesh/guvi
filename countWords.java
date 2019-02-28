import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split("\\s");
        int count=0;
        for(int i=0;i<words.length;i++){
            if(words[i]!="") count++;
        }
        System.out.println(count);
    }
        
}
