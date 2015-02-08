public class AllPerm
{

	public static void main(String args[])
	{
		int ar[] = new int[args.length];
		for(int i=0;i<args.length;i++)
		{
			ar[i] = Integer.parseInt(args[i]);
		}
		allPerm(ar,0);
		
	}

	public static void allPerm(int ar[],int index)
	{
		if(index==3)
		{
			if(increasing(ar))
				printArray(ar);
		}
		else
		{
			for(int i=index;i<ar.length;i++)
			{
				swap(ar,index,i);
				allPerm(ar,index+1);
				swap(ar,index,i);
			}
	
		}

	}

	public static boolean increasing(int ar[])
	{
		for(int i=0;i<ar.length-1;i++)
		{
			if(ar[i]>ar[i+1])
			{
				return false;
			}
		}
		return true;

	}
	public static void printArray(int ar[])
	{
		for(int num:ar)
		{
			System.out.print(" "+num);
		}
		System.out.println("");

	}
	public static void swap(int ar[],int a, int b)
	{
		int temp = ar[a];
		ar[a] = ar[b];
		ar[b] = temp;

	}



}
