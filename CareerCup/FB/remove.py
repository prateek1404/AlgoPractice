def remove_duplicates(ar):
	result =[]
	result.append(ar[0])
	prev = ar[0]
	for i in range(1,len(ar)):
		if ar[i]!=prev:
			result.append(ar[i])
			prev = ar[i]
	return result

print remove_duplicates([1,1,2,2,3,3,4])
