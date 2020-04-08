package sem4;
import java.util.*;
public class StringReversal 
{
	public static void main(String args[])
	{
		String s="Khushi Singla";
		String rev=" ";
		int len=s.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("Reversing of letters is: "+rev);
		
		System.out.print("Reversal of words: ");
		String arr[]=s.split(" ");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
