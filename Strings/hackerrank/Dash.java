//Enter your code here. Read input from STDIN. Print output to STDOUT
import java.io.*;
import java.util.Arrays;
public class Dash
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
                char firstHalf[] = input.substring(0,input.length()/2).toCharArray();
                char secondHalf[] = input.substring(input.length()/2).toCharArray();
                if(firstHalf.length!=secondHalf.length)
                    {
                    System.out.println(-1);
                    continue;
                }
                Arrays.sort(firstHalf);
                Arrays.sort(secondHalf);
                System.out.println(new String(firstHalf));
                System.out.println(new String(secondHalf));
                int count1 =0;
                for(int i=0;i<firstHalf.length;i++)
                    {
                        int index = Arrays.binarySearch(secondHalf,firstHalf[i]);
                        if(index<0)
                        {
                            count1++;
                            
                        }
                        else
                           {
                            secondHalf[index]=' ';
                        }
                }
                firstHalf= input.substring(0,input.length()/2).toCharArray();
                Arrays.sort(firstHalf);
                secondHalf = input.substring(input.length()/2).toCharArray();
                Arrays.sort(secondHalf);
                int count2=0;
                for(int i=0;i<firstHalf.length;i++)
                    {
                        int index = Arrays.binarySearch(firstHalf,secondHalf[i]);
                        if(index<0)
                        {
                            count2++;
                        }
                        else
                           {
                            firstHalf[index]=' ';
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
