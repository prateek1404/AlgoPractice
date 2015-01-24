import java.util.ArrayDeque;
public class BFS
{
	public static void main(String args[])
	{
		BFS(Tree.getTree().root);

	}
	public static void BFS(Node root)
	{
		ArrayDeque<Node> que = new ArrayDeque<Node>();
		que.add(root);
		while(que.size()!=0)
		{
			Node n = que.remove();
			System.out.println(n.value);
			if(n.left!=null)
			{
					que.add(n.left);

			}
			if(n.right!=null)
			{
					que.add(n.right);
			}
		}

	}

	

}
