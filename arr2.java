package sem5;
import java.util.*;
public class arr2 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.print("Enter the elements of array: \n");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the index value: ");
		int m=sc.nextInt();
		int temp=0;
		for(int i=0;i<m;i++) 
		{
			temp=a[0];
			for(int j=1;j<n;j++)
			{
				a[j-1]=a[j];
			}
			
			a[n-1]=temp;
		}
		System.out.print("Array is: ");
		for(int i=0;i<n;i++) 
		{
			System.out.print(a[i]+" ");
		}
	}

}
