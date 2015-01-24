public class HeapSort
{
	int ar[];
	public static void main(String args[])
	{
		HeapSort hs = new HeapSort();
		hs.ar = new int[args.length];
		for(int i=0; i<args.length;i++)
		{
			hs.ar[i]=Integer.parseInt(args[i]);
		}
		hs.heapify();
		hs.printArray();
		hs.heapSort();	
		hs.printArray();
	}

	public void printArray()
	{
		for(int i:ar)
		{
			System.out.println(i);
		}
		
	}
	public void heapSort()
	{
		for(int i=0;i<ar.length;i++)
		{
			swap(0,ar.length-1-i);
			bubbleDown(0,ar.length-2-i);
		}

	}
	public void heapify()
	{
		for(int i=0;i<ar.length;i++)
		{
			bubbleUp(i);
		}
	}
	
	public void bubbleDown(int i,int lastIndex)
	{
		while(i<lastIndex && (i*2)+1<lastIndex)
		{
			int child1= i*2+1;
			int child2= i*2+2;
			int swapIndex = i;
			if(child1<lastIndex && child2<lastIndex)
			{
				swapIndex = ar[child1]>ar[i]?child1:i;
				swapIndex = ar[child2]>ar[swapIndex]?child2:swapIndex;
				if(i!=swapIndex)
				{
					swap(i,swapIndex);
					i=swapIndex;
				}
				else
				{
					break;	
				}
			}
			else
			{
				if(child1<lastIndex)
				{
					if(ar[child1]>ar[i])
					{
						swap(child1,i);
						i= child1;
					}
					else
					{
						break;
					}
				}
			}
	
		}	
	
	}
	
	public void bubbleUp(int i)
	{
		while(i>=0)
		{
			int parent = (i-1)/2;
			if(parent>=0)
			{
				if(ar[parent]<ar[i])
				{
					swap(parent,i);
					i=parent;
				}
				else
				{
					break;
				}

			}
			else
			{
				break;
			}

		}

	}
	public void swap(int a , int b)
	{
		int temp = ar[a];
		ar[a]= ar[b];
		ar[b]= temp;
	}
	
}
