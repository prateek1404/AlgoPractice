import java.util.*;
public class Groups
{
	public static void main(String args[])
	{
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<args.length;i=i+2)
		{
			map.put(Integer.parseInt(args[i]),Integer.parseInt(args[i+1]));
	
		}
		groups(map);

	}
	
	public static void groups(HashMap<Integer,Integer> map)
	{
		ArrayList<ArrayList<Integer>> groups = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> list;
		HashSet<Integer> visited = new HashSet<Integer>();
		for(int key:map.keySet())
		{
			if(!visited.contains(key))
			{
				list = new ArrayList<Integer>();
				DFS(map,list,visited,key);
				System.out.println("new group");
				groups.add(list);
			}
		}
		for(ArrayList<Integer> group : groups)
		{
			System.out.println("Group");
			for(int i:group)
			{
				System.out.println(i);
			}	
		}
		
	}

	public static void DFS(HashMap<Integer,Integer> map,ArrayList<Integer> list, HashSet<Integer> visited,int key)
	{
			visited.add(key);
			list.add(key);
			if(map.containsKey(key))
				DFS(map,list,visited,map.get(key));
	}

}
