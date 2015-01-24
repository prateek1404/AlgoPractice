from graph import Graph,Node

nodeArray=[]
for i in range(0,5):
	nodeArray.append(Node(i))
graph = Graph(nodeArray)

graph.addEdge(0,1)
graph.addEdge(1,2)
graph.addEdge(2,3)
graph.addEdge(3,4)
print graph.print_graph()
print graph.bfs(nodeArray[2])
