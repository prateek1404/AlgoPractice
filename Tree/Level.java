import java.util.ArrayDeque;
public class Level
{
	public static void main(String args[])
	{
		Tree t = Tree.getTree();
		levelPrint(t.root);

	}

	public static void levelPrint(Node root)
	{

		ArrayDeque<Node> que1 = new ArrayDeque<Node>();
		ArrayDeque<Node> que2 = new ArrayDeque<Node>();
		
		que1.add(root);
		while(que1.size()!=0 || que1.size()!=0)
		{
			while(que1.size()>0)
			{
				Node node = que1.remove();
				System.out.print(node.value+" ");
				if(node.left!=null)
				{
					que2.add(node.left);
				}
				if(node.right!=null)
				{
					que2.add(node.right);
				}
				
			}
			System.out.println("");
			while(que2.size()>0)
                        {
                                Node node = que2.remove();
                                System.out.print(node.value+" ");
                                if(node.left!=null)
                                {
                                        que1.add(node.left);
                                }
                                if(node.right!=null)
                                {
                                        que1.add(node.right);
                                }
                        }
			System.out.println("");

		}

	}


}
