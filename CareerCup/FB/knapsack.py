def knapsack(val,wts,W,i):
	if i==0:
		if W>=wts[0]:
			return val[0]
		else:
			return 0
	if W==0:
		return 0
	
	if W<wts[i]:
		return knapsack(val,wts,W,i-1)
	else:
		return max(knapsack(val,wts,W,i-1),val[i]+knapsack(val,wts,W-wts[i],i-1))


val =[1,2,3,4,5,6,7,8]
wts= [1,2,3,4,5,6,7,8]
print val
print wts
W= input()
print knapsack(val,wts,W,len(val)-1)
