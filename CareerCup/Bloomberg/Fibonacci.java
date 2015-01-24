public class Fibonacci
{
	public static void main(String args[])
	{
		int input = Integer.parseInt(args[0]);
		fibonacci(input);
	}
	public  static void fibonacci(int n)
	{
		int a =0;
		int b= 1;
		System.out.println(a);
		System.out.println(b);
		while(a+b<=n)
		{
			int c = a+b;
			System.out.println(c);
			a = b;
			b=c;
		}
			

	}



}
