public class Loop
{

	public boolean loop(Node node)
	{
		if(node == null)
		{
			return false;
		}
		Node slow = node;
		Node fast = node;
		
		while(fast!=null && fast.next!=null)
		{
			slow = slow.next;
			fast = fast.next.next;
			if(slow==fast)
			{
				return true;
			}

		}
		return false;

	}


}
