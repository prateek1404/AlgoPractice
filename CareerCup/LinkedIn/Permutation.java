public class Permutation
{

	public static void main(String args[])
	{
		int ar[] = new int[args.length];
		for(int i=0;i<args.length;i++)
		{
			ar[i] = Integer.parseInt(args[i]);
		}
		permutation(ar,0);	
	}

	public static void permutation(int ar[],int index)
	{
		if(index==2)
		{
			printArray(ar);
		}
		else
		{
			for(int i=index;i<ar.length;i++)
			{
				swap(ar,i,index);
				permutation(ar,index+1);
				swap(ar,i,index);

			}
	
		}


	}
	public static void printArray(int ar[])
	{
		for(int i=0;i<ar.length-1;i++)
		{
			if(ar[i]>ar[i+1])
			{
				return;
			}
		}
		for(int i:ar)
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
