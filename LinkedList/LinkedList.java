class Node
{
	int value;
	Node next;
	public Node(int value)
	{
		this.value = value;
	}
	
}
class LinkedList
{
	Node head;
	
	public LinkedList(Node head)
	{
		this.head= head;
	}
	public void insert(int k)
	{
		Node head = this.head;
		while(head.next!=null)
		{
			head = head.next;
		}
		head.next = new Node(k);
	}
	public void printList()
	{
		Node head = this.head;
		while(head!=null)
		{
			System.out.println(head.value);
			head = head.next;
		}
	
	}
	public Node reverseList(Node head)
	{
		if(head.next==null)
		{
			return head;
		}
		Node right = head.next;
		head.next = null;
		Node temp = reverseList(right);
		right.next = head;
		return temp;
	}	

}

