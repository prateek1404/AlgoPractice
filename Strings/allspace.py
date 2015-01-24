def allspace(word,i):
	if i==len(word)-1:
		print word
		return
	aword = word[:i+1]+" "+word[i+1:]
	allspace(aword,i+2)
	allspace(word,i+1)
	



word = raw_input()
allspace(word,0)











