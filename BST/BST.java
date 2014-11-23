class BST
{
 private BSTNode root;
 
 public BST(int rootData)
 {
    root = new BSTNode(rootData);
    
 }
 public void insert(int n)
 {
  BSTNode newNode = new BSTNode(n);
  BSTNode current = root;
  while(current!=null)
  {
    if(current.getData()>n)
    {
         if(current.getLeft()!=null)
         {
             current= current.getLeft();
         }
         else
         {
             current.setLeft(newNode);

         }
    }
    
  }

 }
}
