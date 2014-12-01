def DP(string1,string2):
	dp =[[None for i in range(0,len(string2)+1)] for j in range(0,len(string1)+1)]
	
	for i in range(0,len(string1)+1):
		for j in range(0,len(string2)+1):
			if i==0 or j==0:
				dp[i][j]=0
			else:
				if string1[i-1]==string2[j-1]:
					dp[i][j]= dp[i-1][j-1]+1
				else:
					dp[i][j]= max(dp[i-1][j],dp[i][j-1])
	print str(dp[len(string1)][len(string2)])

DP("ABC","ABCD")
