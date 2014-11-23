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
list.printList()	
#list.printMiddle()
print list.detectCycle()
list.reverse()
list.printList()
