
public class CustomHashMap
{
	public class Node
	{
		int key;
		Object value;
		Node next;
		public Node(int key, Object val)
		{
			this.key = key;
			this.value = val;
		}

	}
	public class Head
	{
		Node first;
		Node last;
		int size;
	}
	private Head []ar = new Head[1000];
	
	public CustomHashMap()
	{


	}
	public void put(int key, Object o)
	{
		int headIndex = key%1000;
		insert(ar[headIndex],key,o);
	}
	public void insert(Head head,int key, Object o)
	{
		if(head.first==null)
		{
			head.first = new Node(key,o);
			head.last = head.first;
		}
		else
		{
			head.last.next = new Node(key,o);
		}
	
	}

	public Object fetch(int key)
	{
		return null;
	}

}
