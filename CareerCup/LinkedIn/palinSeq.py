def maxPalinSeq(ar):
	
	dp = [[0]*len(ar)]*len(ar)
	
	for i in range(0,len(ar)):
		if i!=len(ar)-1:
			dp[i][i]=1
			if ar[i]==ar[i+1]:
				dp[i][i+1]=2
		else:
			dp[i][i]=1
	
	for L in range(3,len(ar)+1):	
		for i in range(0,len(ar)-L+1):
				j = i+L-1
				if(ar[i]==ar[j]):
					dp[i][j]=dp[i+1][j-1]+2
				else:
					maxleft =0
					maxright=0
					if ar[i]==ar[j-1]:
						maxleft = dp[i+1][j-2]+2
					elif ar[i+1]==ar[j]:
						maxRight = dp[i+2][j-1]+2
					else:
						dp[i][j] = dp[i+1][j-1]
						continue
					dp[i][j] = max(maxleft,maxRight)
					
	print dp[0][-1]
				
maxPalinSeq(map(int,raw_input().split(' ')))	
