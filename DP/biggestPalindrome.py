def bigpal(word):
	dp = [[False for i in range(0,len(word))] for j in range(0,len(word))]

	for i in range(0,len(word)):
		dp[i][i]=True
		start =i
	maxk=1
	for i in range(0,len(word)-1):
		if word[i]==word[i+1]:
			dp[i][i+1]=True
			start = i
			maxk=2
	for k in range(2,len(word)+1):
		for i in range(0,len(word)-k-1):
			j = i+k-1
			if word[i]==word[j] and dp[i+1][j-1] == True:
				dp[i][j]= True
				if k>maxk:
					maxk=k
					start = i
	print maxk
	print word[start:start+maxk]

bigpal("forgeeksskeegfor")	
					




