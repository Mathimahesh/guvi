import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(i==a[i]){
                System.out.print(a[i]+" ");
                count++;
            }
        }
        if(count==0) System.out.println("-1");
    }
        
}
