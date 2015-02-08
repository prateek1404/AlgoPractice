public class LongestPalindromicSub
{

	public static void main(String args[])
	{
		int ar[] = new int[args.length];
		for(int i=0;i<args.length;i++)
		{
			ar[i] = Integer.parseInt(args[i]);
		}
		longestSub(ar);
		
	}
	public static void longestSub(int ar[])
	{	

		int dp[][] = new int[ar.length][ar.length];
		for(int i=0;i<ar.length;i++)
		{
			dp[i][i]=1;
		}
		for(int i=0;i<ar.length-1;i++)
		{
			if(ar[i]==ar[i+1])
			{
				dp[i][i+1]=2;
			}
		}
		for(int L=3;L<=ar.length;L++)
		{
			for(int i=0;i<ar.length-L+1;i++)
			{
				int j = i+L-1;
				if(ar[i]==ar[j])
				{
					dp[i][j]= 2+dp[i+1][j-1];
				}
				else
				{
					dp[i][j] = max(dp[i+1][j],dp[i][j-1]);
				}

			}

		}
		System.out.println(dp[0][ar.length-1]);	
			

	}
	public static int max(int a , int b)
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
