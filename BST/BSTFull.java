class Node
{
	int value;
	Node left;
	Node right;
	public Node(int value)
	{
		this.value = value;
	}
}

public class BSTFull
{
	Node root;

	public static void main(String args[])
	{
		Node n = new Node(1);
		BSTFull bst = new BSTFull(n);
		bst.insert(bst.root,2);
		bst.insert(bst.root,3);
	}

	public BSTFull(Node root)
	{
		this.root = root;
	}
	
	public Node insert(Node root,int newVal)
	{
		if(root==null)
		{
			return new Node(newVal);
		}
		else
		{
			if(root.value>newVal)
			{
				root.left = insert(root.left,newVal);
			}
			else
			{
				root.right = insert(root.right,newVal);
			}

		}
		return root;
		
	}
	public Node delete(Node root,int val)
	{
		if(root==null)
		{
			return null;
		}
		if(root.value==val)
		{
			Node left = root.left;
			Node right = root.right;
			if(left==null && right==null)
			{
				return null;
			}
			else
			{
				if(left!=null && right==null)
				{
					return left;
				}
				else if (right!=null && left ==null)
				{
					return right;
				}
				else
				{
					Node n= findLeftMost(right);
					delete(right,n.value);
					return n; 
				}
				

			}
		
		}
		else if (root.value<val)
		{

			root.right = delete(root.right,val);
		}
		else
		{
			root.left = delete(root.left,val);
		}
		return root;
	}
	public Node findLeftMost(Node n)
	{
		if(n==null)
		{
			return null;
		}
		while(n.left!=null)
		{
			n = n.left;
		}	
		return n;

	}

}
