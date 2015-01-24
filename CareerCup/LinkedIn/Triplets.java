public class Triplets
{
	public static void main(String args[])
	{
		int ar[] = {1,2,2,4,5};
		triplets(ar,0,3);

	}
	public static void triplets(int ar[],int start,int count)
	{
		if(count==0)
		{
			if(ar[0]>ar[1] && ar[1]>ar[2])
				System.out.println(ar[0]+""+ar[1]+""+ar[2]);
		}

		for(int i=start;i<ar.length;i++)
		{
			swap(ar,start,i);
			triplets(ar,start+1,count-1);
			swap(ar,start,i);
		}
		

	}
	public static void swap(int ar[],int a, int b)
	{
		int temp = ar[a];
		ar[a] = ar[b];
		ar[b] = temp;
	}


}
