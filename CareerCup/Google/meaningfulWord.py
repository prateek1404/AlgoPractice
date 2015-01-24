import sys
dict={}
dict['hello']=0
dict['hi']=0
dict['how']=0
dict['are']=0


def cost(word,i,j):
	#print word[i:j+1]
	if word[i:j+1] in dict:
		return 0
	else:
		return sys.maxint

def solveByDP(word):
	dp= [0]*(len(word)+1)
	dp[len(word)]=1
	dp[len(word)-1]=0
	for i in range(len(word)-2,-1,-1):
		min = sys.maxint
		minj=i
		for j in range(i,len(word)):
			if cost(word,i,j)==0:
				min = dp[j]+cost(word,i+1,j)
				minj= j
				dp[i]=1
		print word[i:minj+1]
	print dp
	prev =0
	for i in range(1,len(dp)):
		if dp[i]==1:
			print word[prev:i]
			prev = i				
		
				

word= "hellohiarehow"
#DP = [None]*len(word)
#cost= DP(word,0)
solveByDP(word)
