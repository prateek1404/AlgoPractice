
public class Palindrome
{
	public static void main(String args[])
	{
		String question = args[0];
		question= question.toLowerCase();	
		boolean isPalindrome = isPalindrome(question);
		System.out.println(isPalindrome);
	}
	public static boolean isPalindrome(String str)
	{
		int len = str.length();
		int start = 0;
		int end = len-1;
		while(start<=end)
		{
			while(!Character.isLetterOrDigit(str.charAt(start)) && start!=end)
			{
				start = start+1;
			}
			while(!Character.isLetterOrDigit(str.charAt(end)) && end!=start)
			{
				end = end-1;
			}
			
			if(str.charAt(start)!=str.charAt(end))
			{
				return false;
			}
			start = start+1;
			end = end-1;	

		}
		return true;
	}

}
