public class MaximumProductSubset
{

	public static void main(String args[])
	{
		int ar[] = new int[args.length];
		for(int i=0;i<args.length;i++)
		{
			ar[i] = Integer.parseInt(args[i]);
		}
		System.out.println(maximumProductSubset(ar));
		
	}

	public static int maximumProductSubset(int ar[])
	{
		int product=1;
		int countNeg=0;
		int minNegative = Integer.MIN_VALUE;
		for(int i=0;i<ar.length;i++)
		{
			product = product*ar[i];
			if(ar[i]<0)
			{
				countNeg++;
				if(ar[i]>minNegative)
				{
					minNegative=ar[i];
				}
			}						

		}
		if(countNeg%2!=0)
		{
			product = product/minNegative;
		}

		return product;


	}

	public static void swap(int ar[],int a, int b)
	{
		int temp = ar[a];
		ar[a] = ar[b];
		ar[b]= temp;
	
	}


}
