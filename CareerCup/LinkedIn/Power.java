public class Power
{
	public static void main(String args[])
	{
		System.out.println(power(Integer.parseInt(args[0]),Integer.parseInt(args[1])));
	}
		

	public static int power(int a,int b)
	{
		if(b==0)
		{
			return 1;
		}
		if(b==1)
		{
			return a;
		}
		if(b%2==0)
		{
			int prod = power(a,b/2);
			return prod*prod;
			
		}
		else
		{
			int prod = power(a,b/2);
			return prod*prod*a;
		}


	}


}
