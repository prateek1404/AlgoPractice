import java.util.*;
public class OddCount
{
	public static void main(String args[])
	{
		int ar[] = new int[args.length];
		for(int i=0;i<args.length;i++)
		{
			ar[i] = Integer.parseInt(args[i]);
		}
		oddCount(ar);
		

	}
	
	public static void oddCount(int ar[])
	{
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<ar.length;i++)
		{
			if(map.containsKey(ar[i]))
			{
				map.put(ar[i],map.get(ar[i])+1);
			}
			else
			{
				map.put(ar[i],1);
			}
		}
		for(int key:map.keySet())
		{
			if(map.get(key)%2!=0)
			{
				System.out.println(key);
			}
		}


	}


}
