class Heap:
	def __init__(self,ar):
		self.array =ar
		self.length=len(ar)
		self.array.insert(0,self.length);
		self.heapify()
	
	def heapify(self):
		for i in range(1,len(self.array)):
			self.bubbleUp(i)

	def bubbleUp(i):
		index = i/2
		while index>0:
			if ar[]
	
