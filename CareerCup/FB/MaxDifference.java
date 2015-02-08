public class MaxDifference
{
	public static void main(String args[])
	{
		int ar[] = new int[args.length];
		for(int i=0;i<args.length;i++)
		{
			ar[i] = Integer.parseInt(args[i]);
		}
		System.out.println(maxDiff(ar));

	}
	public static int maxDiff(int ar[])
	{
		int length = ar.length;
		int max = ar[length-1];
		int maxDiff = 0;
		for(int i=length-2;i>=0;i--)
		{
			if(max-ar[i]>maxDiff)
			{
				maxDiff = max-ar[i];
			}
			if(ar[i]>max)
			{
				max = ar[i];
			}
			
		}
		return maxDiff;
	
	}


}
