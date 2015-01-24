import java.util.ArrayList;
public class CustomHashMap<T1,T2>
{
	private class Node<T1,T2>
	{
		T1 key;
		T2 value;
		public Node(T1 key, T2 value)
		{
			this.key =key;
			this.value= value;
		}
	}
	private class Head
	{
		int size;
		ArrayList<Node<T1,T2>> list;
		
		public Head(int size)
		{
			this.size = size;
			list = new ArrayList<Node<T1,T2>>();
		}		
	}

	private ArrayList<Head> heads;
	private int size;
	public CustomHashMap(int size)
	{
		heads = new ArrayList<Head>(size);
		for(int i=0;i<size;i++)
		{
			heads.add(i,new Head(0));
		}
	}
	public void put(T1 key, T2 value)
	{
		int headId = key.hashCode()%size;
		heads.get(headId).list.add(new Node<T1,T2>(key,value));

	}
	

}
