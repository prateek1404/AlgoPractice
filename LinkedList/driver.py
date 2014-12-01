from linked_list import Node,LinkedList
nlist=[]
for i in range(0,5):
	nlist.append(Node(i,None))
for i in range(1,5):
	nlist[i-1].next = nlist[i]

#for i in range(0,5):
	#if nlist[i].next!= None:
		#print nlist[i].next.value
list = LinkedList(nlist[0])
nlist[4].next = nlist[0]
list.delete(1)
#list.printList()	
#list.printMiddle()
if list.detectCycle():
	list.printCircularLinkedList(list.head)
	head1,head2 = list.splitIntoTwo()
	if head1!=None:
		print "first half"
		list.printCircularLinkedList(head1)
	if head2!=None:
		print "second half"
		list.printCircularLinkedList(head2)
#list.reverse()
#print list.getNthNode(3)
#print list.getNthFromEnd(3)
#list.insert(100)
#list.delete(1)
#list.deletePointer(nlist[1])
#list.deleteList()
#list.printList()
#list.printMiddle(list.head)
