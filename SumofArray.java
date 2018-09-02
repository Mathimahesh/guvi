public class SumofArray {

	public static void main(String[] args)
	{
		int n=0,sum=0;
		int a[]=new int[n];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the N number");
		 n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println(i);
		}
		System.out.println("Enter the sum of elements");
		int m=sc.nextInt();
		for(int i=1;i<=m;i++) {
			sum=sum+i;
		}
		System.out.println(sum);
	}
	

}
