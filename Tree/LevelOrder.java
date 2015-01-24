import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.*;
public class LevelOrder
{
	Node head;
	public static void main(String args[])
	{
		Integer ar11[] = {7,3,6,1,5,2,4,8};
                Integer ar22[] = {1,3,7,6,2,5,4,8};
		ArrayList<Integer> ar1 = new ArrayList<Integer>(Arrays.asList(ar11));
                ArrayList<Integer> ar2 = new ArrayList<Integer>(Arrays.asList(ar22));

		Construct c1 = new Construct();
		LevelOrder lOrder= new LevelOrder(c1.constructTree(ar1,ar2));
		lOrder.levelOrder();
			
		
	}
	public LevelOrder(Node n)
	{
		this.head =n;
	}
	public void levelOrder()
	{
		ArrayDeque<Node> que = new ArrayDeque<Node>();
		que.add(head);
		while(!que.isEmpty())
		{
			Node node = que.remove();
			System.out.println(node.value);
			if(node.left!=null)
			{
				que.add(node.left);
			}
			if(node.right!=null)
			{
				que.add(node.right);
			}
		}
		
	
	}

}
