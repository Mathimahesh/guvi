public class OddBetweenIntervals {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two intervals ");
		int m=sc.nextInt();
		int n=sc.nextInt();
		for(int i=m;i<n;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
	}

}
