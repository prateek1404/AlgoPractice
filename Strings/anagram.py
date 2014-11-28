def mergeSort(string1):
	if len(string1)==1 or len(string1)==0:
		return string1
	mid = len(string1)/2
	str1= mergeSort(string1[:mid])
	str2 = mergeSort(string1[mid:])
	str3= merge(str1,str2)
	return str3

def merge(str1,str2):
	ar1= list(str1)
	ar2= list(str2)
	len1= len(ar1)
	len2 = len(ar2)
	i=0
	j=0
	ar3=[]
	while i<len1 and j < len2:
		if ar1[i] < ar2[j]:
			ar3.append(ar1[i])
			i+=1
		else:
			ar3.append(ar2[j])
			j+=1
	if i <len1:
		while i<len1:
			ar3.append(ar1[i])
			i+=1
	if j < len2:
		while j <len2:
			ar3.append(ar2[j])
			j+=1
	return ''.join(ar3)		
	

def anagram(string1,string2):
	str1= mergeSort(string1)
	str2= mergeSort(string2)
	print str1
	print str2
	if str1==str2:
		print "anagram"
	else:
		print "not anagram"
	

anagram("abcd","dcab")
