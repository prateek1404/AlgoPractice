class Node:
	def __init__(self,value):
		self.value=value
		self.next= None
class HashTable:
	
	def __init__(self):
		self.ar=[]
		for i in range(0,10):
			self.ar.append(Node(-1))
		print self.ar
	
	def put(key,value):
	

