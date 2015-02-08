public class Majority
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
		
	int el = 0;
	int count=1;
	for(int i=1;i<ar.length;i++)
	{
		if(ar[i]==ar[el])
		{
			count++;
		}
		else
		{
			count--;
			if(count==0)
			{
				el =i;
				count =1;
			}

		}

	}
	count =0;
	for(int i=0;i<ar.length;i++)
	{
		if(ar[el]==ar[i])
		{
			count++;
		}
	}
	if(count>ar.length/2)
	{
		return ar[el];
	}
	else
	{
		return -1;
	}


	}

}
