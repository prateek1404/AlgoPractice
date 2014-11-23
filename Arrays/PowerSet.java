//http://www.careercup.com/question?id=6189585818189824

public class PowerSet
{
	public static void main(String args[])
	{
		int ar[] = new int[args.length];
		for(int i=0;i<args.length;i++)
		{
			ar[i]= Integer.parseInt(args[i]);
		}
		printPowerSet(ar);		

	}
	public static void printPowerSet(int ar[])
	{
		print(ar.length);	
		int  N = (int)Math.pow(2,(ar.length));
		print(N);
		for(int i =0;i<N;i++)
		{
						
		}		

	}
	public static void print(Object c)
	{
		System.out.println(c);
	}

}

