import java.util.LinkedList;
import java.util.ListIterator;
public class MergeSort
{
	static class Node
	{
		int value;
		Node next;
		public Node(int value)
		{
			this.value= value;
		}
	}
	public static void main(String args[])
	{
		int ar[] = new int[args.length];
		LinkedList<Integer> linkList = new LinkedList<Integer>();
		Node prev = null;
		Node first=null;
		for(int i=0;i<args.length;i++)
		{
			ar[i] = Integer.parseInt(args[i]);
			Node n = new Node(ar[i]);
			if(prev!=null)
			{
				prev.next=n;
			}
			else
			{
				first =n;
			}
			prev = n;
		}
	//	mergeSort(ar,0,ar.length-1);
		Node head=mergeSort(first);
		printNodeList(head);
	//	printList(ar);
				
	}
	public static void printNodeList(Node n)
	{
		while(n!=null)
		{
			System.out.println(n.value);
			n = n.next;
		}
	}
	public static Node mergeSort(Node head)
	{
		if(head==null || head.next==null)
		{
			return head;
		}
		Node slow = head;
		Node fast = slow.next;
		while(fast!=null && fast.next!=null)
		{
			slow = slow.next;
			fast = fast.next.next;
		}
		Node head1= head;
		Node head2 = slow.next;
		slow.next = null;
		head1=mergeSort(head1);
		head2=mergeSort(head2);
		Node newHead= merge(head1,head2);
		return newHead;
		
	}
	public static Node merge(Node n1,Node n2)
	{
		System.out.println("Inside merge");
		if(n1==null && n2==null)
		{
			return null;
		}
		Node head=null;
		if(n1==null)
		{
			return n2;
		}
		if(n2==null)
		{
			return n1;
		}
		Node n3=null;
		while(n1!=null && n2!=null)
		{
			if(n1.value<n2.value)
			{
				if(head==null)
				{
					head=n1;
					n3= head;
				}
				else
				{
					Node temp = n1;
					n1 = n1.next;
					n3.next=temp;
					n3 = n3.next;
				}
			}
			else
			{
				if(head==null)
				{
					head=n2;
					n3 = head;
				}
				else
				{
					Node temp =n2;
					n2= n2.next;
					n3.next= temp;
					n3 = n3.next;
				}
			}
		}
		while(n1!=null)
		{
			n3.next= n1;
			n3 = n3.next;
			n1= n1.next;
		}
		while(n2!=null)
		{
			n3.next= n2;
			n3 = n3.next;
			n2 = n2.next;
		}
		
		return head;
	}
	
	public static void printList(int ar[])
	{
		for(int i:ar)
		{
			
			System.out.println(i);
		}
	
	}
	public static void mergeSort(int ar[], int start, int end)
	{
		if(start<end)
		{
			int mid = (start+end)/2;
			mergeSort(ar,start,mid);
			mergeSort(ar,mid+1,end);
			merge(ar,start,mid,end);

		}

	}
		
	public static void merge(int ar[],int start, int mid, int end)
	{	
		int temp[] = new int[ar.length];	
		for(int i=0;i<ar.length;i++)
		{
			temp[i]= ar[i];
		}

		int start1= start;
		int start2= mid+1;
		int k= start1;
		while(start1<=mid && start2<=end)
		{
			if(temp[start1]<temp[start2])
			{
				ar[k]= temp[start1];
				k++;
				start1++;
			}
			else
			{
				ar[k]= temp[start2];
				k++;
				start2++;
			}
		}
		while(start1<=mid)
		{
			ar[k]= temp[start1];
			start1++;
			k++;
		}
		while(start2<=end)
		{
			ar[k]=temp[start2];
			start2++;
			k++;
		}
		
	}

}
