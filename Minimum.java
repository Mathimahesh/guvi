public class Minimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=0,min;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the aray size");
		 n=sc.nextInt();
		 int a[]=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++) {
		 a[i]=sc.nextInt();
	}
		min=a[0];
		for(int i=0;i<n;i++) {
			if(min>a[i]) {
				min=a[i];
			}
			
		}
		System.out.println(min);

	}

}
