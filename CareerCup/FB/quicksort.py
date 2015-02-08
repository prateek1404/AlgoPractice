def quicksort(ar,start,end):
	if start<end:
		partition = partition_fn(ar,start,end)
		quicksort(ar,start,partition-1)
		quicksort(ar,partition+1,end)

def partition_fn(ar,start,end):
	i= start-1
	pivot = ar[end]
	for j in range(start,end):
		if ar[j]<pivot:
			i+=1
			swap(ar,i,j)
	swap(ar,i+1,end)
	return i+1

def swap(ar,a,b):
	temp =ar[a]
	ar[a] = ar[b]
	ar[b] =temp

ar = map(int ,raw_input().split(' '))
quicksort(ar,0,len(ar)-1)
print ar
