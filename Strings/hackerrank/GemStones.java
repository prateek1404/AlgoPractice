import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GemStones {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try
        {
        	int N = Integer.parseInt(br.readLine());
		int N1 = N;
		boolean ar[][] = new boolean[N][26];
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<26;j++)
			{
				ar[i][j]=false;
			}
		}
		while(N>0)
		{
			String s = br.readLine();
			N--;
			for(int i=0;i<s.length();i++)
			{
				ar[N][s.charAt(i)-'a']=true;
			}
		}        
		int count=0;                           
		for(int j=0;j<26;j++)
                {
			int i=0;
			boolean flag= true;
                        for(i=0;i<N1;i++)
                        {
                               if(ar[i][j]==false)
				{
					flag=false;
					break;
				}
                        }
			if(flag==true)
			{
				count++;
			}
                }
		System.out.println(count);
        }
	catch(Exception e)
	{
	
	}
        
    }
}
