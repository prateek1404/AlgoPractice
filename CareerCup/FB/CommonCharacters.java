public class CommonCharacters
{
	public static void main(String args[])
	{
		System.out.println(common(args));

	}

	public static int common(String args[])
	{
		boolean isPresent[]= new boolean[26];
		for(int i=0;i<isPresent.length;i++)
		{
			isPresent[i]=true;
		}
		for(int i=0;i<26;i++)
		{
			for(String s:args)
			{
				if(s.indexOf((char)('a'+i))==-1)
				{
					isPresent[i]=false;		
				}
			}
		}	
		int count=0;
		for(int i=0;i<isPresent.length;i++)
		{
			if(isPresent[i])
			{
				count++;
				System.out.println((char)('a'+i));
			}
		}
		return count;
	
		


	}


}
