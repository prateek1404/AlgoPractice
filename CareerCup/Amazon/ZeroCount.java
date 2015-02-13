public class ZeroCount
{
	public static void main(String args[])
	{
		int ar[] = new int[args.length];
		for(int i=0;i<args.length;i++)
		{
			ar[i] = Integer.parseInt(args[i]);
		}

	}
	public int count(int ar[])
	{
		int start =0;
		int end = ar.length-1;
		while(start<=end)
		{
			int mid = (start+end)/2;
			if(mid==0)
			{
				if(ar[mid]==0)
				{
					return 1;
				}
				else
				{
					return 0;
				}

			}
			else
			{
				if(ar[mid]==1 && ar[mid-1]==0)
				{
					return mid;
				}
				else if(ar[mid]==0])
				{
					start = mid+1;
				}
				else
				{
	
	
				}
	
			}

		}



	}


}
