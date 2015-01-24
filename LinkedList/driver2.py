from linked_list import Node,LinkedList
def reverse(n1):
	prev= None
	current = n1
	while current!=None:
		right = current.next
		current.next = prev
		prev = current
		current = right
	return prev
	
def printList(n):
	while n!= None:
		print n.value
		n = n.next

n1 = Node(1)
n2 = Node(2)
n3 = Node(3)
n4 = Node(4)
n5 = Node(5)

n1.next = n2
n2.next = n3
n3.next = n4
n4.next = n5
n5.next = None

printList(n1)
nret = reverse(n1)
print nret.value
printList(nret)
