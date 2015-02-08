public class IsNumber
{
	public static void main(String args[])
	{
			System.out.println(isNumber(args[0]));
	}
	
	public static boolean isNumber(String word)
	{
		if(word.charAt(0)!='-' && !isDigit(word.charAt(0)))
		{
			System.out.println("setp 1");
			return false;
		}
		boolean decimalSeen = false;
		for(int i=1;i<word.length()-1;i++)
		{
			if(word.charAt(i)=='.')
			{
				if(i==1 && word.charAt(0)=='-')
				{
					return false;
				}
				else
				{
					if(decimalSeen)
					{
						return false;
					}
					decimalSeen =true;
				}
			}
			else
			{
				if(!isDigit(word.charAt(i)))
				{
					return false;
				}

			}
				
		}
		if(!isDigit(word.charAt(word.length()-1)))
		{
			return false;
		}
		
		return true;

	}
	
	public static boolean isDigit(char ch)
	{
		if(ch>='0' && ch<='9')
		{
			return true;
		}
		return false;

	}


}
