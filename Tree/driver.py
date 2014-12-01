from tree import Node
from tree import Tree
n1 = Node(1)
n2 = Node(2)
n3 = Node(3)
n4 = Node(4)
n5 = Node(5)
n6 = Node(6)
n7 = Node(7)
n8 = Node(8)
n1.left =n2
n1.right=n3
n2.left= n4
n2.right = n5
n3.left= n6
n3.right= n7
n4.left= n8
tree = Tree(n1)
tree.printTree()
print "size of tree"
print tree.sizeOfTree(tree.root)
print "depth of tree"
print tree.depth(tree.root)
#tree.root = tree.deleteTree(tree.root)
tree.root = tree.mirror(tree.root)
#tree.printTree()
tree.root= tree.mirror(tree.root)
#tree.levelOrder()
tree.printAllRootLeafPaths(tree.root,[tree.root.value])

