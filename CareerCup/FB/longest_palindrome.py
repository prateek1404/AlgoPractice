def longest_palindrome(word):
	dp = [[False]*len(word)]*len(word)
	lenDP = [[0]*len(word)]*len(word)
	max =1
	for i in range(0,len(word)):
		dp[i][i]=True
		lenDP[i][i]=1
		if i!=len(word)-1:
			if word[i] is word[i+1]:
				print "hello"
				dp[i][i+1]=True
				lenDP[i][i+1]+=2
				print "inloop ", lenDP
				max=2

	print dp[1][2], lenDP	
	for L in range(3,len(word)+1):
		for i in range(0,len(word)-L+1):
			j = i+L-1
			if word[i]==word[j] and dp[i+1][j-1]:
				dp[i][j]=True
				lenDP[i][j]=dp[i][j]+2
				if lenDP[i][j]>max:
					max = lenDP[i][j]
			else:
				dp[i][j] = False
				lenDP[i][j]=0
	
	return max

print longest_palindrome(raw_input())

	
	
