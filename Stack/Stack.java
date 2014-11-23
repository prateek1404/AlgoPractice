import java.util.Stack;
public class Stack
{	
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader(new InputStreamReadeR(System.in));
		try
		{
			String expression = br.readLine();
		}
		catch(IOException ioe)
		{
			System.out.println(ioe);
		}
	}
	public static boolean hasMatching(String str)
	{
		Stack s = new Stack(str.length());
	}

}
