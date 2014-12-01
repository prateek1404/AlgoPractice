from tree import Node
from tree import Tree
def constructTree(ar1,ar2):
	if len(ar1)==0 or len(ar2)==0:
		return None
	#ar1 is the in order traversal
	#ar2 is the pre order traversal
	i = ar2.pop(0)
	j=0
	newar1=[]
	newar2=[]
	while j<len(ar1):
		if i== ar1[j]:
			break
		else:
			newar1.append(ar1[j])
			j=j+1
	j=j+1
	while j<len(ar1):
		newar2.append(ar1[j])
		j+=1
	newNode = Node(i)
	newNode.left=constructTree(newar1,ar2)
	newNode.right = constructTree(newar2,ar2)
	return newNode

node = constructTree([7,3,6,1,5,2,4,8],[1,3,7,6,2,5,4,8])
t = Tree(node)
print "created tree"
t.levelOrder()
				
		
	
