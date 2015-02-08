public class DFS
{
	public static void DFS(Node n)
	{
		if(n==null)
		{
			return;
		}
		if(n.left!=null && !isVisited(n.left))
		{
			DFS(n.left);
		}
		if(n.right!=null && !isVisited(n.right))
		{
			DFS(n.right);
		}
		System.out.println(n.value);
	
	}

}
