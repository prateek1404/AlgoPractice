def allPerm(word):
	if len(word)==1:
		return word
	sets=[]
	for i in range(0,len(word)):
		sets_rest = allPerm(word[:i]+word[i+1:])
		for set in sets_rest:
			sets.append(word[i]+set)
			
	return sets

sets= allPerm("helo")
print sets
print len(sets)
