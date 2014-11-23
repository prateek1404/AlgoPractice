def quickSort(ar):
	if len(ar)==0:
		return ar
	greater=[]
	less=[]
	equal=[]
	pivot = ar[len(ar)-1]
	for i in ar:
		if i>pivot:
			greater.append(i)
		elif i<pivot:
			less.append(i)
		else:
			equal.append(i)
	return quickSort(less)+equal+quickSort(greater)

ar = [1,3,6,4,987,3456,356]
print quickSort(ar)
