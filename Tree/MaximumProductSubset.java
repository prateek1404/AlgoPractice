public class MaximumProductSubset
{
	public static void main(String args[])
	{
		int ar[] = new int[args.length];
		for(int i=0;i<args.length;i++)
		{
			ar[i] = Integer.parseInt(args[i]);
		}
		maximumSumSubset(ar);

	}
	public static void maximumSumSubset(int ar[])
	{
		int dp[][] = new int[ar.length][ar.length];
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>0)
			{
				dp[i][i]=ar[i];
			}
			else
			{
				dp[i][i] =1;
			}
		}
		int max =0;
		int maxi=0;
		int maxj=0;
		for(int L=2;L<=ar.length;L++)
		{
			for(int i=0;i<ar.length-L+1;i++)
			{
				int j = i+L-1;
				if(dp[i][j-1]*ar[j]>dp[i][j])
				{
					dp[i][j] = dp[i][j-1]*ar[j];
				}
				else
				{
					dp[i][j] = dp[i][j-1];
				}
				if(max<dp[i][j])
				{
					max = dp[i][j];
				}
			}
		}
		System.out.println(max);
		

	}



}
