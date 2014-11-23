class Node
{
int value;
Node next;
public Node(int val)
{
this.value =val;
}
}
class LinkedList
{
public static void main(String args[])
{
Node n1 = new Node(1);
Node n2 = new Node(2);
Node n3 = new Node(3);
Node n4 = new Node(4);
Node n5 = new Node(5);
Node n6 = new Node(6);
Node n7 = new Node(7);
Node n8 = new Node(8);

n1.next=n2;
n2.next=n3;
n3.next=n4;
n4.next=n5;
n5.next=n6;
n6.next=n7;
n7.next=n8;
LinkedList l = new LinkedList();
l.printList(n1);
Node nrev = l.reverse(n1);
l.printList(nrev);
}
public void printList(Node n)
{
 if(n!=null)
 {
   System.out.println(n.value);
 printList(n.next);
 }
}
public Node reverse(Node n1)
{
   if(n1==null)
   {
     return null;
   }
   Node current = n1;
   Node forward = n1.next;
   Node temp = forward.next;
   forward.next = current;
   forward.next.next= reverse(temp);
   return forward;
}
}
