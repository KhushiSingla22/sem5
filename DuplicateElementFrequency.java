package sem5;
import java.util.*;
public class DuplicateElementFrequency
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		int fr[]=new int[n];
		int visit=-1;
		System.out.println("Enter the elements of array: ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			int count=1;
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{				
					count++;
					fr[j]=visit;
				}
			}
			if(fr[i] != visit)
			{
				fr[i]=count;
			}
		}
		for(int i=0;i<n;i++)
		{
			if(fr[i] != visit)
			{
				System.out.println(a[i]+" - "+fr[i]);
			}
		}
	}
}
