def validParen(word,lcount,rcount):
	if lcount==0 and rcount==0:
		print word
	else:
		if lcount>rcount:
			return
		else:
			if lcount>0:
				validParen(word+"(",lcount-1,rcount)
			if rcount>0:
				validParen(word+")",lcount,rcount-1)


N = input()
validParen("",N,N)
