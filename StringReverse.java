public class StringReverse {

	public static void main(String[] args) {
		String reverse="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.next();
		for(int i=str.length()-1;i>=0;i--) {
			 reverse+=str.charAt(i);
		}
		System.out.println(reverse);
	}

}
