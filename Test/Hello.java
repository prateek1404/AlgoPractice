import java.util.Stack;
class Hello
{
public static void main(String args[])
{
     Stack<String> st= new Stack<String>();
     String s1= "My name is Prateek";
     String ar[] = s1.split(" ");
     
     for(String a:ar)
     {
          System.out.println(a);
          st.push(a);
     }
     while(!st.empty())  
     {
          String a = st.pop();
          System.out.println(a);

     }   


}

}
