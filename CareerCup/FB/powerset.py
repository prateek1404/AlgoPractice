power_set=[[]]
def powerset(set):
	bit_array =[False for i in range(0,len(set))]
	print bit_array
	generate(set,bit_array,0)
	
def generate(set,bit_array,count):
	if count==len(set):	
		return
	else:
		bit_array[count]=True
		printSet(set,bit_array)
		generate(set,bit_array,count+1)
		bit_array[count]=False
		generate(set,bit_array,count+1)

def printSet(set,bit_array):
	sets=[]
	for i in range(0,len(bit_array)):
		if bit_array[i]==True:
			sets.append(set[i])
	if len(sets)!=0:
		power_set.append(sets)

set=[1,2,3]
powerset(set)
print power_set
	
