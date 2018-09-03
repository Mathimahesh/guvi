public class Armstrong {

	public static void main(String[] args)
	{
		int sum=0,n=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 3 digit number");
		int num=sc.nextInt();
		int number=num;
			while(num!=0) {
				n=num%10;
				sum=sum+(n*n*n);
				num=num/10;
			}
		if(sum==number) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
	}

}
