def editDistance(word1,word2):
	dp = [[0 for i in range(0,len(word2)+1)] for i in range(0,len(word1)+1)]
	
	for i in range(0,len(word1)+1):
		for j in range(0,len(word2)+1):
			if i==0 or j==0:
				if i==0:
					dp[i][j] = j
				else:
					dp[i][j] = i
			else:
				if word1[i-1]==word2[j-1]:
					dp[i][j] = dp[i-1][j-1]
				else:
					dp[i][j]= 1+min(dp[i-1][j-1],dp[i-1][j],dp[i][j-1])
	return dp[len(word1)][len(word2)]

print editDistance(raw_input(),raw_input())
				
				
