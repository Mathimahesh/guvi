public class Multiple {

	public static void main(String[] args)
	{
		int m=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			m=i*n;
			System.out.println(m);
		}
		
	}

}
