public class KnapSack
{

	public static void main(String args[])
	{
		int ar[] = new int[args.length];
		for(int i=0;i<args.length;i++)
		{
			ar[i] = Integer.parseInt(args[i]);
		}
		int val[] ={10,20,30,25,46};
		System.out.println(knapSack(ar,12,val));
		
		
	}
	public static int max(int a, int b)
	{
		return a>b?a:b;
	}
	public static int knapSack(int ar[],int W,int val[])
	{
		int dp[][] = new int[W+1][ar.length+1];
		for(int i=0;i<=W;i++)
		{
			for(int j=0;j<=ar.length;j++)
			{
				if(i==0||j==0)
				{
					dp[i][j]=0;
				}
				else if(i<ar[j-1])
				{
					dp[i][j]=dp[i][j-1];
				}
				else
				{
					dp[i][j] = max(dp[i][j-1],val[j-1]+dp[i-ar[j-1]][j-1]);
				}
				
			}

		}
		return dp[W][ar.length];
		


	}

	public static void swap(int ar[],int a, int b)
	{
		int temp = ar[a];
		ar[a] = ar[b];
		ar[b]= temp;
	
	}


}
