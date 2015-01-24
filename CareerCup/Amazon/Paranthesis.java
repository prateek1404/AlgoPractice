import java.util.ArrayDeque;
public class Paranthesis
{
	public static void main(String args[])
	{
	System.out.println(isBalanced(args[0]));		

	}
	public static boolean isBalanced(String s)
	{
		char ar[] = s.toCharArray();
		ArrayDeque<Character> stack = new ArrayDeque<Character>();
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]=='{'||ar[i]=='('||ar[i]=='[')
			{
				stack.push(ar[i]);
			}
			else
			{
				if(stack.peek()=='{'&& ar[i]=='}')
				{
					stack.pop();
				}
				else if(stack.peek()=='(' && ar[i]==')')
				{
					stack.pop();
				}
				else if(stack.peek()=='[' && ar[i]==']')
				{
					stack.pop();
				}
				else
				{
					return false;
				}
			}
		}
		if(stack.size()==0)
		{
			return true;
		}
		else
		{
			return false;
		}

	}


}
