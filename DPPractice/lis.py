def lis(ar):
	dp = [ 0 for j in range(0,len(ar))]
	dp[0] = 1
	max =-1
	for i in range(1,len(ar)):
		for j in range(0,i):
			if ar[j]<ar[i] and dp[i]<dp[j]+1:
				dp[i] = dp[j]+1
			if dp[i]>max:
				max = dp[i]
	return max

print lis(map(int,raw_input().split(' ')))
			

	
