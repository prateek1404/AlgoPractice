public class MergeSort
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
	mergeSort(0,ar.length-1);
	printArray();

}
public static void printArray()
{
	for(int i:ar)
	{
		System.out.println(i);
	}

}


}
public static void swap(int a, int b)
{
	int temp = ar[a];
	ar[a]= ar[b];
	ar[b]= temp;

}

}
