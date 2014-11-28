def areRotations(string1,string2):
	areRotations=False
	for i in range(0,len(string1)):
		testString = string1[i:]+string1[:i]
		if testString == string2:
			print 'found'
			areRotations= True
			break
		
	return areRotations

print areRotations('hello','lhoel')
