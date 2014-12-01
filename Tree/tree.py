class Node:
	def __init__(self,value):
		self.value=value
		self.left= None
		self.right= None
class Tree:
	def __init__(self,root):
		self.root = root

	def printTree(self):
		print "Inorder Traversal"
		self.inOrder(self.root)
		print "pre Order Traversal"
		self.preOrder(self.root)
		print "post order traversal"
		self.postOrder(self.root)

	def inOrder(self,root):
		if root==None:
			return
		self.inOrder(root.left)
		print root.value
		self.inOrder(root.right)
	
	def preOrder(self,root):
		if root==None:
			return
		print root.value
		self.preOrder(root.left)
		self.preOrder(root.right)
		
	def postOrder(self,root):
		if root==None:
			return
		self.postOrder(root.left)
		self.postOrder(root.right)
		print root.value

	def levelOrder(self):
		q = []
		q.append(self.root)
		while len(q)!=0:
			node = q.pop(0)
			print node.value
			if node.left!=None:
				q.append(node.left)
			if node.right!=None:
				q.append(node.right)
		
	
	def sizeOfTree(self,root):
		if root==None:
			return 0
		else:
			return 1+ self.sizeOfTree(root.left)+self.sizeOfTree(root.right)
	
	def depth(self,root):
		if root==None:
			return 0
		else:
			return 1+max(self.depth(root.left),self.depth(root.right))

	def deleteTree(self,root):
		if root==None:
			return None
		root.left= self.deleteTree(root.left)
		root.right = self.deleteTree(root.right)
		return None
	def mirror(self,root):
		if root == None:
			return None
		temp = root.right
		root.right = self.mirror(root.left)
		root.left =  self.mirror(temp)
		return root	
	def printAllRootLeafPaths(self,node,list):
		if node.left==None and node.right==None:
			print list
		else:
			if node.left!=None:
				list.append(node.left.value)
				self.printAllRootLeafPaths(node.left,list)
				list.pop()
			if node.right!=None:
				list.append(node.right.value)
				self.printAllRootLeafPaths(node.right,list)
				list.pop()
