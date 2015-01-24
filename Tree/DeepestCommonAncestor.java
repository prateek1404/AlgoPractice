public class DeepestCommonAncestor
{
	public static Node deepestCommonAncestor(Node root,Node n1,Node n2)
	{

		if(root==n1 || root == n2)
		{
			return root;
		}

		if(find(root.left,n1) && find(root.left,n2))
		{
			return deepestCommonAncestor(root.left,n1,n2);
		}
		if(find(root.right,n1) && find(root.right,n2))
		{
			return deepestCommonAncestor(root.right,n1,n2);
		}
		else
		{
			return root;
		}

	}
	public static boolean find(Node root,Node n1)
	{
		if(root==null)
		{
			return false;
		}
		if(root == n1)
		{
			return true;
		}
		else
		{
			return find(root.left,n1) || find(root.right,n1);
		}

	}

	public static Node efficientLCA(Node root, Node n1, Node n2)
	{
			if(root==null)
			{
				return null;
			}
			if(root==n1 && root == n2)
			{
				return root;
			}
			if(root==n1 || root == n2)
			{
				return n1;
			}
			Node left = efficientLCA(root.left,n1,n2);
			Node right = efficientLCA(root.right,n1,n2);
			if(left==null && right!=null)
			{
				return right;
			}
			else if(left!=null && right==null)
			{
				return left;
			}
			else if(left!=null && right!=null)
			{
				return root;
			}
			else
			{
				return null;
			}

	}

}
