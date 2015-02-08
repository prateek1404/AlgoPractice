import java.util.ArrayDeque;
public class Matching
{
	public static void main(String args[])
	{
		System.out.println(matching(args[0]));
	}
	
	public static boolean matching(String word)
	{
		ArrayDeque<Character> stack = new ArrayDeque<Character>();
		for(int i=0;i<word.length();i++)
		{
			if(word.charAt(i)=='(')
			{
				stack.push(word.charAt(i));
			}
			else if(word.charAt(i)==')')
			{
				if(stack.peek()!=null && stack.peek()=='(')
				{
					stack.pop();
				}
				else
				{
					return false;
				}
			}

		}

		return stack.size()==0;

	}

}
