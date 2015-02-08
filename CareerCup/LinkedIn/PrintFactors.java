public class PrintFactors
{
	public static void main(String args[])
	{
		printFactors(Integer.parseInt(args[0]));

	}

	public static void printFactors(int n)
	{
		for(int i=1;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
				if(n/i!=i)
					System.out.println(n/i);
			}
		}

	}


}
