import java.util.Arrays;
public class Isomorphs
{
	public static void main(String args[])
	{
		System.out.println(isIso(args[0],args[1]));		

	}
	public static boolean isIso(String one, String two)
	{
		if(one.length()!=two.length())
		{
			return false;
		}
		int map1[] = new int[26];
		int map2[] = new int[26];
		for(int i=0;i<one.length();i++)
		{
			map1[one.charAt(i)-'a']+=1;
		}
		for(int i=0;i<two.length();i++)
                {
                        map2[two.charAt(i)-'a']+=1;
                }
		Arrays.sort(map1);
		Arrays.sort(map2);
		for(int i=0;i<map1.length;i++)
		{
			if(map1[i]!=map2[i])
			{
				return false;
			}
		}
		return true;


	}


}
