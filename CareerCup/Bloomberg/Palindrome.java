public class Palindrome
{
	public static void main(String args[])
	{
		String word = args[0];
		System.out.println(isPalindrome(word));
		System.out.println(reverse(Integer.parseInt(word)));
	}
	public static boolean isPalindrome(String word)
	{
		int len = word.length();
		for(int i=0;i<len/2;i++)
		{
			if(word.charAt(i)!=word.charAt(len-i-1))
			{
				return false;
			}
		}
		return true;


	}
	public static int reverse(int number)
	{
		StringBuilder st = new StringBuilder(String.valueOf(number));
		for(int i=0;i<st.length()/2;i++)
		{
				char temp = st.charAt(i);
				st.setCharAt(i,st.charAt(st.length()-i-1));
				st.setCharAt(st.length()-i-1,temp);
		}
		return Integer.parseInt(st.toString());

	}
}