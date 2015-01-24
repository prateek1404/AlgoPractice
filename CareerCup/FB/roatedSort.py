def detectPivot(ar):
	found=False
	foundValue=-1
	temp= ar[0]
	for i in range(1,len(ar)):
		if temp>ar[i]:
			
