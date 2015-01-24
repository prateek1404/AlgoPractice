public class Driver
{
	public static void main(String args[])
	{
		Singleton single = Singleton.getInstance();
		single.hello();
	}

}
