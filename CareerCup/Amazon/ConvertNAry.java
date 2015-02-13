public class ConvertNAry
{
		public static ArrayList convert(Node n)
		{
			if(n==null)
			{
				return new ArrayList();
			}
			if(n.left==null && n.right==null)
			{
				ArrayList<Node> list = new ArrayList<Node>();
				list.add(n);
				return list;
			}
			ArrayList<Node> result = new ArrayList<Node>();
			for(Node n:children)
				result.addAll(convert(n));
			result.add(n);
			return result;
		}


}
