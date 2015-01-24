import java.util.ArrayDeque;
class Construct2
{
	class Node
	{
		char val;
		Node left;
		Node right;
		
		public Node(char c)
		{
			this.val =c;
		}
	}
	public static void main(String args[])
	{
		StringBuffer preOrder = new StringBuffer(args[0]);
		StringBuffer inOrder = new StringBuffer(args[1]);
		Construct2 inst = new Construct2();
		Node root = inst.constructTree(preOrder,inOrder);
		inst.levelOrder(root);
	}
	public void levelOrder(Node n)
        {
                ArrayDeque<Node> q = new ArrayDeque<Node>();
                q.add(n);
                while(!q.isEmpty())
                {
                        Node current = q.remove();
                        System.out.println(current.val);
                        if(current.left!=null)
                        {
                                q.add(current.left);
                        }
                        if(current.right!=null)
                        {
                                q.add(current.right);
                        }

                }

        }

	
	public Node constructTree(StringBuffer preOrder,StringBuffer inOrder)
	{
		if(preOrder.length()==0|| inOrder.length()==0)
		{
			return null;
		}
		else
		{
			char val = preOrder.charAt(0);
			int n = inOrder.toString().indexOf(val);
			if(n==-1)
			{
				return null;
			}
			preOrder.deleteCharAt(0);
			StringBuffer s1 = new StringBuffer(inOrder.substring(0,n));
			StringBuffer s2 = new StringBuffer(inOrder.substring(n+1));
			Node root = new Node(val);
			root.left = constructTree(preOrder,s1);
			root.right = constructTree(preOrder,s2);
			return root;
			
		}
	}

}
