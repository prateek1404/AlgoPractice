def maxSum(ar):
	dp = [[None for i in range(0,len(ar))] for j in range(0,len(ar))]
		
	for j in range(0,len(ar)):
		for i in range(0,len(ar)):
			if i==j:
				dp[i][j]=ar[i]
			else:
				dp[i][j]=0

	for j in range(1,len(ar)):
		for i in range(0,j):
			if i!=j:
				dp[i][j]= dp[i][j-1]+ar[j]
	maxsum=0
	for i in range(0,len(ar)):
		for j in range(0,len(ar)):
			if dp[i][j]>maxsum:
				maxsum = dp[i][j]
	print  maxsum

a=[-1,2,3,-4,5,-6]
print a
maxSum(a)
