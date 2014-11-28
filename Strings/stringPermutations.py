def printAllPermutations(string):
	permList=[]
	if len(string)==0:
		permList.append('')
		return permList
	charList = list(string)
	for i in range(0,len(string)):
		charList.remove(string[i])
		for k in printAllPermutations(''.join(charList)):
 			permList.append(string[i]+k)
		charList.insert(i,string[i])
	return permList

ar= printAllPermutations("hello")
print len(ar)
print ar
