public class MathPower {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base and Exponent");
		int base=sc.nextInt();
		int Exponent=sc.nextInt();
		double result=Math.pow(base,Exponent);
		System.out.println(Math.round(result));
	}

}
