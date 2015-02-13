public class PossibleZero
{
	public static void main(String args[])
	{
		int ar[] = new int[args.length];
		for(int i=0;i<args.length;i++)
		{
			ar[i] = Integer.parseInt(args[i]);
		}
	System.out.println(isPossible(ar,0,0));			

	}

	public static boolean isPossible(int ar[], int sum, int index)
	{
		if(sum==0 && index!=0)
		{
			return true;
		}
		if(index==ar.length && sum!=0)
		{
			return false;
		}
		else
		{
			return isPossible(ar,sum+ar[index],index+1)|| isPossible(ar,sum-ar[index],index+1);
		}

	}

}
