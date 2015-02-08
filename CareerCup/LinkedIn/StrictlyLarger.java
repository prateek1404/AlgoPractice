import java.util.Arrays;
public class StrictlyLarger
{
	public static void main(String args[])
	{
	System.out.println(smallestChar(args[0],'c'));

	}
	
	public static char smallestChar(String word,char ch)
	{
		char ar[] = word.toCharArray();

		Arrays.sort(ar);

		int start =0;
		int end = ar.length-1;
		while(start<end)
		{
			int mid = (start+end)/2;
			if(mid==0)
			{
				if(ar[mid]>ch)
				{
					return ar[mid];
				}
			}	
			if(mid==ar.length-1)
			{
				if(ar[mid]<ch)
				{
					return ar[0];
				}

			}
			if(ar[mid]>=ch && ar[mid-1]<ch)
			{
				return ar[mid];
			}
			else if(ar[mid]>ch)
			{
				end = mid-1;

			}
			else
			{
				start = mid+1;
			}

		}
		return ar[0];
		
		
		

	}
	

}
