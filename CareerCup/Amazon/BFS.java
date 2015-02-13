public class BFS
{
	public static void main(String args[])
	{

	}

	public static void BFS(Node n)
	{
		ArrayDeque<Node> que = new ArrayDeque<Node>();
		que.add(n);
		while(que.size()!=0)
		{
			Node current = que.remove();
			System.out.println(current.value);
			if(current.left!=null)
				que.add(current.left);
			if(current.right!=null)
				que.add(current.right);
		}


	}

}
