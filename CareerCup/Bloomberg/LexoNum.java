public class LexoNum
{
	public static void main(String args[])
	{
//		int n = Integer.parseInt(args[0]);
		printLex(1,25);
	}
	
	public static void  printLex(int k, int n)
	{
		if(k>n)
		{
			return;
		}
		else
		{
			for(int i=0;i<10;i++)
			{
				if(k+i<n)
				{
					System.out.println(k+i);
					printLex((k+i)*10,n);
				}

			}
	
		}
		

	}

}
