public class InplaceReverse
{
	public static void main(String args[])
	{
		System.out.println(inPlace(args[0]));	
	}
	
	public static String inPlace(String s)
	{
		char ar[] = s.toCharArray();
		for(int i=0;i<ar.length/2;i++)
		{
			swap(ar,i,ar.length-i-1);
		}
		System.out.println(new String(ar));
		//Swap each word
		int start=0;
		int end =0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==' ')
			{
				swapWord(ar,start,end-1);
				start= i+1;
				end = i+1;
			}
			else
			{
				end++;
			}

		}
		swapWord(ar,start,end-1);
		return new String(ar);


	}
	public static void swapWord(char ar[], int start,int end)
	{
		while(start<end)
		{
			swap(ar,start,end);
			start++;
			end--;

		}

	}

	public static void swap(char ar[], int a, int b)
	{
		char temp = ar[a];
		ar[a] = ar[b];
		ar[b]= temp;
	}

}
