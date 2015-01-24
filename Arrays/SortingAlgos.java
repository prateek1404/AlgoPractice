public class SortingAlgos
{
	public static void main(String args[])
	{
		int ar[]= new int[args.length];
		for(int i=0;i<args.length;i++)
		{
			ar[i] = Integer.parseInt(args[i]);
		}	
		//insertionSort(ar);
		//bubbleSort(ar);
		//selectionSort(ar);
		// mergeSort(ar,0,ar.length-1);
		//heapSort(ar);
		quickSort(ar,0,ar.length-1);
		printArray(ar);
	}
	
	public static void quickSort(int ar[],int start,int end)
	{
		if(start<end)
		{
			int pivot = ar.length-1;
			int partition = Partition(ar,start,end);
			if(partition-1>start)
				quickSort(ar,start,partition-1);
			if(partition+1<end)
				quickSort(ar,partition+1,end);
			printArray(ar);
		}

	}


	public static int partition(int ar[],int start,int end,int pivot)
	{
		int i=start;
		int j=end;
		while(true)
		{
			while(ar[i]<ar[pivot])
			{
				i++;
			}
			while(ar[j]>ar[pivot])
			{
				j--;
			}
			if(i<=j)
			{
				swap(ar,i,j);
				i++;
				j--;
			}
			else
			{
				return j;
			}
	
		}
		//return i;
	}

	

	public static int Partition(int[] numbers, int left, int right)
    	{
        	int pivot = numbers[left];
       	 while (true)
       	 {
        	    while (numbers[left] < pivot)
                	left++;
 
           	     while (numbers[right] > pivot)
                	right--;
 
	            if (left < right)
        	      {
				swap(numbers,left,right);
                      }
             	      else
             	      {
                	    return right;
             	      }
        }
    }

	public static void heapSort(int ar[])
	{
		heapify(ar);
		//printArray(ar);
		int lastIndex = ar.length-1;
		while(lastIndex>0)
		{
			System.out.println("lastIndex=="+lastIndex);
			swap(ar,lastIndex,0);
			lastIndex--;
			bubbleDown(ar,0,lastIndex);
			printArray(ar);
			System.out.println("===============");	
		}
	}
	
	public static void heapify(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			bubbleUp(ar,i);
		}		
		
	}
	public static void bubbleDown(int ar[],int i,int lastIndex)
	{
		while(i<=lastIndex && (i*2)+1<=lastIndex)
		{
			int child1 = i*2+1;
			int child2 = i*2+2;
			int swapIndex=i;
			if(child2>lastIndex)
			{
				swapIndex= ar[i]<ar[child1]?child1:i;
				swap(ar,i,swapIndex);
				break;
			}
			else
			{
				swapIndex = ar[i]>ar[child1]?i:child1;
				swapIndex = ar[swapIndex]>ar[child2]?swapIndex:child2;
			}
			if(swapIndex==i)
			{
				break;
			}
			else
				swap(ar,i,swapIndex);
			i = swapIndex;
		}

	}

	public static void bubbleUp(int ar[],int i)
	{
		while(i!=0)
		{
			int parent = (i-1)/2;
			if(ar[i]>ar[parent])
			{
				swap(ar,i,parent);
				i= parent;				
			}
			else
			{
				break;
			}
		}
	}
	public static void printArray(int ar[])
	{
		if(ar==null)
		{
			System.out.println("null array");
			return;
		}
		for(int i:ar)
		{
			System.out.println(i);
		}
	}
	
	public static void insertionSort(int ar[])
	{
		for(int i=1;i<ar.length;i++)
		{
			int itemToInsert = ar[i];
			for(int j=0;j<i;j++)
			{
				if(itemToInsert<ar[j])
				{
					// item needs to be inserted at j index
					for(int k=j;k<i;k++)
					{
						ar[k+1]=ar[k];
					}
					ar[j]=itemToInsert;
					break;
				}

			}
			
		}

	}

	public static void selectionSort(int ar[])
	{
		int lowest =0;
		for(int i=0;i<ar.length;i++)
		{
			lowest =i;
			for(int j=i;j<ar.length;j++)
			{	
				if(ar[j]<ar[lowest])
				{
					lowest =j;
				}
			}
			swap(ar,i,lowest);
		}
	}
	
		
	public static void bubbleSort(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar.length-i-1;j++)
			{
				if(ar[j]>ar[j+1])
				{
					swap(ar,j,j+1);					
				}
			}

		}

	}

	public static void mergeSort(int ar[],int start, int end)
	{
		if(start<end)
		{
		 int mid = (start+end)/2;
		 mergeSort(ar,start,mid);
		 mergeSort(ar,mid+1,end);
		 merge(ar,start,mid,end);
		}


	}
	public static int[] merge(int ar[],int start,int mid,int end)
	{
		int ar3[] = new int[ar.length];
		
		for(int z=0;z<ar3.length;z++)
		{
			ar3[z]=ar[z];

		}		

		int i=start;
		int j=mid+1;
		int k=start;
		while(i<=mid && j<=end)
		{
			if(ar3[i]<ar3[j])
			{
				ar[k]= ar3[i];
				i++;
				k++;
			}
			else
			{
				ar[k]=ar3[j];
				j++;
				k++;
			}
		}
		while(i<=mid)
		{
			ar[k]=ar3[i];
			i++;
			k++;
		}
		while(j<=end)
		{
			ar[k]= ar3[j];
			j++;
			k++;
		}

		return ar;
	}

	public static void swap(int ar[],int i, int j)
	{
		int temp = ar[i];
		ar[i]= ar[j];
		ar[j]= temp;
	}
	
	public static int partition(int ar[], int pivot)
	{
		return 0;	
	}
	


}
