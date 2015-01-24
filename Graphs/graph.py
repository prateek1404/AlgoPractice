class Node:
	
	def __init__(self,value):
		self._value = value
		self._adjList=[]
class Graph:
	def __init__(self,nodeArray):
		self._nodeList=nodeArray
		self._edgeList=[]
		self._visited={}
		for i in self._nodeList:
			self._visited[i._value]=False	
	
	def addEdge(self,node1,node2):
		self._nodeList[node1]._adjList.append(node2)
		self._nodeList[node2]._adjList.append(node1)

	def print_graph(self):
		for i in self._nodeList:
			print i._value, i._adjList	
	
	def dfs(self,node):
		self._visited[node._value]=True
		print node._value
		for i in node._adjList:
			if self._visited[self._nodeList[i]._value]==False:
				self.dfs(self._nodeList[i])			
	def bfs(self,node):
		que=[]
		que.append(node)
		while len(que)!=0:
			cur = que.pop(0)
			self._visited[cur._value]=True
			print cur._value
			for k in cur._adjList:
				if self._visited[self._nodeList[k]._value]==False:
					que.append(self._nodeList[k])
			
