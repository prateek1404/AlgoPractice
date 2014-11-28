def checkInterLeaving(string1,string2,string3):
	k=0;
	l=0
	for i in range(0,len(string3)):
		found = False
		if k<len(string1):
			if string3[i]==string1[k]:
				k+=1
				found = True
				print "found from string1"
		if found ==False and l<len(string2):
			if string3[i]==string2[l]:
				l+=1
				found=True
				print "found from string2"
		if found==False:
			break
	if i== len(string3)-1 and k == len(string1) and l == len(string2):
		return True
	return False

print checkInterLeaving("abe","cedfe","abcedefe")		
