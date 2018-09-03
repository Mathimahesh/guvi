public class ArmstrongBetweenIntervals {

	public static void main(String[] args)
	{
		int temp=0,k,l,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two intervals");
		int m=sc.nextInt();
		int n=sc.nextInt();
		for(int i=m+1;i<n;i++) {
			temp=i;
			k=0;
			while(temp!=0) {
				l=temp%10;
				k=k+(l*l*l);
				temp=temp/10;
			}
			if(i==k) {
				if(count==0) {
					System.out.println("Armstrong values are");
				}
				System.out.println(i);
				count++;
			}
			
			
		}
		if(count==0) {
			System.out.println(" ");
			
		}
	
	}

}
