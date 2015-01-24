
ar = [4,5,3,8,9,123,34,65,9032]

def heapify(ar):
	for i in range(len(ar)/2,-1,-1):
		bubbleDown(ar,i,len(ar)-1)
	return ar

def heapSort(ar):
	print  heapify(ar)
	lastIndex = len(ar)-1
	while lastIndex!=0:
		swap(ar,0,lastIndex)
		lastIndex-=1
		bubbleDown(ar,0,lastIndex)
	return ar

def bubbleDown(ar,i,maxIndex):
	while i<maxIndex:
		child1 = i*2+1
		child2 = i*2+2
		swapindex =i
		if child1>maxIndex:
			break
		else:
			if ar[child1]>ar[i]:
				swapindex = child1
			if child2<=maxIndex:
				if ar[child2]>ar[swapindex]:
					swapindex=child2
			if i == swapindex:
				break
			else:
				swap(ar,swapindex,i)
				i= swapindex
	print ar
	
def bubbleUp(ar,index):
	while(index!=0):
		parentIndex = (index-1)/2
		if ar[parentIndex]<ar[index]:
			swap(ar,index,parentIndex)
			index = parentIndex
		else:
			break
	return ar

def swap(ar,index1, index2):
	temp = ar[index1]
	ar[index1] = ar[index2]
	ar[index2] = temp

def heapify2(ar,i,lastIndex):
	if i>=lastIndex:
		return
	else:
		swapindex=i
		child1=  i*2+1
		child2 = i*2+2
		if child1<=lastIndex:
			if ar[child1]>ar[i]:
				swapindex= child1	
			if child2<=lastIndex:
				if ar[swapindex]<ar[child2]:
					swapindex = child2
			if swapindex!=i:
				swap(ar,i,swapindex)
				heapify2(ar,swapindex,lastIndex)
	return ar

ar = [4,5,3,8,9,123,34,65,9032]
print heapSort(ar)

