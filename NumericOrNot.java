public class NumericOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input");
		String s=sc.next();
		try {
			Integer.parseInt(s);
			System.out.println("Yes");
		}
		catch(NumberFormatException e) {
			System.out.println("No");
			
		}
	}

}
