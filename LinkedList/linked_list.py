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
			
