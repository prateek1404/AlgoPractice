def longestCommonSubsequence(string1,string2):
	if len(string1)==0 or len(string2)==0:
		return 0
	if string1[len(string1)-1]==string2[len(string2)-1]:
		return 1+longestCommonSubsequence(string1[:len(string1)-1],string2[:len(string2)-1])
	else:
		ans1 = longestCommonSubsequence(string1[:-1],string2)
		ans2 = longestCommonSubsequence(string1,string2[:-1])
		if ans1>ans2:
			return ans1
		else:
			return ans2

def DP(string1,string2):
	len1 = len(string1)
	len2 = len(string2)
	dp = [[None for i in range(0,len1+1)] for j in range(0,len2+1)]
	for i in range(0,len1+1):
		dp[i][0]=0
	for j in range(0,len2+1):
		dp[0][j]=0
	for i in range(1,len1+1):
		for j in range(1,len2+1):
			if string1[i-1]==string2[j-1]:
				dp[i][j] = dp[i-1][j-1]+1
			else:
				dp[i][j] = max(dp[i][j-1],dp[i-1][j])
	print dp[len1][len2]				

#print longestCommonSubsequence("ABCDGH","AEDFHR")
DP("ABCD","AEDFHR")
	
