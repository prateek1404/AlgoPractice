public class LCS
{

	public static void main(String args[])
	{
		int ar[] = new int[args.length];
		lcs(args[0],args[1]);
		
	}
	public static void lcs(String s1,String s2)
	{
		int dp[][] = new int[s1.length()+1][s2.length()+1];
		for(int i=0;i<=s1.length();i++)
		{
			for(int j=0;j<=s2.length();j++)
			{
				if(i==0||j==0)
				{
					dp[i][j]=0;
				}
				else
				{
					if(s1.charAt(i-1)==s2.charAt(j-1))
					{
						dp[i][j] = dp[i-1][j-1]+1;
					}
					else
					{
						dp[i][j] = max(dp[i-1][j],dp[i][j-1]);
						
					}
				
				}

			}

		}
		System.out.println(dp[s1.length()][s2.length()]);

	}
	public static int max(int a, int b)
	{
		return a>b?a:b;

	}

	public static void swap(int ar[],int a, int b)
	{
		int temp = ar[a];
		ar[a] = ar[b];
		ar[b]= temp;
	
	}


}
