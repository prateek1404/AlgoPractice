def coinChange(ar,M,N):
	if M==0:
		return 1
	if M<0:
		return 0
	if M>0 and N<=0:
		return 0
	else:
		return coinChange(ar,M-ar[N-1],N)+coinChange(ar,M,N-1)

ar = map(int,raw_input().split(' '))
M = input()
print coinChange(ar,M,len(ar))
