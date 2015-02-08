public class MinimumSub
{

	public static void main(String args[])
	{
		int ar[] = new int[args.length];
		for(int i=0;i<args.length;i++)
		{
			ar[i] = Integer.parseInt(args[i]);
		}
		
	}

	public static String minimum(String sentence, String target)
	{
		HashMap<Character> map = new HashSet<Character>();
		for(int i=0;i<target.length();i++)
		{
			if(map.containsKey(target.charAt(i)))
			{
				map.put(target.charAt(i),map.get(target.charAt(i))+1);
			}
			else
			{
				map.put(target.charAt(i),1);
			}
		}
		
		HashSet<Character> done = new HashSet<Character>();
		int startIndex=0;
		int endIndex =0;
		int found =0;
		for(int i=0;i<sentence.length();i++)
		{
			if(map.contains(sentence.charAt(i)))
			{
				found++;
			}
			else
			{
				startIndex++;
			}
			
			if(found==word.length)
			{
				// the word is complete, capture the length
				int len = i-startIndex;
			}
		}
					


	}

	public static void swap(int ar[],int a, int b)
	{
		int temp = ar[a];
		ar[a] = ar[b];
		ar[b]= temp;
	
	}


}
