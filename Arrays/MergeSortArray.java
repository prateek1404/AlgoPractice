class MergeSortArray
{
	public static void main(String args[])
        {
                int ar[]= new int[args.length];
                for(int i=0;i<args.length;i++)
                {
                        ar[i] = Integer.parseInt(args[i]);
                }
                mergeSort(ar,0,ar.length-1);
                printArray(ar);
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
			merge(ar,start,end,mid);
		}

	}
	public static void merge(int ar[], int start, int end, int mid)
	{
		int temp[]= new int[ar.length];
		for(int i=0;i<ar.length;i++)
		{
			temp[i]=ar[i];
		}
		int head1= start;
		int head2 = mid+1;
		int newListHead = start;
		while(head1<=mid && head2<=end)
		{
			if(temp[head1]>temp[head2])
			{
				ar[newListHead]=temp[head1];
				newListHead++;
				head1++;				
			}
			else
			{
				ar[newListHead]=temp[head2];
                                newListHead++;
                                head2++;
			}
		}
		while(head1<=mid)
		{
			ar[newListHead]=temp[head1];
                                newListHead++;
                                head1++;
		}
		while(head2<=end)
		{
			ar[newListHead]=temp[head1];
                                newListHead++;
                                head1++;

		}
		
	}

}
