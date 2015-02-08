public class MajorityAlgo
{

	public static void main(String args[])
	{
		int ar[] = new int[args.length];
		for(int i=0;i<args.length;i++)
		{
			ar[i] = Integer.parseInt(args[i]);
		}
		System.out.println(majority(ar));	
	}

	public static int majority(int ar[])
	{
		int count=1;
		int majority = 0;
		for(int i=1;i<ar.length;i++)
		{
			if(ar[i]==ar[majority])
			{
				count++;
			}
			else
			{
				count--;
			}
			if(count==0)
			{
				majority =i;
				count=1;
			}
		}
		count =0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==ar[majority])
			{
				count++;
			}
		}
		if(count>ar.length/2)
		{
			return ar[majority];
		}
		else
			return -1;


	}

	public static void swap(int ar[],int a, int b)
	{
		int temp = ar[a];
		ar[a] = ar[b];
		ar[b]= temp;
	
	}


}
