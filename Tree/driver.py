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
n8.left= Node(9)
tree = Tree(n1)
#tree.printTree()
#print "size of tree"
#print tree.sizeOfTree(tree.root)
#print "depth of tree"
#print tree.depth(tree.root)
#tree.root = tree.deleteTree(tree.root)
#tree.root = tree.mirror(tree.root)
#tree.printTree()
#tree.root= tree.mirror(tree.root)
#tree.levelOrder()
#tree.printAllRootLeafPaths(tree.root,[tree.root.value])
#tree.levelOrder()
#tree.levelOrderSpiral()
print tree.checkChildrenSum(tree.root)
#tree.convertToChildrenSum(tree.root)
tree.levelOrder()
print tree.checkChildrenSum(tree.root)
print tree.diameter(tree.root)
print tree.isBalanced(tree.root)
node1= Node(10)
node2 = Node(8)
node3 = Node(2)
node4 = Node(3)
node5 = Node(5)
node6 = Node(2)
node1.left= node2
node1.right= node3
node2.left= node4
node2.right= node5
node3.left= node6
t = Tree(node1)
t.levelOrder()
#print t.checkChildrenSum(t.root)
