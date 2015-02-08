import math
def sqrt(N):
	start=float(0)
	end =float(N)
	mid = end/2
	
	while start+0.001<end:
		mid = (start+end)/2.0
		if N>mid*mid:
			start = mid
		else:
			end = mid
	
	print mid*mid

sqrt(input())
