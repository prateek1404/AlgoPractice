import java.util.HashMap;
class Test
{
public static void main(String args[])
{
if(isUnique(args[0]))
{
System.out.println("Has Unique");
}
else
{
 System.out.println("does not have unique");
}

System.out.println(reverse(args[0]));
 System.out.println(reverseString(args[0]));
}
public static boolean isUnique(String s)
{
   int len = s.length();
   HashMap <Integer,Integer> map = new HashMap();
   for(int i=0;i<len;i++)
   {
      int key = (int)s.charAt(i);
      if(!map.containsKey(key))
      {
         map.put(key,1);
      }    
      else
      {
         return false;
      }
   }
   return true;
}
public static boolean isUnique1(String s)
{

return true;
}
public String mergeSort(String s)
{
StringBuffer sb = new StringBuffer(s);
int len = s.length();

//StringBuffer s1 = sort(s.substring(0,len/2));
//StringBuffer s2 = sort(s.substring(len/2+1,len));
//String result = merge(s1,s2);
return "blah";
}
public String merge(StringBuffer s1, StringBuffer s2)
{
   int len1= s1.length();
   int len2 = s2.length();

   //int i=0;j=0;
  // while(i!=len1 || j!=len2)
   {
       
   }
 return "blah";
}

public String quickSort(String s, int start, int end)
{
    

return "blah";
}

public static boolean reverse(String str)
{
  StringBuffer sB = new StringBuffer(str);
  int len = str.length();
  for(int i =0; i< len/2;i++)
  {
       if(sB.charAt(i)!=sB.charAt(len-i-1))
       {
           return false;
       }
  }  
  return true;
}
public static  String reverseString(String str)
{
   int length = str.length();
   StringBuffer sb = new StringBuffer(str);
   for(int i =0;i<length/2;i++)
   {
       char temp = sb.charAt(i);
       sb.setCharAt(i,sb.charAt(length-1-i));
       sb.setCharAt(length-1-i,temp);
   }
   return sb.toString();
}

}
