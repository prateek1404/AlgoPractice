def quickSort(ar,start,end):
	if start==end:
		return
	pivot = ar[(start+end)/2]
	part = partition(ar,start,end,pivot)
	if part-1>=0:
		quickSort(ar,start,part-1)
	if part+1<len(ar):
		quickSort(ar,part+1,end)

def partition(ar,start,end,pivot):
	i=start
	j= end
	while i!=j:
		print i
		print j
		while ar[i]<pivot and i<j:
			i+=1
		while ar[j]>pivot and j>i:
			j-=1
		temp = ar[i]
		ar[i]=ar[j]
		ar[j]= temp
		i= i+1
		j=j-1
	print i
	return i
		
ar = [1,54,67,4,5,335,45]
quickSort(ar,0,len(ar)-1)
