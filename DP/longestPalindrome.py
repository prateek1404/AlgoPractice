def longestPalan(word):
	length = len(word)
	dp = [[None for j in range(0,len(word)] for i in range(0,len(word)))

	for i in range(0,len(word)):
		dp[i][i]=1
		
