def ksmall(ar,k):
	if k > len(ar):
		return
	print ar 
	smaller=[]
	greater=[]
	equal=[]
	pivot = ar[len(ar)-1]
	
	for i in ar:
		if i > pivot:
			greater.append(i)
		elif i<pivot:
			smaller.append(i)
		else:
			equal.append(i)
	if len(smaller)>=k:
		return ksmall(smaller,k)
	elif len(smaller)+1==k:
		return pivot
	elif k>=len(smaller) and k<len(smaller)+len(equal):
		return equal[0]
	else:
		return ksmall(greater,k-len(smaller)-len(equal))

print ksmall([2,1,3,6,45],5)
