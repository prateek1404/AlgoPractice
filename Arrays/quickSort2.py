def quickSort(ar):
	if len(ar)==0:
		return ar
	greater=[]
	smaller=[]
	equal=[]
	pivot = ar[-1]
	for i in ar:
		if i < pivot:
			smaller.append(i)
		elif i > pivot:
			greater.append(i)
		else:
			equal.append(i)
	return quickSort(smaller)+equal+quickSort(greater)

ar = [1,2,5,4,90,54]
ar2=quickSort(ar)	
print ar2	
