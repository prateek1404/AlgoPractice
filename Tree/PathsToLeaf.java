import java.util.ArrayList;
import java.util.Iterator;
public class PathsToLeaf
{
	ArrayList<String> paths = new ArrayList<String>();
	public static void main(String args[])
	{
		Tree t = Tree.getTree();
		ArrayList<String> list = paths(t.root);
		Iterator<String> it = list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}
	public static ArrayList<String> paths(Node n)
	{
		if(n.left==null && n.right==null)
		{
			ArrayList<String> empty = new ArrayList<String>();
			empty.add(String.valueOf(n.value));
			return empty;	
		}
		
		ArrayList<String> leftPaths=null;
		if(n.left!=null)
			leftPaths =paths(n.left);
		ArrayList<String> rightPaths=null;
		if(n.right!=null)
			rightPaths= paths(n.right);
		ArrayList<String> mylist = new ArrayList<String>();
		if(leftPaths!=null)
		{
		Iterator<String> itr1 = leftPaths.iterator();
		while(itr1.hasNext())
		{
			mylist.add(String.valueOf(n.value)+" "+itr1.next());
		}
		}
		if(rightPaths!=null)
		{
			Iterator<String> itr2 = rightPaths.iterator();
		while(itr2.hasNext())
		{
			mylist.add(String.valueOf(n.value)+" "+itr2.next());
		}
		}
		return mylist;
		
		
	}


}
