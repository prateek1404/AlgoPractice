import java.util.HashMap;
public class Adjacent
{
	public static int count=0;
	public static HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
	public static void main(String args[])
	{
		
		for(int i=0;i<args.length;i++)
		{
			map.put(i,Integer.parseInt(args[i]));
			count+=Integer.parseInt(args[i]);
		}
		int ar[] = new int[count];	
		for(int i=0;i<ar.length;i++) ar[i]=-1;
		adjacent(0,ar,count);
		
	}
	
	public static void adjacent(int index,int ar[],int n)
	{
		if(n==0)
		{
			for(int i:ar)
			{
				System.out.print(i+" ");
			}
			System.out.println("");
			count = (count+1)%(int)(Math.pow(10,7)+9);
		}

		for(int i=0;i<4;i++)
		{
			if(index==0 ||i!=ar[index-1])
			{
				if(map.get(i)==0)
				{
					continue;
				}
				map.put(i,map.get(i)-1);
				ar[index]=i;
				adjacent(index+1,ar,n-1);
				map.put(i,map.get(i)+1);
			}			
		}
		
	}

}
