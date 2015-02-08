public class PrintAscii
{
	public static void main(String args[])
	{
	
		printAscii(0);
	}
	public static void printAscii(int ch)
	{
		if(ch==256)
		{
			return;
		}
		System.out.println((char)ch);
		printAscii(ch+1);
		

	}

}
