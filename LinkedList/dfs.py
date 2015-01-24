N=0
M=0
def isReachable(ar,i,j):
	print i,j
	global N
	global M
	if i==N-1 and j==M-1:
		print i,j
		return True
	if i>=N:
		return False
	if j>=M:
		return False
	if ar[i][j]==-1:
		return False
	if isReachable(ar,i+1,j)==True or isReachable(ar,i,j+1) ==True:
		print i,j
		return True
	else:
		return False

ar =[[0]*10]*10
print ar
N = 10
M=10
ar[9][8]=-1
#ar[8][9]=-1
print isReachable(ar,0,0)
	


