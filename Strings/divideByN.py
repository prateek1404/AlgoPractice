def divideByN(string,N):
	length = len(string)
	part_length = (length/N)+1
	startIndex = 0
	endIndex = part_length-1
	stringArray=[]
	while startIndex<len(string):
		if endIndex>len(string):
			stringArray.append(string[startIndex:])
		else:
			stringArray.append(string[startIndex:endIndex+1])
			startIndex = endIndex+1
			endIndex = endIndex + part_length
	print stringArray
	
divideByN('hellohowareyoudoing',4)
