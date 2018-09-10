public class SubHour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the hour and minute");
		int hr1=sc.nextInt();
		int min1=sc.nextInt();
		int hr2=sc.nextInt();
		int min2=sc.nextInt();
		int hr=hr1-hr2;
		int min=min1-min2;
		System.out.println(hr+" "+min);
	}

}
