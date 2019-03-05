import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int rem=0,count=0;
        while(x>0){
            rem = x%10;
            count++;
            x = x/10;
        }
        System.out.println(count);
    }
}
