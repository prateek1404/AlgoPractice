def quickSort(ar,start,end):
	if start<end:
		partition = partition_fn(ar,start,end)
		quickSort(ar,start,partition-1)
		quickSort(ar,partition+1,end)

def partition_fn(ar,start,end):
	
	pivot = ar[(start+end)/2]
	i=-1
	for j in range(0,len(ar)):
		if ar[j]<pivot:
			i+=1
			swap(ar,i,j)
	swap(ar,i+1,(start+end)/2)
	return i+1

def swap(ar,a,b):
	temp =ar[a]
	ar[a]= ar[b]
	ar[b] = temp

ar= [1,2,5,3,3,75,2342,324323423432,62343,234,724]
quickSort(ar,0,len(ar)-1)
print ar
