import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        String str = "first.second";
        String result = "";
        int count = 0, index = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '.'){
                count++;
                index = i+2;
            }
        }
        if(index < str.length()){
            count++;
        }
        System.out.println(count);
    }
}
