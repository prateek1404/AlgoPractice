public class Strcmp
{
	public static void main(String args[])
	{
		System.out.println(strcmp(args[0],args[1]));
	
	}
	public static int strcmp(String s1,String s2)
	{
		int i=0;
		int j=0;
		int dif =0;
		while(i< s1.length() && i<s2.length() && s1.charAt(i)==s2.charAt(i))
		{
			i++;
		}
		if(i<s1.length()-1 && i<s2.length()-1)
			return s1.charAt(i)-s2.charAt(j);
		else
			return 0;

	}

}
