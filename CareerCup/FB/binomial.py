def bionomial(n,k):
	if k==0 or k==n:
		return 1
	if k==1:
		return n
	else:
		return bionomial(n-1,k-1)+bionomial(n-1,k)

def bioDP(n,k):
	dp = [[0 for j in range(0,k+1)] for i in range(0,n+1)]
	for i in range(0,n+1):
		for j in range(0,k+1):
			if j==0 or j==i:
				dp[i][j]=1
			else:
				dp[i][j] = dp[i-1][j-1]+dp[i-1][j]
			if i==n and j==k:
				return dp[i][j]
	

print bioDP(input(),input())
