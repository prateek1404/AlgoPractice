public class Sorting
{
	static int ar[];
public static void main(String args[])
{
	ar = new int[args.length];
	for(int i=0;i<args.length;i++)
	{
		ar[i]= Integer.parseInt(args[i]);
	}
	printArray();
	//insertionSort();
	quickSort(0,ar.length-1);
	printArray();

}
public static void printArray()
{
	for(int i:ar)
	{
		System.out.println(i);
	}

}

public static void insertionSort()
{
	for(int i=1;i<ar.length;i++)
	{
			int j=0;
			int temp =ar[i];
			while(ar[i]>ar[j] && j<ar.length)
			{
				j++;
			}
			int k=i;
			while(k>j)
			{
				ar[k]= ar[k-1];
				k--;
			}
			ar[j]=temp;
			printArray();
			
	}

}
public static void quickSort(int start, int end)
{
	if(start<end)
	{
		int partition = partition(start,end);
		if(start<partition-1)
			quickSort(start,partition-1);
		if(partition+1<end)
			quickSort(partition+1,end);

	}

}

public static int partition(int start, int end)
{
	int pivot = ar[start];
	int pivoti = start;
	while(start<=end && start<=ar.length && end>=0)
	{
		while(start<ar.length && ar[start]<=pivot)
		{
			start++;
		}
		while(end>=0 && ar[end]>pivot)
		{
			end--;
		}
		if(start<=end)
		{
			swap(start,end);
		}
		else
		{
			break;
		}
		

	}	
	swap(pivoti,end);
	return end;

}
public static void swap(int a, int b)
{
	int temp = ar[a];
	ar[a]= ar[b];
	ar[b]= temp;

}

}
