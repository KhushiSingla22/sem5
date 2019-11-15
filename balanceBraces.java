package sem5;
import java.util.*;
public class balanceBraces
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=new String();
		System.out.println("Input");
		s=sc.nextLine();
		if(s.length()==1)
		{
			System.out.println("Not balanced");
		}
		Stack <Character> st=new Stack<Character>();
		for(int i=0;i<s.length();i++)
		{
			char k=s.charAt(i);
			if(k=='{'||k=='('||k=='[')
			{
				st.push(k);
			}
			else if(k=='}' && st.peek()=='{'||k==')' && st.peek()=='(' || k==']' && st.peek() =='[')
			{
				st.pop();
			}
		}
		if(st.empty())
		{
			System.out.println("Output: Balanced");
		}
		else
		{
			System.out.println("Output: Not Balanced");
		}
	}
}
