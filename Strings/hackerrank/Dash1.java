//Enter your code here. Read input from STDIN. Print output to STDOUT
import java.io.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
public class Dash1
{
    public static void main(String args[])
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            int T = Integer.parseInt(br.readLine());
            while(T>0)
            {
                String input = br.readLine();
                char firstHalfList[] = input.substring(0,input.length()/2).toCharArray();
                char secondHalfList[] = input.substring(input.length()/2).toCharArray();
                ArrayList<Character> firstHalf = new ArrayList<Character>();
                ArrayList<Character> secondHalf = new ArrayList<Character>();
                for(char c :firstHalfList)
                {
                    firstHalf.add(c);
                }
                for(char c :secondHalfList)
                {
                    secondHalf.add(c);
                }
                

                if(firstHalfList.length!=secondHalfList.length)
                    {
                    System.out.println(-1);
                    continue;
                }
                Collections.sort(firstHalf);
                Collections.sort(secondHalf);
                System.out.println(new String(firstHalfList));
                System.out.println(new String(secondHalfList));
                int count1 =0;
                for(int i=0;i<firstHalfList.length;i++)
                    {
                        int index = Collections.binarySearch(secondHalf,firstHalfList[i]);
                        if(index<0)
                        {
                            count1++;
                            
                        }
                        else
                        {
                            secondHalf.remove(index);
                        }
                        }
                
                 firstHalf = new ArrayList<Character>();
                secondHalf = new ArrayList<Character>();
                for(char c :firstHalfList)
                {
                    firstHalf.add(c);
                }
                for(char c :secondHalfList)
                {
                    secondHalf.add(c);
                }
                Collections.sort(firstHalf);
                Collections.sort(secondHalf);
                int count2=0;
                for(int i=0;i<secondHalfList.length;i++)
                    {
                        int index = Collections.binarySearch(firstHalf,secondHalfList[i]);
                        if(index<0)
                        {
                            count2++;
                        }
                        else
                           {
                            //firstHalf[index]=' ';
                            firstHalf.remove(index);
                        }
                }
                System.out.println(count1<count2?count1:count2);
                
                T--;
            }
            }
            
        
        catch(IOException e)
        {
            
        }
        
    }
}
