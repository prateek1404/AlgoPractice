import java.util.HashMap;
class SmallestWindow
{
	public static void main(String args[])
	{
	

	}
	public int smallestWindow(String s1, String s2)
	{	
		int size = 0;
		HashMap<Character,Integer> hp = new HashMap<Character,Integer>();
		for(int i =0; i<s1.length();i++)
		{	
			if(hp.containsKey(s1.charAt(i)))
			{
				hp.put(s1.charAt(i),(int)(hp.get(s1.charAt(i)))+1);
			}
		}
		for(int j=0;j<s2.length();j++)
		{
			
		}
		return size;
	}

}
