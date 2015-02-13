public class SumTree
{
	public static void main(String args[])
	{
		Tree tree = Tree.getTree();
		convert(tree.root);
	}
	private static int sum=0;
	
	public static void convert(Node root)
	{
		if(root==null)
		{
			return;
		}
		convert(root.right);
		root.value = sum;
		sum+=root.value;
		convert(root.left);

	}
	
	

}
