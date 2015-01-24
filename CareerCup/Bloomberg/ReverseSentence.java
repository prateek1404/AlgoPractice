import java.util.Deque;
public class ReverseSentence
{
	public static void main(String args[])
	{

			String sentence = args[0];
			String result = reverseSentence(sentence);
			System.out.println(result);

	}

	public static String reverseSentence(String sentence)
	{
			StringBuilder result = new StringBuilder("");
			String ar[] = sentence.split(" ");
			for(int i=ar.length-1;i>=0;i--)
			{
				result.append(ar[i]+" ");

			}
			
			return result.toString().trim();

	}


}