def reachable(ar,i):
	if i==len(ar)-1:
		return True
	if ar[i]==0:
		return False
	else:
		hop = ar[i]
		for j in range(1,hop+1):
			if reachable(ar,i+j):
				return True

		return False

def reachableDP(ar):
	
	
	lastFound = len(ar)-1
	for j in range(len(ar)-2,-1,-1):
		if lastFound- j <= ar[j]:
			lastFound =j

	if lastFound ==0:
		return True
	return False
print reachableDP(map(int,raw_input().split(' ')))
			
