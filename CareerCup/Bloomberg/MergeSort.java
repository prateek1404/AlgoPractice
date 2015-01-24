public class MergeSort
{
	public static void main(String args[])
	{
		int ar[] ={1,23,4,532,425,235,234,324,2345,235,234,324,23};
		quickSort(ar,0,ar.length-1);
		printArray(ar);
	}
	public static void quickSort(int ar[],int start, int end)
	{
		if(start<end)
		{
			int partition = partition(ar,start,end);
			if(start<partition-1)
				quickSort(ar,start,partition-1);
			if(end>partition+1)
				quickSort(ar,partition+1,end);
			

	
		}

	}
	public static int partition(int ar[],int start, int end)
	{
		int pivot = ar[start];
		int pivotIndex = start;
		while(start<=end && start<ar.length && end>=0)
		{
			while(start< ar.length && ar[start]<=pivot)
			{
				start++;
			}
			while(end>=0 && ar[end]>pivot)
			{
				end--;
			}
			if(start<=end)
			{
				swap(ar,start,end);
				start++;
				end--;
			}
			else
			{
				break;
			}
	
		}
		swap(ar,pivotIndex,end);
		return end;

	}

	public static void swap(int ar[],int a, int b)
	{
		int temp = ar[a];
		ar[a] = ar[b];
		ar[b] = temp;
	
	}
	public static void printArray(int ar[])
	{
		for(int i:ar)
		{
			System.out.println(i);
		}
	}
	public static void mergeSort(int ar[],int start,int end)
	{
		if(start<end)
		{
			int mid = (start+end)/2;
			mergeSort(ar,start,mid);
			mergeSort(ar,mid+1,end);
			merge(ar,start,mid,end);
		
		}
	

	}
	public static void merge(int ar[],int start,int mid,int end)
	{
		int ar3[] = new int[ar.length];
		for(int i=0;i<ar.length;i++)
		{
			ar3[i]=ar[i];
		}
		int start1 = start;
		int end1= mid;
		int start2 = mid+1;
		int end2 = end;
		while(start1<=end1 && start2<=end2)
		{
			if(ar3[start1]<ar3[start2])
			{
				ar[start]= ar3[start1];
				start1++;
				start++;
			}
			else
			{
				ar[start]=ar3[start2];
				start2++;
				start++;
			}

		}
		while(start1<=end1)
		{
			ar[start]=ar3[start1];	
			start1++;
			start++;
		}
		while(start2<=end2)
		{
			ar[start]= ar3[start2];
			start2++;
			start++;
		}
		
		

	}

}
