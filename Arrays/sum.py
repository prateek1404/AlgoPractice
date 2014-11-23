
def mergeSort(ar):
	if len(ar)==1:
		return ar
	length= len(ar)
	#print length
	mid = length/2
	ar1= mergeSort(ar[:mid])
	print "ar1 "+str(ar1)
	ar2= mergeSort(ar[mid:])
	print "ar2 "+str(ar2)
	ar3= merge(ar1,ar2)
	print "ar3="+str(ar3)
	return ar3

def merge(ar1,ar2):
	len1 = len(ar1)
	len2 = len(ar2)
	i=0;
	j=0;
	ar3=[]
	while(i<len1 and j<len2):
		print i
		print j
		if ar1[i]<ar2[j]:
			ar3.append(ar1[i])
			i+=1
		else:
			ar3.append(ar2[j])
			j+=1
	if i <len1:
		while i!=len1:
			ar3.append(ar1[i])
			i+=1
	if j <=len2-1:
		while j!=len2:
			ar3.append(ar2[j])
			j+=1
	return ar3


print "Enter number of integers"
N= input()
ar=[]
while N>0:
        ar.append(input())
        N= N-1
print "Enter the sum"
sum = input()
print ar
ar= mergeSort(ar)
print ar
i=0;
j=len(ar)-1

