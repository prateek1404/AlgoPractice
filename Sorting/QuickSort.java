class QuickSort
{
private static int [] arr= {4,3,7,34,77,43,55};
public static void main(String args[])
{
	quickSort(arr,0,arr.length-1);
	for(int i: arr)
	{
		System.out.print(i+" ");
	}

}
public static void quickSort(int ar[],int start,int end)
{
	if(start>=end)
		return;
	else
	{
	int partition = partition(ar,start,end);
	quickSort(ar,start,partition-1);
	quickSort(ar,partition+1,end);
	}
}
public static int partition(int ar[],int start,int end)
{
	int pivot = ar[end];
	int i=start;
	int j=end-1;

	while(i<=j)	
	{
		while(ar[i]<pivot)
		{
			i++;
		}
		while(ar[j]>pivot)
		{
			j--;
		}
		if(i<=j)
		{
			int temp = ar[i];
			ar[i]= ar[j];
			ar[j]= temp;
			i++;
			j--;

		}
	}
	int temp = ar[end];
	ar[end]= ar[j];
	ar[j]=temp;
	return i;
}

}
