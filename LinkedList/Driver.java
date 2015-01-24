public class Driver
{
public static void main(String args[])
{
	Node n = new Node(5);
	LinkedList list = new LinkedList(n);
	list.insert(4);
	list.insert(6);
	list.printList();
	list.head= list.reverseList(list.head);
	list.printList();
}

}
