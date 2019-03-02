import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int index = -1;
        a:
        for(int i=0;i<a.length-1;i++){
            System.out.print("i"+i+" ");
            for(int j=i+1;j<a.length;j++){
                System.out.print("j"+j+" ");
                if(a[i]==a[j]){
                    index = a[i];
                    break a;
                }
            }
        }
        System.out.println(index);
    }
}
