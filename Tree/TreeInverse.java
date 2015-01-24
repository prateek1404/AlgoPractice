public class TreeInverse
{
	public static void main(String args[])
	{
		Node n = new Node(1);
		n.left= new Node(2);
		n.right =new Node(3);
		n.left.left= new Node(4);
		n.left.right = new Node(5);
		n.left.left.left= new Node(6);
		n.left.left.right = new Node(7);
		Tree t = new Tree(n);
		
		BFS.BFS(t.root);
		Node n1 = inverse(t.root);
		n1.left = null;
		n1.right = null;
		BFS.BFS(rootTree);
		//System.out.println(rootTree.value);

	}
	public static Node rootTree;

	public static Node inverse(Node n)
	{
		if(n == null)
		{
			return null;
		}
		if(n.left!=null)
		{
			if(n.left.left==null && n.left.right==null)
			{
				//bottom case
				rootTree = n.left;
				rootTree.left = n.right;
				rootTree.right = n;
				return rootTree.right;
			}

		}
		Node root = inverse(n.left);
		root.left = n.right;
		root.right = n;
		return root.right;
	}


}
