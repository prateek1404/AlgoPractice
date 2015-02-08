def lexo(N,currentnum):
	if currentnum>N:
		return
	else:
		if currentnum!=0:
			print currentnum
		for i in range(0,10):
			 if i!=0 or currentnum!=0:
			 	lexo(N,currentnum*10+i)
	
lexo(input(),0)
