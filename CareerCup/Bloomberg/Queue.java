import java.util.Deque;
import java.util.ArrayDeque;

public class Queue
{
	ArrayDeque stack1 = new ArrayDeque();
	ArrayDeque stack2 = new ArrayDeque();

	public void add(Object a);
	{
		stack1.addFirst(a);

	}
	public Object remove()
	{
		while(stack1.hasNext())
		{
			stack2.addFirst(stack1.removeFirst());
		}
		Object toReturn= stack2.removeFirst();
		while(stack2.hasNext())
		{
			stack1.addFirst(stack2.removeFirst());
		}

	}


}