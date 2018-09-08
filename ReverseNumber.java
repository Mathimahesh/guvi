public class ReverseNumber {

	public static void main(String[] args) {
		int m,reverse=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  reverse number");
		int num=sc.nextInt();
		while(num!=0) {
			m=num%10;
			reverse=reverse*10+m;
			num=num/10;
		}
			System.out.println(reverse);
			
		}
	}
