def quickSort(ar,start,end):
	if start>=end:
		return
	else: 	
		pivot = ar[end]
		position = partition(ar,start,end,pivot)
		if start<position-1:
			quickSort(ar,start,position-1)
		if end>position+1:
			quickSort(ar,position+1,end)

def partition(ar,start,end,pivot):
	i = start
	j = end-1
	while i<=j:
		while ar[i]<pivot :
			i+=1
		while ar[j]>pivot:
			j-=1
		if i<=j:
			temp = ar[end]
			ar[end]= ar[i]
			ar[i]=temp
			i+=1
			j-=1
	return i
	
#ar=[5,4,3,2]
ar=[4,3,7,34,77,43,55]
quickSort(ar,0,len(ar)-1)		
print ar	
