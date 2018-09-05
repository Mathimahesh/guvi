public class SortedArray {

	public static void main(String[] args) {
		int temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
			for(int i=0;i<n;i++) {
				
		for(int j=i+1;j<n;j++) {
			
			if(a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}

		for(int i=0;i<n-1;i++) {
			System.out.println(a[i]);
		}
		System.out.println(a[n-1]);

      }
  }
