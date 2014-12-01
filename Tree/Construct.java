import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.ArrayDeque;
class Node
{
	public Node(int value)
	{
		this.value = value;
	}
	int value;
	Node left;
	Node right;
}
public class Construct
{
	public static void main(String args[])
	{
		Integer ar11[] = {7,3,6,1,5,2,4,8};
		Integer ar22[] = {1,3,7,6,2,5,4,8};
		ArrayList<Integer> ar1 = new ArrayList<Integer>(Arrays.asList(ar11));
		ArrayList<Integer> ar2 = new ArrayList<Integer>(Arrays.asList(ar22));
		Construct c = new Construct();
		Node n= c.constructTree(ar1,ar2);
		c.levelOrder(n);
	}
	public void levelOrder(Node n)
	{
		ArrayDeque<Node> q = new ArrayDeque<Node>();
		q.add(n);
		while(!q.isEmpty())
		{
			Node current = q.remove();
			System.out.println(current.value);
			if(current.left!=null)
			{
				q.add(current.left);
			}
			if(current.right!=null)
			{
				q.add(current.right);
			}

		}

	}
	public Node constructTree(ArrayList<Integer> ar1,ArrayList<Integer> ar2)
	{
		if(ar1.size()==0 || ar2.size()==0)
		{
			return null;
		}
		int root = ar2.get(0);
		ar2.remove(ar2.get(0));
		int j =0;
		ArrayList<Integer> newList1 = new ArrayList<Integer>();
		ArrayList<Integer> newList2 = new ArrayList<Integer>();
		while(j<ar1.size())
		{
			if(ar1.get(j).intValue()==root)
			{
				break;
			}
			newList1.add(ar1.get(j));
			j=j+1;
		}
		j=j+1;
		while(j<ar1.size())
		{
			newList2.add(ar1.get(j));
			j++;
		}
		Node n = new Node(root);
		n.left= constructTree(newList1,ar2);
		n.right = constructTree(newList2,ar2);
		return n;
	}

}
