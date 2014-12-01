class Node:
	def __init__(self,value):
		self.value= value
		self.left= None
		self.right= None
		
class BST:
	
	def __init__(self,root):
		self.root = root
	
	def insert(self,root,value):
		
		if root== None:
			return Node(value)
		else:
			if root.value>value:
				root.left = self.insert(root.left,value)
			else:
				root.right = self.insert(root.right,value)
		
		return root

	def print_bst(self,root):
		if root==None:
			return
		self.print_bst(root.left)
		print root.value
		self.print_bst(root.right)

	def delete_bst(self,root,value):
		if root==None:
			return None
		if root.value == value:
			if root.left==None and root.right==None:
				return None
			elif root.left==None and root.right!=None:
				
			
				
				

n= Node(5)
bst = BST(n)
bst.insert(bst.root,1)
bst.insert(bst.root,7)
bst.insert(bst.root,11)
bst.print_bst(bst.root)
		
		
