public class Maximum {

	public static void main(String[] args)
	{
		int n=0,max;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the aray size");
		 n=sc.nextInt();
		 int a[]=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++) {
		 a[i]=sc.nextInt();
	}
		max=a[0];
		for(int i=0;i<n;i++) {
			if(max<a[i]) {
				max=a[i];
			}
			
		}
		System.out.println(max);

}
}
