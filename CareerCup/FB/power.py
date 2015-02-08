import math
hash ={}
def power(set):
	for i in range(0,int(math.pow(2,len(set)))):
		printset(set,i)

def printset(set,i):
	j=0
	result =[]
	while j!=len(set):
		if i & (1<<j)==(1<<j):
			result.append(set[j])
		j+=1
	print result

power(map(int,raw_input().split(' ')))
