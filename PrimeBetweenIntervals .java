public class PrimeBetweenIntervals {

	public static void main(String[] args) 
	{
		
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two intervals");
		int m=sc.nextInt();
		int n=sc.nextInt();
		for(int i=m;i<n;i++) {
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					count=0;
					break;
				}
				else {
					count=1;
				}
			}
		if(count==1) {
			System.out.println(i);
		}
	}

}
}
