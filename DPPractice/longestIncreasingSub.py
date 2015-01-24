def longest_increasing_subsequence(ar,k):
	if k==1:
		return 1		
	max = 1	
	for i in range(1,k):
		print "in loop"
		if ar[i]<ar[k]:
			long =longest_increasing_subsequence(ar,i)
			if long>max:
				max = long+1
			
	return max		 




ar1 = map(int,raw_input().split(" "))
print longest_increasing_subsequence(ar1,len(ar1)-1)
