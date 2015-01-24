import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T>0)
            {
            int N = Integer.parseInt(br.readLine());
            int turn =1;
            while(N!=1)
            {
		System.out.println("value of N "+N);
                int Ntemp = (int)Math.pow(2,30);
                int k=0;
                int index=0;
                if(N%2==0)
                {
                    N = N/2;
                    turn++;
                    continue;
                }
                else
                {
                    while(Ntemp>N)
                    {
                        Ntemp =Ntemp>>1;
                    }
                    N = N-Ntemp;
                }
                turn++;
            }
            if(turn%2!=0)
                {
                System.out.println("Richard");
            }
            else
                {
                System.out.println("Louise");
            }
            T--;
        }
        }
        catch(IOException e)
            {
            
        }
    }
}
