def move(ar):
	index =0
	
	for i in range(0,len(ar)):
		if ar[i]!=0:
			ar[index] = ar[i]
			index+=1
		
	for j in range(index,len(ar)):
		ar[j]=0
	print ar

move(map(int,raw_input().split(' ')))
		
