def longestChain(ar):
	current_len=1
	longestend =0
	largest = ar[0]
	maxlong=1
	for i in range(1,len(ar)):
		if ar[i]==largest+1:
			largest= ar[i]
			current_len=current_len+1
		else:
			current_len=1
			largest= ar[i]
		if current_len>maxlong:
			maxlong= current_len
			longestend = i
	print maxlong
	print longestend
	print ar[longestend-maxlong+1:longestend+1]


ar= [8,6,1,2,3,4,11,35,36,37,38,39,40,67]
longestChain(ar)
