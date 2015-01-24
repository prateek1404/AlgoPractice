public class LeafCount
{
	public static void main(String args[])
	{
		Tree t = Tree.getTree();
		countLeaves(t.root);
		System.out.println(leafCount);

	}
	private static int leafCount =0;
	
	public static void countLeaves(Node n)
	{
		if(n==null)
		{
			return;
		}
		if(n.left==null && n.right==null)
		{
			leafCount++;
		}
		countLeaves(n.left);
		countLeaves(n.right);
		
		
	}

}
