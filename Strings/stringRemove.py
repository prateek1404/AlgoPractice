def stringRemove(string1,string2):
	hash={}
	for i in string1:
		hash[i]=True
	listOfChars = list(string2)
	newList =[]
	for i in listOfChars:
		if i not in hash:
			newList.append(i)
	return ''.join(newList)

print stringRemove('hl','hello')
