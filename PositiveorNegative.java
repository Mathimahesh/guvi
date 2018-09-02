public class PositiveorNegative {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		if(n>0) {
			System.out.println("positive");
		}
		else if(n<0) {
			System.out.println("Negative");
		}
		else if(n==0) {
			System.out.println("Zero");
		}
	}

}
