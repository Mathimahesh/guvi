import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tempNum=n;
        int flag=0;
    while(tempNum!=1)
    {
        if(tempNum%2!=0){
            flag=1;
            break;
        }
        tempNum=tempNum/2;
    }
  
    if(flag==0)
        System.out.println("yes");
    else
        System.out.println("no");
    }
}
