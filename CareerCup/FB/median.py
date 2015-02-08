import heapq
def median(ar):
	minHeap = []
	maxHeap =[]
	for i in ar:
		if len(minHeap)==len(maxHeap):
			if i < maxHeap.peek():
				heapq.heappush(maxHeap,i)
				print heapq.peek(maxHeep)
			else:
				heapq.heappush(minHeap,i)
				print heapq.peek(minHeap)
		else:
			if i<maxHeap.peek() and len(maxHeap)>=len(minHeap):
				push(minHeap,maxHeap.top())
				push(maxHeap,i)
				print (maxHeap.top()+minHeap.top())/2
			
		
