def triplet(ar,count):
	if count==3:
		print ar[:3]
	else:
		for i in range(count,len(ar)):
			swap(ar,count,i)
			triplet(ar,count+1)
			swap(ar,count,i)

def swap(ar,a,b):
	temp =ar[a]
	ar[a] = ar[b]
	ar[b] = temp

triplet(map(int,raw_input().split(' ')),0)
			
	
