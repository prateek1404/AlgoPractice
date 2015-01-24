import java.util.ArrayList;
public class Test
{
	public static void main(String args[])
	{
		ArrayList<Integer> ar = new ArrayList<Integer>(10);
		ar.add(5,new Integer(67));
		System.out.println(ar.get(5));
		for(Integer i: ar)
		{
			System.out.println(i);
		}

	}

}
