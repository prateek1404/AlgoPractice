def numtoWord(ar):
	if len(ar)==1:
		return 1	
	dp = [0 for i in range(0,len(ar))]
	dp[0] =1
	if ar[0]!=0 and ar[0]<=2 and ar[1]<=6:
		dp[1] = 2
	else:
		dp[1] = 1
	
	for i in range(2,len(ar)):
		dp[i] = dp[i-1]
		if ar[i-1]!=0 and ar[i-1]<=2 and ar[i]<=6:
			dp[i]+=dp[i-2]
	return dp[len(ar)-1]

print numtoWord(map(int,raw_input().split(' ')))
		
		
	
