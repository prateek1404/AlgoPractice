public class StringJustification
{
	public static void main(String args[])
	{
		justify(args,10);

	}
	public static void justify(String ar[],int limit)
	{
		int dp[] = new int[ar.length];
		for(int i=0;i<dp.length;i++)
		{
			dp[i] = Integer.MAX_VALUE;
		}
		dp[ar.length-1]=limit-ar[ar.length-1].length();
		for(int i=ar.length-2;i>=0;i--)
		{
			int min = Integer.MAX_VALUE;
			for(int j=i+1;j<ar.length;j++)
			{
				int output = costOf(ar,i,j,limit);
				//System.out.println("output"+output);
				if(output==-1)
				{
					break;
				}
				int cost = output+dp[j];
				if(min<cost)
				{
					System.out.println("j="+j);
					min=cost;
				}
			}
			dp[i] = min;
		}
		for(int i:dp)
		{
			System.out.print(i+" ");
		}
		int i=0;
		while(i<ar.length)
		{
			int j=i+1;
			StringBuilder br = new StringBuilder();
			br.append(ar[i]);
			while(j<ar.length)
			{
				if(dp[i]-dp[j]==br.length())
				{
					print(ar,i,j);
					i=j;
					break;
				}
				else
				{
					br.append(ar[j]);
				}
				j++;
			}
			i=j;
			
		}
		
	}
	public static void print(String ar[],int i, int j)
	{
		System.out.print(ar[i]);
		for(int k=i+1;k<j;k++)
		{
			System.out.println(" "+ar[k]);
		}

	}

	public static int costOf(String ar[],int i, int j,int limit)
	{
		int length=0;
		length = ar[i].length();
		i++;
		while(i<j)
		{
			length = length+1+ar[i].length();
			if(length>limit)
			{
				return -1;
			}
			i++;	
		}
		return limit-length;

	}

}
