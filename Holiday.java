public class Holiday {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the day ");
		String str=sc.next();
		if( str.equals("saturday") || str.equals("sunday")) {
			System.out.println("yes");
		}
		else {
			System.out.println("No");
		}
	}

}
