def nonRepeatingChar(string):
	hash={}
	for i in range(0,len(string)):
		if string[i] in hash:
			hash[string[i]]+=1
		else:
			hash[string[i]]=1
	for i in range(0,len(string)):
		if hash[string[i]]==1:
			print string[i]
			break

nonRepeatingChar('hellohe')	
