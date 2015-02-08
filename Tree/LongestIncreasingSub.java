import java.util.ArrayList;
public class LongestIncreasingSub
{

	public static void main(String args[])
	{
		int ar[] = new int[args.length];
		for(int i=0;i<args.length;i++)
		{
			ar[i] = Integer.parseInt(args[i]);
		}
		longestIncreasingSub(ar);
		
	}
	public static int longestIncreasingSub(int ar[])
	{
		ArrayList<Integer> indexes = new ArrayList<Integer>();

		int dp[] = new int[ar.length];
		
		dp[0] = ar[0];
		for(int i=1;i<ar.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(ar[j]<ar[i] && dp[i]<dp[j]+ar[i])
				{
					dp[i] = dp[j]+ar[i];
				}

			}
		}
		int largest =-1;
		for(int i=0;i<ar.length;i++)
		{
			if(largest<dp[i])
			{
				largest = dp[i];
			}
		}
		System.out.println(largest);

		return largest;

	}

	public static void swap(int ar[],int a, int b)
	{
		int temp = ar[a];
		ar[a] = ar[b];
		ar[b]= temp;
	
	}


}
