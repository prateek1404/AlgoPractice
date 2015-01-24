import java.util.ArrayDeque;
import java.util.ArrayList;
public class LevelOrderSpaced
{
	public static void main(String args[])
	{
		Tree t = Tree.getTree();
		levelOrderSpaced(t.root);
	
	}
	public static void levelOrderSpaced(Node n)
	{
		ArrayList<Node> prev = new ArrayList<Node>();
		ArrayList<Node> current = new ArrayList<Node>();
		prev.add(n);
		
		
		while(prev.size()!=0)
		{
			current.addAll(prev);
			prev.clear();
			while(current.size()!=0)
			{
				Node n1 = current.remove(0);
				System.out.print(n1.value+" ");
				if(n1.left!=null)
					prev.add(n1.left);
				if(n1.right!=null)
					prev.add(n1.right);
			}
			System.out.println("");
		}
		

	}


}
