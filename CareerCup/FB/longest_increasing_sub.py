def lisub(ar):
	max =-1
	dp = [0]*len(ar)
	dp[0]=1
	
	for i in range(1,len(ar)):
		for j in range(0,i):
			if ar[i]>ar[j] and dp[j]+1>dp[i]:
				dp[i] = dp[j]+1
		if dp[i]>max:
			max = dp[i]
	return max

print lisub(map(int,raw_input().split(' ')))
