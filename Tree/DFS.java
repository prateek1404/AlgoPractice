public class DFS
{
	public static void main(String args[])
	{
		Tree t = Tree.getTree();
		DFS(t.root);
	}
	
	public static void DFS(Node n)
	{
		if(n==null)
		{
			return;
		}
		DFS(n.left);
		System.out.println(n.value);
		DFS(n.right);

	}
}
