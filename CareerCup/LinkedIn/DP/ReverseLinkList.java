public class ReverseLinkList
{
	public static void main(String args[])
	{

	}

	public static Node reverse(Node head)
	{
		
		while(head!=null)
		{
			Node temp = head.next;
			head.next = head.prev;
			head.prev = temp;
			head = temp;

		}


	}
	public static Node reverse(Node head)
	{
			if(head.next==null)
			{
				headNew = head;
				return head;
			}
			Node n = reverse(head.next);
			n.next = head;
			head.prev = n;
			return head;

	}


}
