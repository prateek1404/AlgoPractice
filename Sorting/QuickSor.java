public class QuickSor
{
	int ar[];
	public static void main(String args[])
	{
		QuickSor hs = new QuickSor();
		hs.ar = new int[args.length];
		for(int i=0; i<args.length;i++)
		{
			hs.ar[i]=Integer.parseInt(args[i]);
		}
		hs.quickSort(0,args.length-1);
		hs.printArray();
	}
	public void printArray()
	{
		for(int i: ar)
		{
			System.out.println(i);
		}

	}
	
	public void quickSort(int start, int end)
	{
		if(start<end)
		{
			int partition = partition(start,end);
			quickSort(start,partition-1);
			quickSort(partition+1,end);
		}

	}
	
	public int partition(int start, int end)
	{
		int pivot = start;
		while(start<=end)
		{
			
			while(ar[start]<ar[pivot] && start!=pivot)
			{	
				start++;
			}		
			while(ar[end]>ar[pivot] && end!=pivot)
			{
				end--;
			}
			if(start<=end)
			{
				swap(start,end);
				start++;
				end--;
			}
			else
			{
				break;
			}
		}
		System.out.println("returning");
		return end;
	
	}
	public void swap(int a, int b)
	{
		int temp = ar[a];
		ar[a] =ar[b];
		ar[b]= temp;
			
	}
}
