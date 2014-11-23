class BSTNode
{
 int data;
 private BSTNode left;
 private BSTNode right;
 
 public BSTNode(int data)
 {
   this.data = data;

 }
 public int getData()
 {
   return this.data; 
 }
 public void setLeft(BSTNode left)
 {
   this.left = left;
 }
 public void setRight(BSTNode right)
 {
   this.right = right;
 }
 public BSTNode getLeft()
 {
   return this.left;
 }
 public BSTNode getRight()
 {
   return this.right;
 }
}

