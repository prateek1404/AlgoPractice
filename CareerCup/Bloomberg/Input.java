import java.io.*;
public class Input
{
	private static int ar[];
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			String ars[] = removeExtraSpaces(br.readLine()).split(" ");
			ar = new int[ars.length];
			for(int i=0;i<ar.length;i++)
			{
				ar[i] = Integer.parseInt(ars[i]);
			}
			printArray();
			String s = buildString();
			System.out.println(s);
		}
		catch(IOException ie)
		{
			System.out.println(ie);
		}
	}
	public static void printArray()
	{
		for(int i:ar)
		{
			System.out.println(i);
		}
	}
	public static  String buildString()
	{
		StringBuilder sb = new StringBuilder("");
		for(int i:ar)
		{
			sb.append(String.valueOf(i));
			sb.append(" ");
		}

		return sb.toString().trim();
	}
	public static String removeExtraSpaces(String input)
	{
		int length = input.length();
		int i =0;
		StringBuilder sb = new StringBuilder();
		while(i<length)
		{
			if(input.charAt(i)==' ')
			{
				sb.append(" ");
				while(input.charAt(i)==' ')
				{
					i++;
				}
				
			}
			sb.append(input.charAt(i));
			i++;
		}
		return sb.toString();
	}

}
