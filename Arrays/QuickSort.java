public class QuickSort
{
	public static void main(String args[])
        {
                int ar[]= new int[args.length];
                for(int i=0;i<args.length;i++)
                {
                        ar[i] = Integer.parseInt(args[i]);
                }
                quickSort(ar,0,ar.length-1);
                printArray(ar);
        }
		
	public static void printArray(int ar[])
	{
		for(int i:ar)
		{
			System.out.println(i);
		}
	}
	
	public static void quickSort(int ar[],int start,int end)
	{
		if(start<end)
		{
			int partition = partition(ar,start,end);
			if(partition-1>start)
			{
				quickSort(ar,start,partition-1);
			}
			if(partition+1<end)
			{
				quickSort(ar,partition+1,end);
			}

		}

	}
	
	public static int partition(int ar[],int start, int end)
	{
		int pivot = ar[start];
		while(true)
		{
			while(ar[start]<pivot)
			{
				start++;				
			}
			while(ar[end]>pivot)
			{
				end--;
			}
			if(start<end)
			{
				swap(ar,start,end);
			}
			else
			{
				return end;
			}
			
		}

	}
	public static void swap(int ar[],int i, int j)
	{
		int temp = ar[i];
		ar[i] = ar[j];
		ar[j] = temp;
	}


}
