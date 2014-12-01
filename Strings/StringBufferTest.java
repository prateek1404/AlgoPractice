import java.util.StringTokenizer;
class StringBufferTest
{
	public static void main(String args[])
	{
		StringBuffer b = new StringBuffer("hello what is going on");
		System.out.println(b.length());
		StringTokenizer tk = new StringTokenizer(b.toString());
		while(tk.hasMoreTokens())
		{
			System.out.println(tk.nextToken());
		}
	}
}
