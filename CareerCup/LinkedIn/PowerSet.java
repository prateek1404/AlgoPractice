import java.math.*;
import java.util.ArrayList;
public class PowerSet
{
	public static void main(String args[])
	{
		ArrayList<ArrayList<String>> powerSet = powerSet(args);	
		for(ArrayList<String> set:powerSet)
		{
			for(String member:set)
			{
				System.out.print(member+ " ");
			}
			System.out.println("");
		
		}
	}
	public static ArrayList<ArrayList<String>> powerSet(String ar[])
	{
		ArrayList<ArrayList<String>> powerSet = new ArrayList<ArrayList<String>>();
		ArrayList<String> set;	
		HashSet<String> hs = new HashSet<String>();
		for(int i=0;i<Math.pow(2,ar.length);i++)
			{
				int num =i;
				 set = new ArrayList<String>();
				for(int j=0;j<ar.length;j++)
				{
					if((num & 1)==1)
					{
						set.add(ar[j]);
					}
					num = num>>1;
				}
				Collections.sort(set);
				StringBuilder builder = new StringBuilder("");
				for(Strings s: set)
				{
					builder.append(s)
				}	
				if(!has.contains(builder.toString()))
					powerSet.add(set);
					hs.add(builder.toString());
				
				
			}
		return powerSet;

	}

}
