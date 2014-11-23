def mergeSort(ar):
	if len(ar)==1:
		return ar
	length = len(ar)
       	mid = length/2
	ar1= ar[:mid]
	ar2 = ar[mid:]
	ar1=mergeSort(ar1)
	ar2=mergeSort(ar2)
	ar3= merge(ar1,ar2)
	print ar3
	return ar3

def merge(ar1,ar2):
	len1 = len(ar1)
	len2 = len(ar2)
	i=0
	j=0
	ar3=[]
	while i<len1 and j<len2:
		if ar1[i]<ar2[j]:
			ar3.append(ar1[i])
			print ar1[i]
			i+=1
		else:
			ar3.append(ar2[j])	
			print ar1[j]
			j+=1
	if i<len1:
		while i<len1:
			ar3.append(ar1[i])
			i+=1
	if j<len2:
		while j<len2:
			ar3.append(ar2[j])
			j+=1
	return ar3

ar=[1,4,3,6,7,34,58,21]
ar2 = mergeSort(ar)
print ar2
