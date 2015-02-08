public class TwoSum
{

	public static void main(String args[])
	{
		int ar[] = new int[args.length];
		for(int i=0;i<args.length;i++)
		{
			ar[i] = Integer.parseInt(args[i]);
		}
		sum(ar,10);
		
	}

	public static void sum(int ar[], int sum)
	{
		quickSort(ar,0,ar.length-1);
		int start=0;
		int end = ar.length-1;
		while(start<end)
		{
			int sum2 = ar[start]+ar[end];
			if(sum2==sum)
			{
				System.out.println("The two elements are "+ar[start]+","+ar[end]);
				break;
			}
			else if(sum2>sum)
			{
				end = end-1;
			}
			else
			{
				start = start+1;
			}
		}
		if(start==end)
		{
			System.out.println("Not found :(");
		}

	}

	public static void quickSort(int ar[],int start,int end)
	{
		if(start<end)
		{
			int partition = partition(ar,start,end);
			quickSort(ar,start,partition-1);
			quickSort(ar,partition+1,end);
		}
	
	}
	public static int partition(int ar[],int start,int end)
	{
		int i = start-1;
		int pivot = ar[end];
		for(int j=start;j<=end;j++)
		{
			if(ar[j]<pivot)
			{
				i++;
				swap(ar,i,j);
			}
		}
		swap(ar,i+1,end);
		return i+1;
	}

	public static void swap(int ar[],int a, int b)
	{
		int temp = ar[a];
		ar[a] = ar[b];
		ar[b]= temp;
	
	}


}
