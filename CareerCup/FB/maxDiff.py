def maxDiff(ar):
	
	max = ar[-1]
	maxDiff =0
	for i in range(len(ar)-2,-1,-1):
		if ar[i]>max:
			max = ar[i]
		if max-ar[i]>maxDiff:
			maxDiff = max- ar[i]
	return maxDiff

print maxDiff(map(int,raw_input().split(' ')))
