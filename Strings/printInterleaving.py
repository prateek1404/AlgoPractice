def printInterLeaves(string1,string2,string3):
	if len(string1)==0 and len(string2)==0:
		print string3
	else:
		if(len(string1)>0):
			printInterLeaves(string1[1:],string2,string3+string1[0])
		if(len(string2)>0):
			printInterLeaves(string1,string2[1:],string3+string2[0])

printInterLeaves("ab","cd","")	
