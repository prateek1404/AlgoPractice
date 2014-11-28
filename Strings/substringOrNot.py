def substring(string1,string2):
	k=0
	isSub= False
	if len(string1)==0:
		return True
	if len(string2)==0:
		return False
	for i in range(0,len(string2)):
		if string2[i]==string1[k]:
			print "match found, now matching"
			print string1[k+1:]
			print string2[i+1:]
			
			isSub=substring(string1[k+1:],string2[i+1:])
	return isSub

print substring("hl","hello")
