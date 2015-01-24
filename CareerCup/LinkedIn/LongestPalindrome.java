public class LongestPalindrome
{
	public static void main(String args[])
	{
		String palindrome = longestPalindrome(args[0]);
		longestPalSequence(args[0]);
		System.out.println(palindrome);
	}
	public static String longestPalSequence(String s)
	{
		System.out.println("Printing :"+s);
		char ar[] = s.toCharArray();
		
		int DP[][] = new int[ar.length][ar.length];
		boolean exists[][] = new boolean[ar.length][ar.length];
		
		for(int i=0;i<ar.length;i++)
		{
			exists[i][i] = true;
			DP[i][i] =1;
		}

		for(int i=0;i<ar.length-1;i++)
		{
			if(ar[i]==ar[i+1])
			{
				DP[i][i+1] =2;
				exists[i][i+1]=true;
			}
			else{
				DP[i][i+1]=1;
			}
		}

		for(int L=3;L<=ar.length;L++)
		{
			
			for(int i=0;i<ar.length-L+1;i++)
			{
				int j = i+L-1;
				
				if(ar[i]==ar[j])
				{
					DP[i][j]=DP[i+1][j-1]+2;
					exists[i][j]=true;
				}
				else if(ar[i]==ar[j-1] ||ar[i+1]==ar[j])
				{
					int max= -1;
					boolean existsP = false;
					if(ar[i]==ar[j-1] && (j==i+2 || exists[i+1][j-2]))
					{
						existsP = true;
						if(j==i+2)
						{
							max = 2;
						}
						else{
							if(max<DP[i+1][j-2]+1)
								max = DP[i+1][j-2]+2;
						}
					}

					if(ar[i+1]==ar[j] && (j==i+2 ||exists[i+2][j-1]))
					{
						existsP = true;
						if(j==i+2)
						{
							max = 2;
						}
						else
						{	
							if(max<DP[i+2][j-1]+1)
								max = DP[i+2][j-1]+2;
						}
					}
					if(existsP==true)
					{
						exists[i][j]=true;
						DP[i][j]=max;
					}
	
				}
				else
				{
					exists[i][j]= exists[i+1][j] || exists[i][j-1];
					int max = DP[i+1][j]>DP[i][j-1]?DP[i+1][j]:DP[i][j-1];
					
					DP[i][j]= max;

				}

			
			}

		}
		System.out.println(DP[0][ar.length-1]);

		return s;
	}
	
	public static String longestPalindrome(String s)
	{
		char ar[] = s.toCharArray();
		int DP[][] = new int[ar.length][ar.length];
		boolean isPal[][] = new boolean[ar.length][ar.length];
		
		for(int i=0;i<ar.length;i++)
		{
			isPal[i][i]=true;
			DP[i][i]=1;
		}
		for(int i=0;i<ar.length-1;i++)
		{
			if(ar[i]==ar[i+1])
			{
				isPal[i][i+1] = true;
				DP[i][i+1] = 2;
			}
		}
		for(int L=3;L<ar.length;L++)
		{
			for(int i=0;i<ar.length-L+1;i++)
			{
				int j = i+L-1;
				if(ar[i]==ar[j] && isPal[i+1][j-1])
				{
					isPal[i][j] = true;
					DP[i][j] = DP[i][j]+2;
				}
				else
				{
					isPal[i][j] = false;
					DP[i][j] = DP[i+1][j-1];
				}
	
			}
		}
		int max = 1;
		int maxi= 0;
		int maxj =0;
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar.length;j++)
			{
				if(DP[i][j]>max && isPal[i][j]==true)
				{
					max = DP[i][j];	
					maxi = i;
					maxj = j;	
				}

			}
		}
		return s.substring(maxi,maxj+1);
		

	}


}
