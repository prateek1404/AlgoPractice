import sys
def multiply(M,N):	
	Sum=0
	while N!=0:
		if N&1==1:
			Sum+=M
			print Sum
		N= N>>1
		M= M<<1

multiply(int(sys.argv[1]),int(sys.argv[2]))
			
