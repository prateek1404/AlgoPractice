powerSet=[]
def powerset(ar):
	bitArray = []
	for i in range(0,len(ar)):
		bitArray.append(False)
	generate(ar,bitArray,0)

def generate(ar,bitArray,count):
	if count== len(ar):
		return
	bitArray[count]=True
	printSet(ar,bitArray)
	generate(ar,bitArray,count+1)
	bitArray[count]= False
	generate(ar,bitArray,count+1)
	

def printSet(ar,bitArray):
	print bitArray
	arr=[]
	for i in range(0,len(ar)):
		if bitArray[i] == True:
			arr.append(ar[i])
	powerSet.append(arr)

ar =[1,67,45,63,4]
powerSet.append([])
powerset(ar)	
print powerSet
print len(powerSet)
