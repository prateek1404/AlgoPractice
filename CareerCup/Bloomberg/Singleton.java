public class Singleton
{
	private static Singleton instance;
	private Singleton()
	{
			
	}
	public static Singleton getInstance()
	{
		if(instance==null)
		{
			instance = new Singleton();
			return instance;
		}
		else
		{
			return instance;
		}


	}
	public void hello()
	{
		System.out.println("hello! This is a singleton class method");
	}


}
