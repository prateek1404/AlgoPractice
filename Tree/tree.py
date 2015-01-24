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
		q.append((self.root,1))
		while len(q)!=0:
			nodeTup = q.pop(0)
			node = nodeTup[0]
			dist = nodeTup[1]
			print node.value
			if node.left!=None:
				q.append((node.left,nodeTup[1]+1))
			if node.right!=None:
				q.append((node.right,nodeTup[1]+1))
	
	def levelOrderSpiral(self):
		list1=[]
		list2=[]
		list1.append(self.root)
		while len(list1)!=0 or len(list2)!=0:
		
			while len(list1)!=0:
				node = list1.pop()
				print node.value
				if node.right!=None:
					list2.append(node.right)
				if node.left!=None:
					list2.append(node.left)
			while len(list2)!=0:
				node = list2.pop()
				print node.value
				if node.left!=None:
					list1.append(node.left)
				if node.right!=None:
					list1.append(node.right)

		
					
				
	
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

	def checkChildrenSum(self,node):
			if node==None:
				return True
			if node.left==None and node.right==None:
				return True
			left=0
			right=0
			if node.left==None:
				left =0
			else:
				left = node.left.value
			if node.right==None:
				right =0
			else:
				right = node.right.value
			
			check1 = self.checkChildrenSum(node.left)
			check2=  self.checkChildrenSum(node.right)
			if check1 and check2:
				return left+right==node.value
			
			return False
	def convertToChildrenSum(self,node):
		if node==None:
			return 0
		if node.left==None and node.right==None:
			return node.value

		sum1= self.convertToChildrenSum(node.left)
		sum2= self.convertToChildrenSum(node.right)
		node.value = sum1+sum2
		return node.value
	
	def diameter(self,node):
		if node==None:
			return 0
		if node.left==None and node.right==None:
			return 1
		leftDia=0
		rightDia=0
		if node.left!=None:
			leftDia = self.diameter(node.left)
		if node.right!=None:
			rightDia = self.diameter(node.right)
		return max(leftDia,rightDia,self.depth(node.left)+self.depth(node.right)+1)
	
	def isBalanced(self,node):
		if node==None:
			return True
		if node.left==None and node.right==None:
			return True
		
		if self.isBalanced(node.left) and self.isBalanced(node.right) and abs(self.depth(node.left)-self.depth(node.right)<=1):
			return True
		return False 	
	def inOrderIterative(self):
		root = self.root
		
