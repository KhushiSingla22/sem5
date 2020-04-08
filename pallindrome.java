package sem4;
import java.util.*;
public class pallindrome 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int rev=0;
		int rem=0;
		System.out.println("Enter the number: ");
		int num= sc.nextInt();
		int num1=0;
		num1=num;
		while(num1 !=0)
		{
			rem=num1%10;
			rev=rev*10+rem;
			num1=num1/10;
		}
		System.out.println("REVERSE IS: "+rev+"");
		if(num == rev )
		{
			System.out.println("It is a pallindrome");
		}
		else
			System.out.println("It is not a pallindrome");
	}

}
