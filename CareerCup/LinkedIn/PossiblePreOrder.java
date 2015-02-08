public class PossiblePreOrder
{
		public static void main(String args[])
		{
			int ar[] = new int[args.length];
			for(int i=0;i<ar.length;i++)
			{
				ar[i] = Integer.parseInt(args[i]);
			}
			System.out.println(num(ar,0,args.length-1));
		}

		public static int num(int ar[],int start, int end)
		{
			if(start>end)
			{
				return 1;
			}
			if(start==end)
			{
				return 1;
			}
			else
			{
				int sum=0;
				for(int i=start;i<=end;i++)
				{
					sum+=num(ar,start+1,i)*num(ar,i+1,end);
				}
				return sum;
	
			}


		}

}
