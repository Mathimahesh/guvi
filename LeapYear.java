public class LeapYear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year");
		int n=sc.nextInt();
		if(n%4==0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
