public class MaximumContProduct
{

	public static void main(String args[])
	{
		int ar[] = new int[args.length];
		for(int i=0;i<args.length;i++)
		{
			ar[i] = Integer.parseInt(args[i]);
		}
		maxProduct(ar);
		
	}
	
	public static int maxProduct(int ar[])
	{
		int maxProdNegative=-1;
		int maxProdPositive=1;
		int productTillNow =1;
		boolean foundNegative =false;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<0)
			{
				if(!foundNegative)
				{
					maxProdNegative = maxProdPositive*ar[i];
					foundNegative=true;
				}
				else
				{
					maxProdPositive = maxProdNegative*ar[i];
					maxProdNegative = maxProdPositive*ar[i];
				}
			}
			else if(ar[i]>0)
			{
					if(foundNegative)
						maxProdNegative = maxProdNegative*ar[i];
					maxProdPositive = maxProdPositive*ar[i];
			}
			else
			{
				maxProdPositive =1;
				maxProdNegative =-1;
			}
			
		}
		System.out.println(maxProdPositive);
		return maxProdPositive;

	}

	public static void swap(int ar[],int a, int b)
	{
		int temp = ar[a];
		ar[a] = ar[b];
		ar[b]= temp;
	
	}


}
