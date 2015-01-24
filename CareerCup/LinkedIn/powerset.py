import math
def powerset(ar):
	powerset=[]
	for i in range(0,int(math.pow(2,len(ar)))):
		set = []
		num =i 
		for j in range(0,len(ar)):
			if num & 1==1:
				set.append(ar[j])
			num= num>>1
		powerset.append(set) 
	return powerset

ps=powerset(list("abc"))
print ps
