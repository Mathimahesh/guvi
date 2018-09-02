public class Palindrome {

	public static void main(String[] args) {
		int n,m,temp,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
		temp=n;
		while(n>0) {
			m=n%10;
			sum=(sum*10)+m;
			n=n/10;
		}
		if (temp==sum) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
