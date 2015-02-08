public class MajorityElement
{

	public static void main(String args[])
	{
		int ar[] = new int[args.length];
		for(int i=0;i<args.length;i++)
		{
			ar[i] = Integer.parseInt(args[i]);
		}
		System.out.println(majorityElement(ar));
		
	}

	public static int majorityElement(int ar[])
	{
		int length = ar.length;
		TwoSum.quickSort(ar,0,length-1);
		int start =0;
		int end = start+(length/2);
		while(start>=0 && end<=length-1)
		{
			if(ar[start]==ar[end])
			{
				return ar[start];
			}
			else
			{
				start++;
				end++;
			}
		}
		return -1;
		
	
	}

	public static void swap(int ar[],int a, int b)
	{
		int temp = ar[a];
		ar[a] = ar[b];
		ar[b]= temp;
	
	}


}
