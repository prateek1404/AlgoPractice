import java.util.HashMap;
public class NonDuplicate
{
	public static void main(String args[])
	{
		String input = args[0];
		nonDupChar(input);	
	}
	public static void nonDupChar(String input)
	{
	HashMap<Character,Integer> h = new HashMap<Character,Integer>();
	for(int i =0 ; i<input.length();i++)
	{
		if(!h.containsKey(input.charAt(i)))
		{
			h.put(input.charAt(i),1);
		}
		else
		{
			h.put(input.charAt(i),h.get(input.charAt(i))+1);
		}

	}
	for(int i = 0; i< input.length();i++)
	{
		if(h.get(input.charAt(i))==1)
		{
			System.out.println(input.charAt(i));
			break;
		}
	}


	}


}
