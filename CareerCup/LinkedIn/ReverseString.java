public class ReverseString
{
	public static void main(String args[])
	{
		char ar[] = args[0].toCharArray();
		reverse(ar,0,ar.length-1);
		System.out.println(new String(ar));
		
		

	}

	public static void reverse(char ar[],int start,int end)
	{
		if(start<=end)
		{
			swap(ar,start,end);
			reverse(ar,start+1,end-1);
		}

	}
	public static void swap(char ch[], int a, int b)
	{
		char temp = ch[a];
		ch[a] = ch[b];
		ch[b] = temp;

	}

	


}
