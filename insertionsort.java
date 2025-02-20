public class insertionsort {

	public static void main(String[] args) {
		int a[]= {7,4,8,3,9,2};
		int temp=0;
		int n=a.length;
		for(int i=1;i<n;i++) {
			temp=a[i];
			int j=i-1;
			while(j>=0 && a[j]>temp) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
		}
		for(int m:a) {
			System.out.print(m);
		}

	}

}

    

