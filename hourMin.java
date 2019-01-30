import java.util.*;
public class MyClass {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int min = sc.nextInt();
       int hour = min/60;
       int min1 = min%60;
       System.out.println(hour+" "+min1);
    }
}
