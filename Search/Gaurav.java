import java.io.*;
class Gaurav
{
 public static void main(String args[])
 {
   int ar[] = new int[args.length];
   for(int i=0;i<args.length;i++)
   {
       ar[i] = Integer.parseInt(args[i]);
   }
   try
   {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     String num = br.readLine();
     int N = Integer.parseInt(num);
     System.out.println(N);
     func(ar,N,0);
   }  
   catch(Exception e)
   {

   } 

 }
 public static boolean func(int[] ar,int N, int index)
 {
    if(N-ar[index]==0)
    {
        System.out.println("Found bitch!");
        return true;
    }
    if(N>ar[index])
    {
       if(func(ar,N-ar[index],index+1))
       {

       }
    }

 }

}
