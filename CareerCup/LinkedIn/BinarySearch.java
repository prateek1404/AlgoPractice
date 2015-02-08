public class BinarySearch
{
	public static void main(String args[])
	{
		int ar[] = new int[args.length];
		for(int i =0;i<args.length;i++)
		{
			ar[i] = Integer.parseInt(args[i]);
		}
		System.out.println(binarySearch(ar,12));

	}
	public static int binarySearch(int ar[], int key)
	{
		int start=0;
		int end = ar.length-1;
		while(start<=end)
		{
			int mid = (start+end)/2;
			if(ar[mid]==key)
			{
				return mid;
			}		
			else if (ar[mid]>key)
			{
				end = mid-1;
			}
			else
			{
				start = mid+1;
			}
		}
		return -1;
	

	}

}
