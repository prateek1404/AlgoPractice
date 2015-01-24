def justify(text,limit):
	wordlist = text.split(" ")
	doPerLine(wordlist,limit)
	
def addSpaces(text,limit):
	text = text.strip()	
	spacesCount = limit-len(text)
	#print "length=",len(text)
	#print "spaceCount", spacesCount
	list = text.split(" ")
	nwords = len(list)
	nspaces = spacesCount/(nwords-1)
	#print "space per word=", nspaces
	remaining = spacesCount%(nwords-1)
	#print "remaining=", remaining
	spaceString= ""
	for i in range(0,nspaces):
		spaceString+=" "
	i=0
	while spacesCount>0 and i<len(list)-1:
		list[i] = list[i]+spaceString
		spacesCount-=nspaces
		if remaining!=0:
			list[i] = list[i]+" "
			remaining = remaining-1
			spacesCount-=1
		i+=1
		 
	return (" ").join(list)

def doPerLine(list,limit):
	#print list
	if len(list)==0:
		return
	else:
		sum=0;
		lineBuild=""
		for i in range(0,len(list)):
			if len(lineBuild)+len(list[i])+1>limit:
				lineBuild=lineBuild.strip()
				line= addSpaces(lineBuild,limit)
				print line
				if(i==len(list)-1):
					lineBuild=list[i]
				break;
			else:
				lineBuild=lineBuild+" "+list[i]
				sum = len(lineBuild)
		if i !=len(list)-1:
			doPerLine(list[i:],limit)
		else:
			print lineBuild.strip()			
			return


justify("Hello mister how do you do...bahenchod chutiye ho gaye ho kaaa. Prateek is an idiot ok. Yes you are fucking right about this. He does not know anything. Its sad but thats the truth. Is this code even working or is it going to break.What does he think of himself",25)
