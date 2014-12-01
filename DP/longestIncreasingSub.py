def longestIncreasingSub(ar):
	length = len(ar)
	highest = ar[0]
	lcs =[1 for i in range(0,length)]
	
	# from j to i, check if the array value of 'i' is greater than that of j...that means i is in the increasing sequence of j
	# also check of the increasing sequence of current i is less than lcs of j +1....if yes update the lcs
	for i in range(1,length):
		for j in range(0,i):	
			if(ar[i]>ar[j] and lcs[i]<lcs[j]+1):
				lcs[i]=lcs[j]+1
	max = lcs[0]
	for i in range(0,len(ar)):
		if max< lcs[i]:
			max = lcs[i]
	print lcs
	print max
longestIncreasingSub([30, 22, 9, 33, 21, 50, 41, 60,80])
