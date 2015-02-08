def minimumWindow(source,target):
	hashTarget = {}
	for i in target:
		if i in hashTarget:
			hashTarget[i]+=1
		else:
			hashTarget[i]=1
	hashSource = {}
	i=0
	for i in range(0,len(source)):
		if source[i] in hashTarget:
			hashSource[source[i]]+=1
			if checkAllSatisfied(hashSource,hashTarget):
				break
	window_end =i
	window_start =0
	for i in range(0,len(source)):
		if source[i] in hashTarget:
			window_start=i
			break
	min_window = window_end-window_start
	# now the interesting part begins
	window_end+=1
	found = False
	while window_end!=len(source) and found==False:
		if source[window_end]==source[window_start]:
			window_start+=1
				
		else:
			if ar[window_end] in sourceTarget:
				sourceTarget[ar[window_end]]+=1
		window_end+=1
		
		
