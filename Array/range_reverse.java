import java.util.Scanner;

public class range_reverse {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		reverse(arr,m,n);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void reverse(int a[],int m,int n)
	{
		int t;
		for(int i=m,j=n;i<j;i++,j--)
		{
			t=a[i];
			a[i]=a[j];
			a[j]=t;
		}
	}
}
