def lcs(word1,word2):
	if len(word1)==0 or len(word2)==0:
		return 0
	else:
		if word1[-1] == word2[-1]:
			return 1+ lcs(word1[:-1],word2[:-1])
		else:
			return max(lcs(word1[:-1],word2),lcs(word1,word2[:-1]))


def lcsDP(word1,word2):
	dp = [[0 for i in range(0,len(word2)+1)] for j in range(0,len(word1)+1)]	
	for i in range(0,len(word1)+1):
		for j in range(0,len(word2)+1):
			if i==0 or j ==0:
				dp[i][j]=0
			else:
				if word1[i-1] == word2[j-1]:
					dp[i][j] = 1+dp[i-1][j-1]
				else:
					dp[i][j] = max(dp[i-1][j],dp[i][j-1])
	return dp[len(word1)][len(word2)]	
print lcsDP(raw_input(),raw_input())
