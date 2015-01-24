import sys
def findNumber(Sum,ar,k,count):
	#print "Sum= ",Sum,"K",k, "ar[k] =",ar[k]
	global minCount
	if Sum==0:
		return 1
	if k==0:
		if ar[k]==Sum:
			return 1
		else:
			return sys.maxint
	else:
		if Sum==ar[k]:
	#		print "returning 1"
			return 1
		count2=sys.maxint
		count3 = sys.maxint
		count1= sys.maxint
		if Sum>ar[k]:
			count2 = 1+findNumber(Sum-ar[k],ar,k,count+1)
			count3=  1+findNumber(Sum-ar[k],ar,k-1,count+1)
		count1 = findNumber(Sum,ar,k-1,count)
		ans =  min(count1,count2,count3)
		return ans

def DPSolve(ar,Sum):
	dp =[[sys.maxint]*len(ar) for i in range(0,Sum+1)]

ar=[2,3,5]
ans = findNumber(int(sys.argv[1]),ar,len(ar)-1,0)
print ans
