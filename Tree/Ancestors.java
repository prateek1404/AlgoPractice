import java.util.ArrayList;
import java.util.Iterator;
public class Ancestors
{
	public static void main(String args[])
	{
		Tree t = Tree.getTree();
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(t.root.value);
		int input = Integer.parseInt(args[0]);
		if(getAncestors(t.root,ar,input))
		{
			Iterator<Integer> ir = ar.iterator();
			while(ir.hasNext())
			{
				System.out.println(ir.next());
			}
		}
		
	}
	public static boolean getAncestors(Node root,ArrayList<Integer> a, int value)
	{
		if(root.value==value)
		{
			a.remove(a.size()-1);
			return true;
			
		}
		if(root.left!=null)
		{
			a.add(root.left.value);
			if(getAncestors(root.left,a,value)==true)
			{
				return true;
			}
			else
			{
				a.remove(a.size()-1);
			}
		}
		if(root.right!=null)
		{
			a.add(root.right.value);
			if(getAncestors(root.right,a,value)==true)
			{
				return true;
			}
			else
			{
				a.remove(a.size()-1);
			}
		}
		return false;
	}
	
	

}
