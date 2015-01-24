public class QuickSort<T>
{
	T list;
	public static void main(String args[])
	{

	}
	public void quickSort(T ar[],int start,int end)
	{
		if(start<end)
		{
			int partition = partitionFunction(ar,start,end);
			quickSort(ar,start,partition-1);
			quickSort(ar,partition+1,end);
		}			

	}
	public int partitionFunction(T ar[],int start,int end)
	{

	}
}
