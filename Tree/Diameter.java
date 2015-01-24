public class Diameter
{
	public static void main(String args[])
	{
		Tree t = Tree.getTree();
		System.out.println(getDiameter(t.root));
	
	}
	public static int getDiameter(Node n)
	{
		if(n==null)
		{
			return 0;
		}
		int val1 = getDiameter(n.left);
		int val2= getDiameter(n.right);
		int val3 = 1+ depth(n.left)+depth(n.right);
		int max = val1>val2?val1:val2;
		 max = val3>max?val3:max;
		return max;
		
	}
	public static int depth(Node n)
	{
		if(n==null)
		{
			return 0;
		}
		int depthLeft = depth(n.left);
		int depthRight = depth(n.right);
		int depth = depthLeft>depthRight?depthLeft:depthRight;
		return depth+1;
	}
}
