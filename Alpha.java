public class Alpha {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character");
		char ch=sc.next().charAt(0);
		if((ch>='A'&& ch<='Z') ||(ch>='a'&& ch<='z')) {
			System.out.println("Alphabet");
		}
		else {
			System.out.println("No");
		}
	}

}
