def parseList(list,out):
	for item in list:
		if isinstance(item,int):
			out.append(item)
		else:
			parseList(item,out)

out=[]
parseList([1,[2,3],[4,[5,6]],7],out)
print ' '.join(map(str,out))
