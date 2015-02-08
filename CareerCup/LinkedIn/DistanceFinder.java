public class DistanceFinder
{

	public static void main(String args[])
	{
			System.out.println(distance(args,"hello","world"));
		
	}
	public static int distance(String words[], String word1, String word2)
	{
		int lastWord1 =-1;
		int lastWord2 = -1;
		int minDiff = Integer.MAX_VALUE;
		for(int i=0;i<words.length;i++)
		{
			if(words[i].equals(word1))
			{
				lastWord1= i;
				if(lastWord2!=-1)
				{
					if(lastWord1-lastWord2<minDiff)
					{
						minDiff = lastWord1-lastWord2;
					}
				}
			}
			if(words[i].equals(word2))
			{
				lastWord2 =i;
				if(lastWord1!=-1)
				{
					if(lastWord2-lastWord1<minDiff)
					{
						minDiff = lastWord2-lastWord1;
					}
				}
				
			}
		
		}
		return minDiff;

	}

	public static void swap(int ar[],int a, int b)
	{
		int temp = ar[a];
		ar[a] = ar[b];
		ar[b]= temp;
	
	}


}
