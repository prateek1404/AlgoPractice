public class MinDistance
{
	public static void main(String args[])
	{
		minDistance(args,"quick","fox");


	}
	public static int minDistance(String ar[],String s1, String s2)
	{
		int s1Last =-1;
		int s2Last = -1;
		int min = Integer.MAX_VALUE;	
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i].equals(s1)||ar[i].equals(s2))
			{
				if(ar[i].equals(s1))
				{
					s1Last = i;
					if(s2Last>=0 && min>i-s2Last)
					{
						min = i-s2Last;
					}	
				}
				else
				{
					s2Last = i;
					if(s1Last>=0 && min>i-s1Last)
					{
						min = i-s1Last;
					}

				}
	
			}
		
		}
		if(s1Last!=-1 && s2Last!=-1)
		{
			System.out.println(min);
		}
		else
		{
			System.out.println("Values dont exist");
		}

		return min;

	}

}
