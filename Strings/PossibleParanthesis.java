public class PossibleParanthesis
{
	public static void main(String args[])
	{
		int N = Integer.parseInt(args[0]);
		paren(N,N,"");

	}
	
	public static void paren(int left, int right, String accumulator)
	{
		if(left==0 && right==0)
		{
			System.out.println(accumulator);
			return;
		}
		if(left>right)
		{
			return;
		}
		if(left>0)
		{
			paren(left-1,right,accumulator+"(");
		}
		if(right>0)
		{
			paren(left,right-1,accumulator+")");
		}

	}


}
