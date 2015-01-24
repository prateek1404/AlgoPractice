import java.util.ArrayDeque;
class Node
{
	public Node(int value)
	{
		this.value = value;
	}
	int value;
	Node left;
	Node right;
}

public class Tree
{
	Node root;
	public Tree(Node root)
	{
		this.root = root;
	}
	
	public static void main(String args[])
	{
		Node root = new Node(5);
		Tree bst = new Tree(root);
		bst.root=bst.insert(bst.root,2);
		bst.root =bst.insert(bst.root,3);
		bst.root = bst.insert(bst.root,4);
		bst.root= bst.insert(bst.root,1);
		bst.root = bst.insert(bst.root,6);
		bst.root =bst.insert(bst.root,7);
		bst.root =bst.insert(bst.root,8);
		bst.root = bst.insert(bst.root,9);
		bst.root =bst.insert(bst.root,10);
		bst.BFS(bst);		
	}
	public static Tree getTree()
	{
		Node root = new Node(5);
		Tree bst = new Tree(root);
                bst.root=bst.insert(bst.root,2);
                bst.root =bst.insert(bst.root,3);
                bst.root = bst.insert(bst.root,4);
                bst.root= bst.insert(bst.root,1);
                bst.root = bst.insert(bst.root,6);
                bst.root =bst.insert(bst.root,7);
                bst.root =bst.insert(bst.root,8);
                bst.root = bst.insert(bst.root,9);
                bst.root =bst.insert(bst.root,10);
		return bst;
	}
	
	public void BFS(Tree t)
	{
		ArrayDeque<Node> que = new ArrayDeque<Node>();
		que.add(t.root);
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
	
	public Node insert(Node root,int val)
	{
		if(root==null)
		{
			return new Node(val);
		}
		else
		{
			if(root.value>val)
			{
				root.left = insert(root.left,val);
			}
			else
			{	
				root.right = insert(root.right,val);
			}
		}
		return root;
	}

}
