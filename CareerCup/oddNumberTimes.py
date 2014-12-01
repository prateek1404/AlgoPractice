def oddNumberTimes(ar):
	xorResult=0
	for i in ar:
		xorResult=xorResult^i
	print xorResult

oddNumberTimes([1,1,2,2,3,3,4,5,5,6,6,7,7,8,8])
