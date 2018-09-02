public class Prime {

	public static void main(String[] args)
	{
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		for(int i=2;i<num;i++) {
		if(num%2==0) {
			count++;
			break;
		}
	}
		if(count==0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

}
}
