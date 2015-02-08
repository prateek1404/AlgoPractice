public class Game
{
	public static void main(String args[])
	{
		int ar[] = new int[args.length];
		for(int i=0;i<args.length;i++)
		{
			ar[i] = Integer.parseInt(args[i]);
		}
		System.out.println(strategy(ar));
	}

	public static int strategy(int ar[])
	{
		int mymove[][] = new int[ar.length][ar.length];
		int opmove[][] = new int[ar.length][ar.length];
		
		for(int i=0;i<ar.length;i++)
		{
			mymove[i][i]=ar[i];
			opmove[i][i] =ar[i];
		}

		for(int i=0;i<ar.length-1;i++)
		{
			mymove[i][i+1] = ar[i]>ar[i+1]?ar[i]:ar[i+1];
			opmove[i][i+1] = mymove[i][i+1];
		
		}
		for(int i=0;i<ar.length-2;i++)
		{
			mymove[i][i+1] = max(ar[i],ar[i+1],ar[i+2]);

		}
		
		for(int L=2;L<=ar.length;L++)
		{
			for(int i=0;i<ar.length-L+1;i++)
			{
				int j = i+L-1;
				if(opmove[i][j-1]>opmove[i+1][j])
				{
					mymove[i][j] = ar[i]+min(mymove[i+2][j],mymove[i+1][j-1]);
				}
				else
				{
					if(j-2>=0 && j-1>=0)
						mymove[i][j] = ar[j]+min(mymove[i][j-2],mymove[i+1][j-1]);
					else
					{
						if(j-2<0)
						{
							if(j>=1)
							{
								mymove[i][j] = ar[j]+mymove[i+1][j-1];	
							}
							else
							{
								
							}
						}
						else
						{
								
						}
							
					}
				}

				if(mymove[i][j-1]>mymove[i+1][j])
                                {
                                        opmove[i][j] = ar[i]+min(opmove[i+2][j],opmove[i+1][j-1]);
                                }
                                else
                                {

                                        opmove[i][j] = ar[j]+min(opmove[i][j-2],opmove[i+1][j-1]);
                                }

			}

		}
		return mymove[0][ar.length-1];

	}

	public static int min(int a, int b)
	{
		return a>b?a:b;
	}


}
