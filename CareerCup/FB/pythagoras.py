#http://www.careercup.com/question?id=5767787551129600
import sys
def sumOfSquares(N):
	N1= N**(0.5)
	i=1
	j=int(N1)
	while(i<=j):
		sum = i**2+j**2
		if sum==N:
			print i
			print j
			i=i+1
			j=j-1
		elif sum>N:
			j=j-1
		else:
			i = i+1
		
sumOfSquares(int(sys.argv[1]))	
