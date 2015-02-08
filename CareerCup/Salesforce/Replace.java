public class Replace
{
	public static void main(String args[])
	{
		System.out.println(remove("hello",'l'));
		
	}
	public static String remove(String word, char c)
	{
		StringBuilder sb = new StringBuilder();
		for(char ch:word.toCharArray())
		{
			if(ch!=c)
			{
				sb.append(ch);
			}
		}
		return sb.toString();
	}

}
