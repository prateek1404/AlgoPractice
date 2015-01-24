public class ReverseNumber
{
	public static void main(String args[])
	{
		int n = Integer.parseInt(args[0]);
		int sum=0;
		while(n!=0)
		{
			sum*=10;
			int k = n%10;
			n =n/10;
			sum = sum+k;
		}
		System.out.println(sum);
		
	}


}
