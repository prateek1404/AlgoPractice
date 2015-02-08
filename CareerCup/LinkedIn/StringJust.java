public class StringJust
{

	public static void main(String args[])
	{
		int ar[] = new int[args.length];
		for(int i=0;i<args.length;i++)
		{
			//ar[i] = Integer.parseInt(args[i]);
		}
		justify(args,20);
		
		
	}

	public static void justify(String ar[], int limit)
	{
		int dp[] = new int[ar.length+1];
		int next[] = new int[ar.length];
		dp[ar.length]=0;
		for(int i=ar.length-1;i>=0;i--)
		{
			int minCost = limit- ar[i].length();
			int minIndex = i;
			for(int j=i+1;j<ar.length;j++)
			{
				//calculate the cost of i till j
				int cost = cost(limit,ar,i,j);
				if(cost!=-1)
				{
					if(cost+dp[j+1]<minCost)
					{
						minCost= cost;
						minIndex = j;
					}
				}
			}
			dp[i] = minCost;
			next[i]=minIndex;
		}
		int k=0;
		for(int i:next)
		{
			System.out.print(i+" ");
		}
		System.out.println("");
		while(k<ar.length)
		{
			int dest = next[k];
			for(int i=k;i<=dest;i++)
			{
				System.out.print(ar[i]+" ");
			}
			System.out.println("");
			k = dest+1;

		}
		
		

	}
	public static int cost(int limit, String ar[],int start,int end)
	{
		//evaluate the cost of the spaces
		int count=0;
		for(int i=start;i<=end;i++)
		{
			count = count+ar[i].length();
		}
		count = count + end-start;
		if(count>limit)
		{
			return -1;
		}
		return limit-count;

	}

	public static void swap(int ar[],int a, int b)
	{
		int temp = ar[a];
		ar[a] = ar[b];
		ar[b]= temp;
	
	}


}
