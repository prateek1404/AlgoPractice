public class CommonAncestor
{
	public static void main(String args[])
	{
		Tree t = Tree.getTree();
		Level.levelPrint(t.root);
		System.out.println("Answer");
		System.out.println(commonAncestor(t.root,10,7).value);

	}
	
	public static Node commonAncestor(Node root, int value1, int value2)
	{
		if(root==null)
		{
			return null;
		}
		if(root.value == value1 || root.value==value2)
		{
			return root;
		}
		if(find(root.left,value1) && find(root.left,value2))
		{
			return commonAncestor(root.left,value1,value2);
		}
		else if(find(root.right,value1)&& find(root.right,value2))
		{
			return commonAncestor(root.right,value1,value2);
		}
		else
		{
			return root;
		}
		
			

	}

	public static boolean find(Node n, int value)
	{
		if(n==null)
		{
			return false;
		}
		if(n.value == value)
		{
			return true;
		}
		else
		{
			return find(n.left,value)|| find(n.right,value);
		}

	}

}
