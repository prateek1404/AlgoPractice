def quickSort(ar,start,end):
	if start<end:
		partition = partition(ar,start,end)
		if partitioni-1>start:
			quickSort(ar,start,partition-1)
		if partition+1<end:
			quickSort(ar,partition+1,end)


def partition(ar,start,end):
	pivot = ar[start]
	while(start<=end):
		while ar[start]<=pivot:
			start+=1
		while ar[end]>pivot:
			end-=1
		if(start<=end):
			temp = ar[start]
			ar[start]= ar[end]
			ar[end]= temp;
			start+=1
			end-=1
		else:
			return end;

[1,2,3,4,5,5,8,7]
