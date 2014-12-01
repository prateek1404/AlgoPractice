public class OddNumber
{
	public static void main(String args[])
	{
		int ar[] = new int[args.length];
		int j=0;
		for(String i:args)
		{
			ar[j]=Integer.parseInt(i);
			System.out.println(ar[j]);
			j++;	
		}
		int xor=0;
		for(int i:ar)
		{
			xor = xor^i;
		}
		System.out.println(xor);

	}

}
