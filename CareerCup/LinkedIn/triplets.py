def triplets(ar,start,count,k):
	if count==0:
		if sorted(ar[:k]) == ar[:k]:
			print ar[:k]
	else:
		for i in range(start,len(ar)):
			swap(ar,start,i)
			triplets(ar,start+1,count-1,k)
			swap(ar,start,i)

def swap(ar,a,b):
	temp =ar[a]
	ar[a]= ar[b]
	ar[b] =temp

triplets([1,2,2,4,5],0,3,3)
