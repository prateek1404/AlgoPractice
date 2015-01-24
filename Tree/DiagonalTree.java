import java.util.ArrayDeque;
public class DiagonalTree
{
	public static void main(String args[])
	{
		DiagonalTree diag = new DiagonalTree();
		Tree tree = Tree.getTree();
		diag.calculateSum(tree);
	}
	public void calculateSum(Tree tree)
	{
		ArrayDeque<Node> que1 = new ArrayDeque<Node>();
		ArrayDeque<Node> que2 = new ArrayDeque<Node>();
		que1.add(tree.root);
		while(!(que1.size()==0 && que2.size()==0))
		{
			while(que1.size()!=0)
			{
				Node n = que1.remove();
				que2.add(n);
				Node rn = n;
				while(rn.right!=null)
				{
					que2.add(rn.right);
					rn = rn.right;
				}
		
			}
			int sum=0;
			while(que2.size()!=0)
			{
				Node n = que2.remove();
				sum+=n.value;
				//System.out.println(n.value);
				if(n.left!=null)
				{
					que1.add(n.left);
				}	
			}
			System.out.println(sum);
		}
	
	}

}
