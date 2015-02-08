def knapsack(val,wts,W,i):
	
	dp =[[0 for j in range(0,len(val)+1)] for i in range(0,W+1)]
	print dp	
	for i in range(0,W+1):
		for j in range(0,len(val)+1):
			if i==0 or j==0:
				dp[i][j]=0
			else:
				if wts[j-1]<=i:
					dp[i][j] = max(dp[i][j-1],val[j-1]+dp[i-wts[j-1]][j-1])
				else:
					dp[i][j] = dp[i][j-1]
	return dp[W][len(val)]


val =[1,2,3,4,5,6,7,8]
wts= [1,2,3,4,5,6,7,8]
print val
print wts
W= input()
print knapsack(val,wts,W,len(val)-1)
