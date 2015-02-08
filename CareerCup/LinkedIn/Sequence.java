public class Sequence
{
	public static void main(String args[])
	{
		

	}	
	
	public static int totalN=0;
	public static void printArray(char ar[])
	{
		for(char c:ar)
		{
			System.out.print(c+" ");
		}

	}
	public static void printSequence(char ar[],char set[], int count[],int current)
	{
			if(current==totalN)
			{
				printArray(ar);
			}
			for(int i=0;i<set.length;i++)
			{
				if(set[i]!=ar[current-1] && count[i]!=0)
				{
					ar[current]=set[i];
					count[i]--;
					printSequence(ar,set,count,current+1);
					count[i]++;
				}
		
			}
			
	}


}
