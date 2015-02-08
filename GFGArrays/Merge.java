public class Merge
{

	public static void main(String args[])
	{
		int ar[] = new int[args.length];
		for(int i=0;i<args.length;i++)
		{
			ar[i] = Integer.parseInt(args[i]);
		}
		int ar1[] = {1,-1,123,-1,-1,121,43,432,4234,-1};
		int ar2[] ={5,11,3213,6534};
		TwoSum.quickSort(ar1,0,ar1.length-1);
		TwoSum.quickSort(ar2,0,ar2.length-1);
		
		merge(ar1,ar2);		
	}
		
	public static void merge(int ar1[], int ar2[])
	{
		int len1 = ar1.length;
		int len2= ar2.length;
		
		int dif = len1-len2;
		int j= ar1.length-1;
		for(int i=ar1.length-1;i>=0;i--)
		{
			if(ar1[i]!=-1)
			{
				ar1[j] = ar1[i];
				j--;
			}
	
		}
		j++;
		
		int start1=j;
		int start2=0;
		int k=0;
		while(start2<ar2.length && start1<ar1.length)
		{
			if(ar2[start2]<ar1[start1])
			{
				ar1[k]= ar2[start2];
				k++;
				start2++;
			}
			else
			{
				ar1[k] = ar1[start1];
				k++;
				start1++;
			}
		}
		while(start2<ar2.length)
		{
			ar1[k] = ar2[start2];
			k++;
			start2++;
		}
		while(start1<ar1.length)
		{
			ar1[k] = ar2[start1];
			k++;
			start1++;
		}

		for(int i:ar1)
		{
			System.out.print(i+" ");
		}
		System.out.println("");

		
		
	}

	public static void swap(int ar[],int a, int b)
	{
		int temp = ar[a];
		ar[a] = ar[b];
		ar[b]= temp;
		
	
	}


}
