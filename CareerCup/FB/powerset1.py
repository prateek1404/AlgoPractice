power_set=[[]]
def powerset(set):
	uniqueSet=[]
	hash={}
	repeated_set=[]
	for i in set:
		if i not in hash:
			hash[i]=1
			uniqueSet.append(i)
		else:
			if i not in repeated_set:
				repeated_set.append(i)
		
	bit_array=[False for i in range(0,len(set))]
	generate(uniqueSet,bit_array,0)
	power_set_new= power_set[:]
	for rep in repeated_set:
		for set in power_set_new:
			if rep in set:
				new_set = set[:]
				new_set.append(rep)
				power_set.append(new_set)
		

def generate(set,bit_array,count):
	if count==len(set):
		return
	else:
		bit_array[count]=True
		print_set(set,bit_array)
		generate(set,bit_array,count+1)
		bit_array[count]=False
		generate(set,bit_array,count+1)

def print_set(set,bit_array):
	set_new=[]
	for i in range(0,len(set)):
		if bit_array[i]==True:
			set_new.append(set[i])
	
	power_set.append(set_new)

powerset([1,2,2,3,4])
	
print power_set
