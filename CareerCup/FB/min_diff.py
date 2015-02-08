import math
def min_diff(ar,k):
	start=0
	end = len(ar)-1
	
	while start<end:
		mid = (start+end)/2
		if mid ==0:
			return math.fabs(ar[mid]-k)
		elif mid == len(ar)-1:
			return math.fabs(ar[mid]-k)
		else:
			if ar[mid]==k:
				return 0
			else:
				if k<ar[mid] and k>ar[mid-1]:
					return min(k-ar[mid-1],ar[mid]-k)
				elif k<ar[mid] and k<ar[mid-1]:
					end = mid-1
				elif k>ar[mid] and k>ar[mid+1]:
					start = mid+1
					

K = input()
print min_diff(map(int,raw_input().split(' ')),K)
