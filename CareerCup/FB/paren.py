def allPermutation(N,buffer,leftCount,rightCount):
	if leftCount==N and rightCount==N:
		print buffer
	else:
		if rightCount>leftCount:
			return
		else:
			if leftCount>N:
				return
			if rightCount>N:
				return
			allPermutation(N,buffer+"(",leftCount+1,rightCount)
			allPermutation(N,buffer+")",leftCount,rightCount+1)


N = input()
buffer=""
allPermutation(N,buffer,0,0)
