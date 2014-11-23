import java.io.*;
public class Test
{
	private static Test inst = new Test();
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			String str = br.readLine();
			int i = Integer.parseInt(str);
		}
		catch(Exception e)
		{

		}
	}
	private Test()
	{
	
	}
	public static Test getInstance()
	{
		return inst;
	}

}
