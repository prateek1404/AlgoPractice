class Node:
	def __init__(self,value,next):
		self.value=value
		self.next=next
class LinkedList:
	def __init__(self,head):
		self.head = head
	def printList(self):
		node = self.head
		while node!=None:
			print node.value
			node = node.next
	def printMiddle(self):
		slow = self.head
		fast = self.head.next
		while fast!= None and fast.next!= None:
			slow = slow.next
			if fast.next!= None:
				fast = fast.next.next
			else:
				break
		print slow.value	
	
	def detectCycle(self):
		slow = self.head
		fast = slow.next
		while fast!=None:
			slow= slow.next
			if fast.next!=None:
				fast = fast.next.next
			else:
				break
			if slow==fast:
				return True
		return False
	def reverse(self):
		if self.head== None:
			return
		prev = None
		current= self.head
		while(current!=None):
			temp = current.next
			current.next=prev
			prev = current
			current = temp
		self.head= prev
	def getNthNode(self,N):
		head1 = self.head
		N=N-1
		while N!=0:
			if head1==None:
				break
			head1= head1.next
			N-=1
		if head1!=None:
			print "returning answer"
			return head1.value
		else:
			return
		
	def getNthFromEnd(self,N):
		head = self.head
		head2= self.head
		N = N-1
		while N!=0:
			if head==None:
				return
			else:
				head = head.next
			N=N-1
		while head.next!=None:
			head2= head2.next
			head = head.next
		print head2.value
		return head2.value 	
	
	def mergeSort(self):
		slow = self.head
		fast = slow.next
		while fast!=None and fast.next!=None:
			slow = slow.next
			fast = fast.next.next
		return slow.value
	def insert(self,val):
		head = self.head
		while head.next!=None:
			head = head.next
		head.next = Node(val,None)
	def delete(self,val):
		head = self.head
		prev = None
		if head.value == val:
			self.head = head.next
			head.next = None
		else:
			while head.value!=val and head!=None:
				prev = head
				head = head.next
			prev.next = head.next
			head.next = None
	def deletePointer(self,node):
		head = self.head
		if node == None:
			return
		if node.next== None:
			print "Not feasible"
			return
		node.value = node.next.value
		node.next= node.next.next
			
	def deleteRecurse(self,node):
		if node.next==None:
			node = None
			return node
		else:
			node.next = self.deleteRecurse(node.next)
	def deleteList(self):
                self.deleteRecurse(self.head)
                self.head = None

	def printMiddle(self,head):
		slow = head
		fast = slow.next
		while fast!= None and fast.next!= None:
			slow = slow.next
			fast = fast.next.next
		print slow.value	
