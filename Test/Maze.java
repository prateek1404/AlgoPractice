class Maze
{
int m[][] = {{1,0,1},{1,1,1},{1,0,1}};
boolean marked[][] = new boolean[3][3];
public static void main(String args[])
{
    Maze m = new Maze();
    boolean found = m.DFS(0,0);
    
}

public boolean DFS( int i, int j)
{
   System.out.println("Reached i="+i + ", j="+j);
   boolean found = false;
   marked[i][j]= true;
   if(m[i][j]==0)
   {
      return false;
   }
   if(i==2 && j==2)
   {
      return true;
   }
   
   if(i+1<3 && !marked[i+1][j])
   {
        found = DFS(i+1,j);
   }
   if(!found && j+1<3 && !marked[i][j+1])
   {
       found = DFS(i,j+1);
   }
   if(found==true)
   {
      System.out.println(i+","+j);
   }
   return found;
   

}

}
