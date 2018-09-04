public class ArithmeticProgression {

	public static void main(String[] args) {
		int i=0,value=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the N,A,D values");
		int n=sc.nextInt();
		int a=sc.nextInt();
		int d=sc.nextInt();
		 i=(2*a)+((n-1)*d);
		 value=(n*i)/2;
		System.out.println(value);
	}

}
