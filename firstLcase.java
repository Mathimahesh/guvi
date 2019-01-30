import java.util.*;
public class SplitExample{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String s1=sc.nextLine();
    String[] words=s1.split("\\s");
    for(String w:words){
    char x =w.charAt(0);
    char y= Character.toUpperCase(x);
    System.out.println(y +""+w.substring(1));

}
}
}
