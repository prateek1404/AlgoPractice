def binary_search(ar,key):
	
	start =0
	end = len(ar)-1
	while start<=end:
		mid = start+end/2
		if ar[mid]==key:
			return mid
		else:
			if ar[mid]<key:
				start = mid+1
			else:
				end = mid-1
	
	return -1

key = input()
print binary_search(map(int,raw_input().split(' ')),key)
