def getSets(ar,count):
	if count==1:
		sets=[]
		for i in range(0,len(ar)):
			set = []
			set.append(ar[i])
			sets.append(set)
		return sets
	else:
		sets=[]
		print "sets",sets
		for i in range(0,len(ar)):
				temp =ar[i]
				temp = ar.pop(i)
				setLess = getSets(ar,count-1)	
				print len(setLess)
				print setLess
				for set in setLess:
					a = set[:]
					a.append(temp)
					print "appending", a
					sets.append(a)
				ar.insert(i,temp)
		return sets

ans =  getSets([1,2,3,4],3)
print ans

