def smallestWindow(string1,string2):
	hash1={}
	hash2={}
	for i in string1:
		if i in hash1:
			hash1[i]=hash1[i]+1
			hash2[i] = hash2[i]+1
		else:
			hash1[i]=1
			hash2[i]=1
	start=0
	start_found = False
	for j in range(0,len(string2):
		if string2[j] in hash1:
			if start_found==False:
				start= j
				start_found=True
			if hash1[string2[j]]==1:
				del hash1[string2[j]]
			else:
				hash1[string2[j]]-=1
					
