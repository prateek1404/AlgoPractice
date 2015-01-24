public class Split
{
public static void main(String args[])
{
	String abc = "abc:def:de;fe;lskjaflkdjs";
	String ar[] = abc.split(";",":");
	for(String i:ar)
	{
		System.out.println(i);
	}

}

}
