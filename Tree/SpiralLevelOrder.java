import java.util.ArrayDeque;
public class SpiralLevelOrder
{
	public static void main(String args[])	
	{
		Tree t = Tree.getTree();
		printSpiral(t);
		
	}
	public static void printSpiral(Tree t)
	{
		Node root = t.root;
		ArrayDeque<Node> que1 = new ArrayDeque<Node>();
		ArrayDeque<Node> que2 = new ArrayDeque<Node>();
		
		que1.push(root);
		while(que1.size()!=0 || que2.size()!=0)
		{
			while(que1.size()!=0)
			{
				Node n = que1.pop();
				System.out.println(n.value);
				if(n.left!=null)
					que2.push(n.left);
				if(n.right!=null)
					que2.push(n.right);
					
			}
			while(que2.size()!=0)
			{
				Node n = que2.pop();
				System.out.println(n.value);
				if(n.right!=null)
					que1.push(n.right);
				if(n.left!=null)
					que1.push(n.left);
			}
		}	
	
	}

}
