class Node:
	def __init__(self,value):
		self.value=value
		self.adjList=[]
		
class Graph:
	def __init__(self,nodes):
		self.nodes=nodes
		self.node_count= len(nodes)
		self.edge_count=0
		
	def addEdge(self,n1,n2):
		self.nodes[n1].adjList.append(n2)
		self.nodes[n2].adjList.append(n1)
		self.edge_count+=1
	
	def print_graph(self):
		for i in self.nodes:
			print i.adjList	

