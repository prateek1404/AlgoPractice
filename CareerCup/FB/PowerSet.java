public class PowerSet
{
	public static void main(String args[])
	{
		char ar[] = args[0].toCharArray();
		boolean exists[] = new boolean[ar.length];
		powerSet(ar,0,exists);
			
	}

	public static void powerSet(char ar[],int index,boolean exists[])
	{
		if(index== ar.length)
		{
			print(ar,exists);
			return;
		}
		powerSet(ar,index+1,exists);
		exists[index]=true;
		powerSet(ar,index+1,exists);
		exists[index]=false;
	
	}
	public static void print(char ar[],boolean exists[])
	{
		for(int i=0;i<ar.length;i++)
		{
			if(exists[i])
			{
				System.out.print(ar[i]);
			}
		}
		System.out.println("");

	}
	

}
