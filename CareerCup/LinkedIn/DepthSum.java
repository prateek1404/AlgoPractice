import java.util.ArrayDeque;
import java.util.List;
interface NestedInteger
{
	boolean isInteger();
	Integer getInteger();
	List<NestedInteger> getList();
}
public class DepthSum
{
	public int depthSum(List<NestedInteger> input)
	{
		ArrayDeque<NestedInteger> prev = new ArrayDeque<NestedInteger>();
		ArrayDeque<NestedInteger> current = new ArrayDeque<NestedInteger>();
		int level=0;
		for(NestedInteger ni:input)
		{
			prev.add(ni);
		}
		int globalSum=0;
		while(prev!=null)
		{
			
			current.addAll(prev);
			prev.clear();
			int sum=0;
			while(current.size()!=0)
			{
				NestedInteger nestInt = prev.remove();
				if(nestInt.isInteger())
				{
					sum+=nestInt.getInteger();
				}
				else
				{
					prev.addAll(nestInt.getList());
				}
			}
			level++;
			globalSum+=sum*level;
		}
		return globalSum;		
	}
}
