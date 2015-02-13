import sys
def matrixChain(ar):
	dp= [[0 for i in range(0,len(ar)-1)] for j in range(0,len(ar)-1)]
	
	for i in range(0,len(ar)-1):
		dp[i][i] =0
	
	for L in range(2,len(ar)):
		for i in range(0,len(ar)-L):
			j = i+L-1
			min = sys.maxint
			for k in range(i,j):
				ans = dp[i][k]+dp[k+1][j]+ar[i]*ar[k+1]*ar[j+1]
				if ans<min:
					min = ans
					dp[i][j]=min
	print dp
	print dp[0][len(ar)-2]

matrixChain(map(int,raw_input().split(' ')))
