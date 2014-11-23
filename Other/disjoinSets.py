#http://www.geeksforgeeks.org/check-two-given-sets-disjoint/

def disjoinSets(set1,set2):
	hash={}
	isDisjoint=True
	for i in set1:
		hash[i]=True
	for j in set2:
		if j in hash:
			isDisjoint=False
			break
	return isDisjoint

set1=[1,2,3,4,5,6]
set2=[7,8,9,10]
print disjoinSets(set1,set2)
		
