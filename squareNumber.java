import java.util.*;
public class SplitExample{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int f,sum=0;
    int n = sc.nextInt();
    while(n>0){
        f = n%10;
        n = n/10;
        sum = sum+(f*f);
    }
    System.out.println(sum);
}
}
