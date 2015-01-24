public class LongestPalindrome
{
	public static void main(String args[])
	{
		String input = args[0];
		String longest = longestPalindrome(input);
	}
	public static String longestPalindrome(String input)
	{
		boolean dp[][]= new boolean[input.length()][input.length()];
		for(int j=0;j<input.length();j++)
		{
			for(int i=0;i<=j;i++)
			{
				if(i==j)
				{
					dp[i][j]=true;
				}
				else if(j==i+1)
				{
					if(input.charAt(i)==input.charAt(j))
					{
						dp[i][j]=true;
					}

				}
				else
				{
					dp[i][j] = dp[i+1][j-1] & input.charAt(i)==input.charAt(j);
				}
				
				
			}
		}
		return input;
	}

}
